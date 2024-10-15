package aula07.exercicio21;
import java.util.Scanner;

public class ErroNumNegativo {
    public static void verificarNumero(int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo");
        }
            System.out.println("O número é válido: " + numero);
    }
}