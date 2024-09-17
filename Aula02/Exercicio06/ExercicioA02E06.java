package org.example.Aula2;

import java.util.Scanner;

public class ExercicioA02E06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma frase ou palavra");
        String input = scan.nextLine();

        for (int i = input.length(); i > 0; i--){
            System.out.print(input.charAt(i-1));
        }
    }
}
