package aula01.exercicio03;

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
        int maiorNumero = Math.max(numero1, numero2);
        maiorNumero = Math.max(maiorNumero, numero3);
        int menorNumero = Math.min(numero1, numero2);
        menorNumero = Math.min(menorNumero, numero3);
        int media = (numero1 + numero2 + numero3) / 3;

        //Respondendo
        System.out.println("O maior número é " + maiorNumero);
        System.out.println("O menor número é " + menorNumero);
        System.out.println("Sua média aproximada é " + media);

    }
}