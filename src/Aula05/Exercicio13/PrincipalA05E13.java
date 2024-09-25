package Aula05.Exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalA05E13 {
    public static void main(String[] args) {
        ArrayList<Compra> listaCompras = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar item à lista de compras");
            System.out.println("2. Remover item da lista de compras");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Limpar o buffer após a leitura do inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scan.nextLine(); // Agora funcionará corretamente
                    System.out.print("Digite a data de validade (DD/MM/AAAA): ");
                    String dataValidade = scan.nextLine();
                    listaCompras.add(new Compra(nome, dataValidade));
                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String remover = scan.nextLine();
                    boolean removido = false;
                    for (Compra compra : listaCompras) {
                        if (compra.getNome().equalsIgnoreCase(remover)) {
                            listaCompras.remove(compra);
                            removido = true;
                            System.out.println("Item removido com sucesso!");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Item não encontrado na lista.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de Compras:");
                    for (Compra compra : listaCompras) {
                        System.out.println(compra);
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }
}