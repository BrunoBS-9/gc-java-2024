package aula2.exercicio1;
import java.util.Scanner;

public class NumerosPrimos {

    //Função dos números primos
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Parametros do Usuario
        System.out.println("Diga os 2 parametros para o tamanho da lista");
        System.out.print("Digite por qual número começa: ");
        int inicio = scanner.nextInt();
        System.out.print("Agora em qual acaba: ");
        int fim = scanner.nextInt();

        //Resposta
        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}