package Aula06.Exercicio19;

import java.util.HashMap;
import java.util.Scanner;

public class PrincipalA06E18 {
    public static void main(String[] args) {
        HashMap<String, Double> alunos = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        alunos.put("Pedro Valerio", 9.0);
        alunos.put("Jean Javinha", 10.0);
        alunos.put("Jeison Javao", 10.0);

        System.out.println(alunos);

        System.out.println("Insira novo aluno:");
        String nomeNovoAluno = scan.nextLine();


        System.out.println("Insira uma nota (0 a 10):");
        double notaNovoAluno = scan.nextDouble();

        if (notaNovoAluno < 10 && notaNovoAluno > 0){
            System.out.println("Nota válida");
            alunos.put(nomeNovoAluno, notaNovoAluno);
            System.out.println(alunos);
        } else {
            System.out.println("Insira um numero entre 0 a 10");
        }
    }
}
