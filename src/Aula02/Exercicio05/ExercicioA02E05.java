package Aula02.Exercicio05;

import java.util.Scanner;

public class ExercicioA02E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int metade;

        System.out.println("Insira uma frase ou palavra");
        String input = scan.nextLine();

        metade = input.length()/2;

        for (int i = 0; i < metade; i++) {
            System.out.print(input.charAt(i));
        }
    }
}

