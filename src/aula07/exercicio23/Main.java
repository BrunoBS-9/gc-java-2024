package aula07.exercicio23;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Divisão iniciada diga o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("e agora o segundo número");
        int num2 = scan.nextInt();

        try {
            double resultado = dividir(num1, num2);

            System.out.println("O resultado é " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Uma exceção na execução ocorreu. A mensagem do sistema é: " + e.getMessage());
        } finally {
            System.out.println("Tentativa de operação de divisão sobre os valores "
                    + num1 + " e " + num2 + " finalizada.");
        }
    }

    public static double dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("O segundo número não pode ser 0");
        }

        return num1 / num2;
    }
}
