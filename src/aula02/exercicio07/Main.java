package aula02.exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean iniciaCalculadora = true;
        int resultado = 1;

        // Adquirindo números
        int[] numeros = obterNumeros(scan);
        int num1 = numeros[0];
        int num2 = numeros[1];

        // Loop calculadora
        while (iniciaCalculadora) {
            // Menu de operações
            System.out.println();
            System.out.println("Escolha a operação que vai seguir");
            System.out.println("1- Adição" +
                    "\n2- Subtração" +
                    "\n3- Divisão" +
                    "\n4- Multiplicação" +
                    "\n5- Exponenciação" +
                    "\n6- Raiz quadrada" +
                    "\n7- Finalizar calculadora");

            // Resposta para operação
            System.out.println("Qual operação quer realizar?");
            int operacao = Integer.parseInt(scan.nextLine());
            switch (operacao) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                case 4 -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case 5 -> System.out.println(num1 + " elevado a " + num2 + " = " + (num1 ^ num2));
                case 6 -> System.out.println("Raiz quadrada de " + num1 + " = " + Math.sqrt(num1));
                case 7 -> {
                    iniciaCalculadora = false;
                    System.out.println("Calculadora finalizada");
                }
                default -> System.out.println("Opção indisponível, escolha uma opção válida");
            }
        }
    }

    private static int[] obterNumeros(Scanner scan) {
        int[] numeros = new int[2];
        System.out.println("Calculadora iniciada, digite os números da operação");
        System.out.print("Primeiro número: ");
        numeros[0] = Integer.parseInt(scan.nextLine());
        System.out.print("Segundo número: ");
        numeros[1] = Integer.parseInt(scan.nextLine());
        return numeros;
    }
}