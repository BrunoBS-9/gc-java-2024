package aula01.exercicio02;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga uma soma");
        System.out.println("Primeiro Número:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Segundo Número:");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println("A sua soma é:");
        System.out.println(numero1 + numero2);
    }
}