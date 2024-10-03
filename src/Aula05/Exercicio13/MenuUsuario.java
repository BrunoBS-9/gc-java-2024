package Aula05.Exercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Compra> listaCompras = new ArrayList<>();

        int escolha;


        System.out.println("==Lista de compra Criada==\nAdicionar item \nRemover item\nVer lista");
        escolha = scan.nextInt();

        while (escolha == 0) {
            switch (escolha) {
                case 1:
                    System.out.println("Nome do item");
                    String nome = scan.nextLine();

                    System.out.println("Data de validade:");
                    System.out.println("Dia");
                    int dia = scan.nextInt();

                    System.out.println("Mês");
                    int mes = scan.nextInt();

                    System.out.println("Ano");
                    int ano = scan.nextInt();

                    System.out.println("Qual o tipo do produto?(Comida ou Higiene");
                    String tipo = scan.nextLine();

                    LocalDate validade = LocalDate.of(dia,mes,ano);

                    Compra compra = new Compra(nome,validade,tipo);
                case 2:
                    if (listaCompras.isEmpty()){
                    System.out.println("A lista está vazia");
                    break;
                } else {
                    System.out.println(listaCompras);

                    System.out.println("Qual item gostaria de remover?");
                    String removeItem = scan.nextLine();

                    for (int i = 0; 1 < listaCompras.size(); i++) {
                        if (listaCompras.get(i).getNome().equalsIgnoreCase(removeItem)) {
                            listaCompras.remove(i);
                        }
                    }
                }
                case 3:
                    System.out.println(listaCompras);

                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("Lista finalizada");
        }
    }
}