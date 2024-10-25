package aula07.exercicio24;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita a entrada do usuário
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();

            // Verifica se a string está nula ou vazia
            if (input == null) {
                throw new NullPointerException("A string não pode ser nula!");
            }

            // Verifica se a frase "java é fácil" está presente
            if (input.toLowerCase().contains("java é fácil")) {
                throw new CaldeiraException("A frase 'java é fácil' foi encontrada! Essa frase é proibida.");
            }

            // Converte a string para um número inteiro
            int number = Integer.parseInt(input);
            System.out.println("Número convertido com sucesso: " + number);

            // Pega um caractere numa posição específica
            System.out.print("Digite um índice para acessar um caractere da string: ");
            int index = scanner.nextInt();
            char character = input.charAt(index);
            System.out.println("Caractere na posição " + index + ": " + character);

        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não é um número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido para a string.");
        } catch (CaldeiraException e) {
            System.out.println("Erro personalizado: " + e.getMessage());
        } finally {
            System.out.println("Processamento concluído.");
            System.out.println("Por que os programadores preferem escadas ao invés de elevadores? Porque escalar é mais eficiente!");
        }
    }
}