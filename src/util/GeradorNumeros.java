package util;

import java.util.Random;

public class GeradorNumeros {
    Random random;
    public int[] geraNumeroInteiro(int quantidadeNumeros, int minimo, int maximo){
        return new Random().ints(quantidadeNumeros,minimo,maximo).toArray();
    }
}
