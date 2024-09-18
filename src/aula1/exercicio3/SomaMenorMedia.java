package aula1.exercicio3;

import java.util.Scanner;

public class SomaMenorMedia {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        //Pedindo os números
        System.out.println("Diga 3 números");
        System.out.println("Primeiro Número:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Segundo Número:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Terceiro Número:");
        int numero3 = Integer.parseInt(scanner.nextLine());

        //Calculos
        int menorNumero = Math.min(numero1, numero2);
        menorNumero = Math.min(menorNumero, numero3);
        int media = (numero1 + numero2 + numero3) / 2;

        //Respondendo
        System.out.println("A sua soma é " + (numero1 + numero2 + numero3));
        System.out.println("O menor número é " + menorNumero);
        System.out.println("Sua média é " + media);

    }
}