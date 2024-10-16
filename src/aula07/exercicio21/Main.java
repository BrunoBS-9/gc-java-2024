package aula07.exercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga um número");
        int numero = scan.nextInt();

        try {
            if (numero < 0) {
                throw new IllegalArgumentException("O número não pode ser negativo");
            }

            System.out.println("O número é válido: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}