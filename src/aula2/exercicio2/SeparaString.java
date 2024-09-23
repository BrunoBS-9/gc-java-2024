package aula2.exercicio2;
import java.util.Scanner;

public class SeparaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Palavra base
        System.out.println("Diga a maior palavra que conhece");
        String maiorPalavra = scanner.nextLine();

        //separar String
        int separar = maiorPalavra.length() /2;

        //Declarar as partes
        String metade1 = maiorPalavra.substring(0, separar);
        String metade2 = maiorPalavra.substring(separar);

        System.out.println(metade1);
    }
}