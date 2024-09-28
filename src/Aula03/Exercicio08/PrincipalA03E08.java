package Aula03.Exercicio08;

import java.util.Scanner;

public class PrincipalA03E08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var listaVeiculos = new ListaAsAServiceKk();
        var fluxo = new Fluxo();

        String procura;
        double distancia = 0, valorDaViagem = 0;

        instanciaCarrosTesteAddLista(listaVeiculos);
        instanciaMotosTesteAddLista(listaVeiculos);

        int opcao = -1;

        while (opcao != 0){
            System.out.println("Selecione um dos dois tipos de veículos para calcular o custo por distância ou cadastrar novo veículo\n0 - Sair \n1 - Carro \n2 - Moto \n3 - Cadastrar novo veículo");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escreva o nome de um dos Carros");
                    for (Veiculo veiculo : listaVeiculos.getVeiculosLista()){
                        if(veiculo instanceof Carro){
                            System.out.print(veiculo.getModelo() + ", ");
                        }
                    }
                    System.out.println();

                    procura = scan.nextLine();

                    if(fluxo.verificaEntrada(procura)){
                        fluxo.verificaEntrada(procura);
                        Carro carroEncontrado = (Carro) listaVeiculos.procurarVeiculoNome(procura);
                        System.out.println("Carro encontrado: " + carroEncontrado.toString());

                        System.out.println("Qual a distancia em quilometros que deseja calcular o valor?");
                        distancia = scan.nextDouble();

                        valorDaViagem = carroEncontrado.calcularCustoViagem(distancia);

                        fluxo.mostraResultado(valorDaViagem);
                    } else {
                        System.out.println("**Insira ao menos 3 letras**");
                    }
                    break;
                case 2:
                    System.out.println("Escreva o nome de um dos Carros");
                    for (Veiculo veiculo : listaVeiculos.getVeiculosLista()){
                        if(veiculo instanceof Moto){
                            System.out.print(veiculo.getModelo() + ", ");
                        }
                    }
                    System.out.println();

                    procura = scan.nextLine();

                    if(fluxo.verificaEntrada(procura)){
                        Moto motoEncontrado = (Moto) listaVeiculos.procurarVeiculoNome(procura);
                        System.out.println("Moto encontrada: " + motoEncontrado.toString());

                        System.out.println("Qual a distancia em quilometros que deseja calcular o valor?");
                        distancia = scan.nextDouble();

                        valorDaViagem = motoEncontrado.calcularCustoViagem(distancia);

                        fluxo.mostraResultado(valorDaViagem);
                    } else{
                        System.out.println("**Insira ao menos 3 letras**");
                    }
                    break;
                case 3:
                    System.out.println("Cadastrar carro(1) ou moto(2)?");
                    int cadastrarOpcao = scan.nextInt();
                    scan.nextLine();

                    if(cadastrarOpcao == 1){
                        String marca, modelo;
                        int ano;

                        fluxo.pedeMarca(TipoVeiculo.CARRO);
                        marca = scan.nextLine();
                        fluxo.pedeModelo(TipoVeiculo.CARRO);
                        modelo = scan.nextLine();
                        fluxo.pedeAno(TipoVeiculo.CARRO);
                        ano = scan.nextInt();

                        var novoCarro = new Carro(marca, modelo, ano);
                        listaVeiculos.adicionarVeiculoLista(novoCarro);
                    } else if (cadastrarOpcao == 2){
                        String marca, modelo;
                        int ano;

                        fluxo.pedeMarca(TipoVeiculo.MOTO);
                        marca = scan.nextLine();
                        fluxo.pedeModelo(TipoVeiculo.MOTO);
                        modelo = scan.nextLine();
                        fluxo.pedeAno(TipoVeiculo.MOTO);
                        ano = scan.nextInt();

                        var novaMoto = new Moto(marca, modelo, ano);
                        listaVeiculos.adicionarVeiculoLista(novaMoto);
                    } else{
                        fluxo.mensagemOpcaoInvalida();
                    }
                    break;
                default:
                    fluxo.mensagemOpcaoInvalida();
                    break;
            }
        }
    }

    public static void instanciaCarrosTesteAddLista(ListaAsAServiceKk listaVeiculos){
        Carro gol = new Carro("Volkswagen", "Gol", 2008 );
        Carro uno = new Carro("Fiat", "Uno", 2003 );
        Carro onix = new Carro("Chevrolet", "Onix", 2020 );
        Carro hb20 = new Carro("Hyundai", "HB20", 2021 );
        Carro impreza = new Carro("Subaru", "Impreza", 2021 );

        listaVeiculos.adicionarVeiculoLista(gol);
        listaVeiculos.adicionarVeiculoLista(uno);
        listaVeiculos.adicionarVeiculoLista(onix);
        listaVeiculos.adicionarVeiculoLista(hb20);
        listaVeiculos.adicionarVeiculoLista(impreza);
    }

    public static void instanciaMotosTesteAddLista(ListaAsAServiceKk listaVeiculos){
        Moto mt03 = new Moto("Yamaha", "MT03", 2021);
        Moto dominar400 = new Moto("Bajaj", "Dominar 400", 2022);
        Moto yzfr15 = new Moto("Yamaha", "YZF R15", 2023);
        Moto s1000rr = new Moto("Bmw", "S1000 RR", 2009);

        listaVeiculos.adicionarVeiculoLista(mt03);
        listaVeiculos.adicionarVeiculoLista(dominar400);
        listaVeiculos.adicionarVeiculoLista(yzfr15);
        listaVeiculos.adicionarVeiculoLista(s1000rr);
    }
}