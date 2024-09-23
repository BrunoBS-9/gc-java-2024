package Aula03.Exercicio09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private final String nome;
    private final String cpf;
    private final String identificadorConta;
    private final String nomeDoBanco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;
    private boolean estaAtiva;
    private List<String> historicoTransacoes;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String nomeDoBanco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.nomeDoBanco = nomeDoBanco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.estaAtiva = true;
        this.historicoTransacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarEndereco(String novoendereco) {
        this.endereco = endereco;
    }

    public void sacar(double saque) {
        if(verificaEstaAberto()){
            if(estaAtiva) {
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque efetuado com sucesso!");
                    System.out.println("Seu saldo atual agora é:");
                    System.out.println("$ " + saldo);

                    salvarSaque(saque);
                } else {
                    System.out.println("Saque inválido");
                }
            } else {
                System.out.println("A conta se encontra inativa");
            }
        } else {
            System.out.println("O banco está fechado, procure efetuar operações entre 8:00hs e 19:00hs");
        }
    }

    public void depositar(double deposito){
        if(verificaEstaAberto()){
            if(estaAtiva) {
                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println("Você recebeu um depósito em sua conta");
                    System.out.println("Seu saldo atual agora é:");
                    System.out.println("$ " + saldo);

                    salvarDeposito(deposito);
                } else {
                    System.out.println("Saque inválido");
                }
            }else{
                System.out.println("A conta se encontra inativa");
            }
        }else {
            System.out.println("O banco está fechado, procure efetuar operações entre 8:00hs e 19:00hs");
        }
    }

    public double pix(double pix, ContaBancaria contaDestino){
        if(verificaEstaAberto()){
            if(estaAtiva) {
                if (pix <= saldo) {
                    saldo -= pix;
                    System.out.println("Pix feito com sucesso!");
                    System.out.println("Seu saldo atual agora é:");
                    System.out.println("$ " + saldo);

                    salvarPix(saldo, contaDestino.nome);
                    return saldo;
                } else {
                    System.out.println("impossivel efetuar o pix");
                }
            }else{
                System.out.println("A conta se encontra inativa");
            }
        }
        else {
            System.out.println("O banco está fechado, procure efetuar operações entre 8:00hs e 19:00hs");
        }
        return saldo;  // Retorna saldo original se saque n válido
    }

    public void fecharConta(){
        estaAtiva = false;
        saldo = 0;
    }

    public void transferencia(ContaBancaria destino, double valor){
        if(verificaEstaAberto()){
            if(estaAtiva){
                if (valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Transferência feito com sucesso!");
                    System.out.println("Seu saldo atual agora é:");
                    System.out.println("$ " + saldo);

                    salvarTransferencia(saldo, destino.nome);
                } else {
                    System.out.println("impossivel efetuar o deposito");
                }
            }else {
                System.out.println("Conta está inativa");
            }
        }else {
            System.out.println("O banco está fechado, procure efetuar operações entre 8:00hs e 19:00hs");
        }
    }

    public boolean verificaEstaAberto(){
        LocalTime horaAbertura = LocalTime.of(8, 0,0);
        LocalTime horaFechamento = LocalTime.of(19,0,0);
        LocalDate dataAtual = LocalDate.now();
        LocalTime horarioAtual = LocalTime.now();

        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();

        if(diaDaSemana != DayOfWeek.SATURDAY && diaDaSemana != DayOfWeek.SUNDAY){
            if(horarioAtual.isAfter(horaAbertura) && horarioAtual.isBefore(horaFechamento)){
                return true;
            }
        }

        return false;
    }

    public void verificarSaldo(){
        System.out.println("Seu saldo é: " + saldo);
    }

    public String retornaHorario(){
        LocalTime horarioAtual = LocalTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horarioAtual.format(formatador);

        return horaFormatada;
    }

    public void verificarInformacoes(){
        String nome = "", cpf = "", identificadorConta = "", nomeDoBanco = "", endereco = "";
        double saldo = 0;
        System.out.println("=================================");
        System.out.printf("""
                Dados da Conta de %s
                CPF: %s
                Identificador de Conta: %s
                Nome Do Banco: %s
                Endereco: %s
                Saldo na Conta: %.2f
                
                """, this.nome, this.cpf, this.identificadorConta, this.nomeDoBanco, this.endereco, this.saldo);
        System.out.println("=================================");
    }

    public void adicionarTransacaoHistorico(String toStringTransacao){
        historicoTransacoes.add(toStringTransacao);
    }
    public void exibirTodasTransacoes(){
        System.out.println("===================================");
        System.out.println("Histórico de transações de "+ nome +":");
        for (String historico : historicoTransacoes){
            System.out.print(historico + " \n");
        }
        System.out.println("===================================");
    }

    public void salvarDeposito(double deposito){
        String transacao = String.format("Depósito de R$ %.2f realizado com sucesso as %s. Saldo: R$ %.2f", deposito, retornaHorario(), saldo);
        adicionarTransacaoHistorico(transacao);
    }

    public void salvarSaque(double saque){
        String transacao = String.format("Saque de R$ %.2f realizado com sucesso as %s. Saldo: R$ %.2f",saque, retornaHorario(), saldo);
        adicionarTransacaoHistorico(transacao);
    }
    public void salvarPix(double valorPix, String contaDestinoNome){
        String transacao = String.format("Pix de R$ %.2f para %s realizado com sucesso as %s. Saldo: R$ %.2f",valorPix, contaDestinoNome, retornaHorario(), saldo);
        adicionarTransacaoHistorico(transacao);
    }

    public void salvarTransferencia(double valorTransferencia, String contaDestinoNome){
        String transacao = String.format("Transferência de R$ %.2f para %s realizado com sucesso as %s. Saldo: R$ %.2f",valorTransferencia, contaDestinoNome, retornaHorario(), saldo);
        adicionarTransacaoHistorico(transacao);
    }
}
