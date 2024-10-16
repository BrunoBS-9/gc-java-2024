package aula07.exercicio23;

public class ErroDivisao {
    public static void dividir(int num1,int num2) {

        if (num2 == 0) {
            throw new  ArithmeticException("O segundo número não pode ser 0");
        }
            System.out.println("O resultado é " + num1/num2);
    }
}