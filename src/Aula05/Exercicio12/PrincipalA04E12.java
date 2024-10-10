package Aula05.Exercicio12;

import java.util.Scanner;

public class PrincipalA04E12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numeros[] = new double[5];
        double entrada;
        double media = 0;
        double soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Insira um numero:");
            entrada = scan.nextDouble();
            numeros[i] = entrada;
        }

        for (int i = 0; i < 5; i++){
            soma += numeros[i];
        }
        media =  soma / numeros.length;
        System.out.println("Media dos números: " + media + "\n"+
                "Soma dos 5 números: " + soma);
    }
}
