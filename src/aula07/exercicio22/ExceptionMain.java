package aula07.exercicio22;
import java.util.Scanner;

public class ExceptionMain extends ValorInvalidoException{
    public ExceptionMain(String mensage) {
        super(mensage);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga um número");
        int numero = scan.nextInt();

        try {verificarNumero(numero);
        } catch (ValorInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
