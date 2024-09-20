package Aula01.Exercicio03;

import java.util.Scanner;

public class ExercicioA01E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira três números: ");
        double number1 = scan.nextInt();
        double number2 = scan.nextInt();
        double number3 = scan.nextInt();
        double maior = number1, menor = number1;
        double media = 0;

        media = (number1 + number2 + number3)/3;

        if (number2 > maior){
            maior = number2;
        } if (number3 > maior){
            maior = number3;
        }

        if (number2 < menor){
            menor = number2;
        } if (number3 < menor){
            menor = number3;
        }


        System.out.println("O maior dos números é: " + maior + "\nO menor é: "+ menor + "\nMédia é: " + media);
    }
}
