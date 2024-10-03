package Aula07.Exercicio22;

public class PrincipalA07E22 {
    public static void main(String[] args) {
        int entrada1 = 9;

        try{
            testa(entrada1);
            System.out.println("Deu Bom");
        } catch (ValorInvalidoException e){
            System.out.println("Deu ruim " + e.getMessage());
        }

    }

    public static void testa(int valor) throws ValorInvalidoException {
        if(valor < 10) throw new ValorInvalidoException("Erro! Valor é menor que 10");
    }
}
