package Aula06.Exercicio18;

import java.util.HashSet;
import java.util.Scanner;

public class PrincipalA06E18 {
    public static void main(String[] args) {
        HashSet listaEstudantes = new HashSet<String>();
        Scanner scan = new Scanner(System.in);

        listaEstudantes.add("Ana");
        listaEstudantes.add("Julia");
        listaEstudantes.add("Pedro");

        System.out.println(listaEstudantes);

        System.out.println("Insira um nome para verificar:");
        String nomeEscolhido = scan.nextLine();

        if(listaEstudantes.contains(nomeEscolhido)){
            System.out.println("O nome "+ nomeEscolhido + " está presente no conjunto!");
        } else {
            System.out.println("O nome nao está incluso");
        }
        System.out.println();

    }
}
