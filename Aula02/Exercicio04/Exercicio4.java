package org.example.Aula2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o início do Intervalo:");
        int inicio = scan.nextInt();
        System.out.println("Insira o fim do Intervalo:");
        int fim = scan.nextInt();

        System.out.println("Os números primos entre "+ inicio + " até " + fim + " são:");
        for(int i = inicio; i <= fim; i++){
            if(ePrimo(i)){
                System.out.print(i + ", ");
            };
        }
    }

    public static boolean ePrimo(int numero) {
        if(numero <= 1){
            return false;
        }

        if(numero == 2){
            return true;
        }

        if(numero % 2 == 0){
            return false;
        }

        for(int i = 3; i * i <= numero; i += 2){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
