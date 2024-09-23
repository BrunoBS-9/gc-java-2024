package Aula03.Exercicio09;

import Aula03.Exercicio09.Verificadores.VerificadorDeCpf;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOpcoes {
    private List<ContaBancaria> contas = new ArrayList<>();

    public void inicioMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("====BANCO CALDEIRÍSTICO IRADO====");
        System.out.println("Já possuí conta no nosso banco?\n1-Sim 2-Não");
        int opcao = scan.nextInt();

        if(opcao == 1){
            mostrarMenu();
        } else{
            cadastrarContaBancaria();
            mostrarMenu();
        }
    }

    public void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int escolha;
        String contaEscolhida = "";
        instanciaContasTeste();

        System.out.println("Escolha a sua conta Inserindo seu identificador: (ex: 111111-11)");
        exibeTodasContas();
        contaEscolhida = scan.nextLine();

        ContaBancaria contaAtual = procurarContaIdentificador(contaEscolhida);
        System.out.println("Olá, Seja Bem vindo: "+  contaAtual.getNome() + "!\n");
        do {
            if(contaAtual == contas.get(2)){
                gianCarloMenuOpcoes();
            }else{
                mostraOpcoes();
            }

            escolha = scan.nextInt();
            scan.nextLine();

            System.out.println("Você escolheu a opção " + escolha);
            switch (escolha) {
                case 1:  // Consultar Saldo
                    contaAtual.verificarSaldo();
                    break;
                case 2:  // Fazer Saque
                    System.out.print("Informe o valor do saque: ");
                    int valorSaque = scan.nextInt();
                    scan.nextLine();
                    contaAtual.sacar(valorSaque);
                    break;
                case 3:  // Fazer Deposito
                    System.out.print("Informe do deposito: ");
                    int valorDeposito = scan.nextInt();
                    scan.nextLine();
                    contaAtual.depositar(valorDeposito);
                    break;
                case 4:  // Efetuar Pix
                    System.out.print("Informe o valor do Pix: ");
                    int valorPix = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Informe a conta destino (1 = Isáculo): ");
                    exibeTodasContas();
                    int destino = scan.nextInt();
                    scan.nextLine();
                    if (destino >= 0 && destino < contas.size()) {
                        contaAtual.pix(valorPix, contas.get(destino));
                    } else {
                        System.out.println("Conta inválida.");
                    }
                    break;
                case 5:  // Transferência Bancária
                    System.out.println("Informe o valor da transferência: ");
                    double valorTransferencia = scan.nextDouble();
                    System.out.print("Informe a conta destino (1 = Isáculo): ");
                    exibeTodasContas();
                    int contaDestinoTransf = scan.nextInt();
                    scan.nextLine();

                    if (contaDestinoTransf >= 0 && contaDestinoTransf < contas.size()) {
                        contaAtual.transferencia(contas.get(contaDestinoTransf), valorTransferencia);
                    } else {
                        System.out.println("Conta inválida.");
                    }
                    break;
                case 6:  // Informações Pessoais
                    contaAtual.verificarInformacoes();
                    break;

                case 7:  // exibir historico conta
                    contaAtual.exibirTodasTransacoes();
                    break;
                case 8:  // alterar endereço
                    System.out.println("Insira seu novo endereço: ");
                    String novoEndereco = scan.nextLine();
                    contaAtual.alterarEndereco(novoEndereco);
                    System.out.println("Seu endereço foi alterado com sucesso!");
                    break;
                case 9:  // Fechar conta
                    System.out.println("Tem certeza que deseja fechar sua conta? \n1- Sim 2- Não");
                    int escolhaFecharConta = scan.nextInt();
                    scan.nextLine();
                    if(escolhaFecharConta == 1){
                        contaAtual.fecharConta();
                        System.out.println("Fechando conta, seu saldo foi zerado.");
                    }
                    break;
                default:
                    System.out.println("Ação inválida!");
                    break;
            }
        } while (escolha != 0);
    }

    public void cadastrarContaBancaria(){
        Scanner scan = new Scanner(System.in);
        VerificadorDeCpf verificador = new VerificadorDeCpf();

        // Coletando dados do usuário
        System.out.print("Informe o nome: ");
        String nome = scan.nextLine();

        String cpf;
        while (true) {
            System.out.print("Informe o CPF: ");
            cpf = scan.nextLine();

            // Validar o CPF
            if (verificador.verificadorDeCpf(cpf)) {
                break; // CPF válido
            } else {
                System.out.println("CPF inválido. Tente novamente.");
            }
        }

        System.out.print("Informe o identificador da conta: ");
        String identificadorConta = scan.nextLine();

        System.out.print("Informe o nome do banco: ");
        String nomeDoBanco = scan.nextLine();

        System.out.print("Informe o endereço: ");
        String endereco = scan.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldo = scan.nextDouble();
        scan.nextLine(); // Limpar o buffer

        // Criando a nova conta
        ContaBancaria novaConta = new ContaBancaria(nome, cpf, identificadorConta, nomeDoBanco, endereco, saldo);
        contas.add(novaConta); // Adicionando à lista de contas

        System.out.println("Conta cadastrada com sucesso!");
    }

    public void instanciaContasTeste(){
        ContaBancaria helioFabbriccio = new ContaBancaria("Helio", "125.878.167-30", "111111-11", "Sicredi X", "Endereco123", 750);
        contas.add(helioFabbriccio);

        ContaBancaria giaculoConta = new ContaBancaria("Isáculo Careca da silva 2", "390.533.447-05", "222222-22", "Agibank", "Endereco1234", 750);
        contas.add(giaculoConta);

        ContaBancaria isaculo = new ContaBancaria("Giáculo Dornélios Pinto", "125.878.167-30", "333333-33", "Bradesco", "Endereco1235", 750);
        contas.add(isaculo);

        ContaBancaria jeanConta = new ContaBancaria("Jean Careca da silva", "789.456.123-00", "444444-44", "Nubank", "Endereco1236", 750);
        contas.add(jeanConta);
    }

    public void gianCarloMenuOpcoes(){
        System.out.println("""
                                       ⧣₊˚﹒✦₊  ⧣₊˚★⸝⸝ ⧣₊˚﹒✦₊  ⧣₊˚" +
                                "    /) /)" +
                                "  (｡•ㅅ•｡)〝₎₎ BANCO CALDEIRÍSTICO IRADO! ✦₊ ˊ˗" +
                                ". .╭∪─∪────────── ✦ ⁺." +
                                ". .┊" + "============MENU=================" +
                                ". .┊" + "----0. SAIR----------------------" +
                                ". .┊" + "----1. Consultar Saldo-----------" +
                                ". .┊" + "----2. Fazer Saque---------------" +
                                ". .┊" + "----3. Fazer Deposito------------" +
                                ". .┊" + "----4. Efetuar Pix---------------" +
                                ". .┊" + "----5. Tranferência Bancária-----" +
                                ". .┊" + "----6. Informações Pessoais------" +
                                ". .┊" + "----7. Exibir Histórico Conta----" +
                                ". .┊" + "----8. Alterar Endereço----------" +
                                ". .┊" + "----9. Fechar Conta--------------" +
                                "   ╰─────────────  ✦ ⁺." +
                                "      ⧣₊˚﹒✦₊  ⧣₊˚ ★    ⸝⸝ ⧣₊˚﹒✦₊  ⧣₊˚""");
    }

    public void mostraOpcoes(){
        System.out.println("""
        ====BANCO CALDEIRÍSTICO IRADO====
        ============MENU=================
        ----0. SAIR----------------------
        ----1. Consultar Saldo-----------
        ----2. Fazer Saque---------------
        ----3. Fazer Deposito------------
        ----4. Efetuar Pix---------------
        ----5. Tranferência Bancária-----
        ----6. Informações Pessoais------
        ----7. Exibir Historico Conta----
        ----8. Alterar Endereço----------
        ----9. Fechar Conta--------------""");
    }

    public void exibeTodasContas(){
        int contador = 0;
        for(ContaBancaria conta : contas){
            System.out.println(contador+"- "+ conta.getNome() + ", Identificador: "+ conta.getIdentificadorConta());
            contador++;
        }
    }

    public ContaBancaria procurarContaIdentificador(String identificador){
        for(ContaBancaria conta : contas){
            if(identificador.equalsIgnoreCase(conta.getIdentificadorConta())){
                return conta;
            }
        }
        return null;
    }
}

