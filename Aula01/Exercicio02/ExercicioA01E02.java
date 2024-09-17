package org.example.Aula1;

import java.util.Scanner;

public class ExercicioA01E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira dois números: ");
        double number1 = scan.nextInt();
        double number2 = scan.nextInt();
        double soma = number1 + number2;

        System.out.println("A soma dos números é: " + soma);
    }
}
