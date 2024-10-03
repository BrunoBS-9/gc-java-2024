package Aula07.Exercicio23;

import java.util.Scanner;

public class PrincipalA07E23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primero e o segundo numero: ");
        int primeiro = scan.nextInt();
        int segundo = scan.nextInt();

        System.out.println(dividir(primeiro, segundo));
    }
    public static double dividir(int primeiro, int segundo){
        double resultado = 0;

        try{
            resultado = primeiro / segundo;

            return resultado;
        } catch(ArithmeticException e){
            System.out.println("Uma exceção na execução ocorreu. A mensagem do sistema é: " + e.getMessage());
        }
        return resultado;
    }
}
