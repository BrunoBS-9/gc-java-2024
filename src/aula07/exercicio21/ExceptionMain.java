package aula07.exercicio21;

import java.util.Scanner;

public class ExceptionMain extends ErroNumNegativo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga um número");
        int numero = scan.nextInt();

        try {verificarNumero(numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
