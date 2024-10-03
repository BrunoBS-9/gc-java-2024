package Aula07.Exercicio21;

import java.util.Scanner;

public class PrincipalA07E21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Entre um número positivo");
            int numeroInserido = scan.nextInt();
            verificaNegativo(numeroInserido);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void verificaNegativo(int numero) throws IllegalArgumentException{
        if(numero < 0) throw new IllegalArgumentException("Operacao invalida insira um numero positivo");
    }
}
