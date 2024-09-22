package Aula02.Exercicio07;

public class Operacoes {

    public int somar(int nro1, int nro2){
        return nro1 + nro2;
    }

    public int subtrair(int nro1, int nro2){
        return nro1 - nro2;
    }

    public int dividir(int nro1, int nro2){
        return nro1 / nro2;
    }

    public int multiplicar(int nro1, int nro2){
        return nro1 * nro2;
    }

    public int potenciar(int nro1, int nro2){
        return nro1 * nro1 * (nro2);
    }

    public int radicar(int nro1, int nro2){
        return nro1 * nro2;
        //provavelmente teremos que ter uma var "resultado" pq acredito que o resultado de uma raiz tambem pode ser quebrado com virgula(double), precisamos discutir o assunto.
    }

}
