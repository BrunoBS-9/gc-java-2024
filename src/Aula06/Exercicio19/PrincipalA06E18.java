package Aula06.Exercicio19;

import java.util.HashMap;
import java.util.Scanner;

public class PrincipalA06E18 {
    public static void main(String[] args) {
        HashMap<String, Double> alunos = new HashMap<>();
        StringSplinter divisor = new StringSplinter();
        Scanner scan = new Scanner(System.in);

        alunos.put("Pedro Valerio", 9.0);
        alunos.put("Jean Javinha", 10.0);
        alunos.put("Jeison Javao", 10.0);

        System.out.println(alunos);

        System.out.println("Insira novo aluno e nota, separados por (-):");
        String texto = scan.nextLine();
        String[] arrayString = divisor.dividirString('-', texto);

        if (arrayString.length == 2) {
            String nomeNovoAluno = divisor.removeEspacos(arrayString[0]);
            String numero = divisor.removeEspacos(arrayString[1]);
            double notaNovoAluno;

            try {
                notaNovoAluno = Double.parseDouble(numero);

                if (notaNovoAluno >= 0 && notaNovoAluno <= 10) {
                    System.out.println("Nota válida");
                    alunos.put(nomeNovoAluno, notaNovoAluno);
                    System.out.println(alunos);

                    System.out.println("Digite o nome do aluno para ver sua nota, exemplo: Ana");
                    // TODO FAZER PROCURA NOMES
                } else {
                    System.out.println("Insira um número entre 0 a 10");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nota deve ser um número.");
            }
        } else {
            System.out.println("Entrada inválida. Utilize o formato: Nome - Nota");
        }
    }
}
