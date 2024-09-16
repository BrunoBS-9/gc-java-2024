package org.example.Aula2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma frase ou palavra");
        String input = scan.nextLine();

        int metade = input.length()/2;

        System.out.println(input.substring(0,metade));
    }
}
