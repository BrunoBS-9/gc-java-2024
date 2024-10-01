package Aula05.Exercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalA05E13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Compra> listaCompras = new ArrayList<>();

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("==Lista de compra Criada==\n1- Adicionar item \n2- Remover item\n3- Ver lista\n4- Finalizar lista");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Nome do item");
                    String nome = scan.nextLine();
                    nome = scan.nextLine();

                    System.out.println("Data de validade:");
                    System.out.println("Dia");
                    int dia = scan.nextInt();

                    System.out.println("Mês");
                    int mes = scan.nextInt();

                    System.out.println("Ano");
                    int ano = scan.nextInt();

                    System.out.println("Qual o tipo do produto?(Comida ou Higiene)");
                    String tipo = scan.nextLine();
                    tipo = scan.nextLine();

                    LocalDate validade = LocalDate.of(ano, mes, dia);

                    Compra compra = new Compra(nome,validade,tipo);
                    listaCompras.add(compra);
                    System.out.println("Item adicionado a lista");
                    break;
                case 2:
                    if (listaCompras.isEmpty()){
                        System.out.println("A lista está vazia");
                        break;
                    } else {
                        Collections.shuffle(listaCompras);
                        System.out.println(listaCompras);


                        System.out.println("Qual item gostaria de remover?");
                        String removeItem = scan.nextLine();
                        removeItem = scan.nextLine();

                        for (int i = 0; i < listaCompras.size(); i++) {
                            if (listaCompras.get(i).getNome().equalsIgnoreCase(removeItem)) {
                                listaCompras.remove(i);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println(listaCompras);
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        System.out.println("Lista finalizada");
    }
}