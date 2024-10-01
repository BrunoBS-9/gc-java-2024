package Aula06.Exercicio17;


import util.GeradorNumeros;

import java.util.HashSet;

public class PrincipalA06E17 {
    public static void main(String[] args) {
        GeradorNumeros geradorNumeros = new GeradorNumeros();
        var numeroNaoRept = new HashSet<Integer>();

        int[] numerosArray;
        numerosArray = geradorNumeros.geraNumeroInteiro(10,0,10);

        System.out.println("Numeros gerados: ");
        for(int numero : numerosArray){
            System.out.print(numero + " ");
            numeroNaoRept.add(numero);
        }

        System.out.println();
        System.out.println();
        System.out.println("HashSet dos numeros: ");
        for(int numero : numeroNaoRept){
            System.out.print(numero + " ");
        }
    }
}
