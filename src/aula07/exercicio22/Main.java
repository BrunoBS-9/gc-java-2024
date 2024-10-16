package aula07.exercicio22;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga um número");
        int numero = scan.nextInt();

        try {
            verificarNumero(numero);
        } catch (ValorInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void verificarNumero(int numero) {
        if (numero <= 10) {
            throw new ValorInvalidoException("O número não pode ser menor que 10");
        }

        System.out.println("O número é válido: " + numero);
    }
}