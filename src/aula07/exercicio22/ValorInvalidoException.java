package aula07.exercicio22;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(String mensage) {super(mensage);}

    public static void verificarNumero(int numero) {
        if (numero < 10) {
            throw new ValorInvalidoException("O número não pode ser menor que 10");
        }
        System.out.println("O número é válido: " + numero);
    }
}