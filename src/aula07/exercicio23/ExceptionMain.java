package aula07.exercicio23;
import java.util.Scanner;

public class ExceptionMain extends ErroDivisao{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        System.out.println("Divisão iniciada diga o primeiro número");
        num1 = scan.nextInt();
        System.out.println("e agora o segundo número");
        num2 = scan.nextInt();


        try {dividir(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Uma exceção na execução ocorreu. A mensagem do sistema é: " + e.getMessage());
        } finally {
            System.out.println("Tentativa de operação de divisão sobre os valores " + num1 + " e " + num2 + " finalizada.");
        }

    }
}
