package aula06.exercicio20;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        char caracter;
        String palavra = "";

        Map<String, Integer> contagemPalavras = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            // Verificar se o caractere é um espaço ou se é o último caractere
            if (caracter == ' ' || i == frase.length() - 1) {
                if (i == frase.length() - 1) {
                    palavra += caracter; // Adicionar o último caractere
                }

                if (!palavra.isEmpty()) {
                    palavra = palavra.trim().toLowerCase();

                    // Reinicia HashMap
                    contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
                    palavra = "";
                }
            } else {
                // Adicionar o caractere à palavra
                palavra += caracter;
            }
        }
        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        scanner.close();
    }
}
