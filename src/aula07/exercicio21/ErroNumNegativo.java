package aula07.exercicio21;
import java.util.Scanner;

public class ErroNumNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInteiro;


        try {
            System.out.println("Diga um número inteiro:");
            numInteiro = Integer.parseInt(scan.nextLine());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
