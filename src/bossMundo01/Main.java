package bossMundo01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestaoMercenarios sistema = new GestaoMercenarios();
        Scanner scan = new Scanner(System.in);
        boolean executando = true;

        //Execução do menu
        while (executando) {
            exibirMenu();
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> {   // Cadastrar novo aventureiro
                    System.out.print("Digite o nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scan.nextInt();
                    scan.nextLine();  // Limpa o buffer
                    System.out.print("Digite a classe (Cavaleiro, Arqueiro, Mago, Assassino): ");
                    String classe = scan.nextLine();
                    System.out.print("Digite o salário base: ");
                    double salario = scan.nextDouble();
                    sistema.cadastrarAventureiro(nome, idade, classe, salario);
                }
                case 2 -> {  // Atualizar aventureiro
                    System.out.print("Digite o nome do aventureiro a ser atualizado: ");
                    String nome = scan.nextLine();
                    System.out.print("Novo nome (deixe em branco para manter): ");
                    String novoNome = scan.nextLine();
                    System.out.print("Nova idade (ou 0 para manter): ");
                    int novaIdade = scan.nextInt();
                    scan.nextLine();  // Limpa o buffer
                    System.out.print("Nova classe (ou deixe em branco para manter): ");
                    String novaClasse = scan.nextLine();
                    System.out.print("Novo salário (ou 0 para manter): ");
                    double novoSalario = scan.nextDouble();
                    sistema.atualizarAventureiro(
                            nome,
                            novoNome.isEmpty() ? null : novoNome,
                            novaIdade == 0 ? null : novaIdade,
                            novaClasse.isEmpty() ? null : novaClasse,
                            novoSalario == 0 ? null : novoSalario
                    );
                }
                case 3 -> {  // Remover aventureiro
                    System.out.print("Digite o nome do aventureiro a ser removido: ");
                    String nome = scan.nextLine();
                    sistema.removerAventureiro(nome);
                }
                case 4 -> {  // Listar aventureiros
                    sistema.listarAventureiros();
                }
                case 5 -> {  // Buscar aventureiro por nome
                    System.out.print("Digite o nome do aventureiro a ser buscado: ");
                    String nome = scan.nextLine();
                    sistema.buscarAventureiroPorNome(nome);
                }
                case 6 -> {  // Filtrar aventureiros por classe
                    System.out.print("Digite a classe (Cavaleiro, Arqueiro, Mago, Assassino): ");
                    String classe = scan.nextLine();
                    sistema.filtrarPorClasse(classe);
                }
                case 7 -> {  // Avaliar desempenho
                    System.out.print("Digite o nome do aventureiro a ser avaliado: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite a nota de desempenho (1 a 5): ");
                    int nota = scan.nextInt();
                    sistema.avaliarDesempenho(nome, nota);
                }
                case 8 -> {  // Sair
                    System.out.println("Saindo do sistema...");
                    executando = false;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scan.close();
    }

    public static void exibirMenu() {
        System.out.println("\n---- Menu de Gestão de Aventureiros ----");
        System.out.println("1. Cadastrar Aventureiro");
        System.out.println("2. Atualizar Aventureiro");
        System.out.println("3. Remover Aventureiro");
        System.out.println("4. Listar todos os Aventureiros");
        System.out.println("5. Buscar Aventureiro");
        System.out.println("6. Filtrar por Classe");
        System.out.println("7. Avaliar Desempenho de Aventureiro");
        System.out.println("8. Sair");
        System.out.print("Escolha uma opção: ");
    }
}