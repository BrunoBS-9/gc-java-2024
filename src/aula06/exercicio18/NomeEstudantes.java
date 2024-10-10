package aula06.exercicio18;
import java.util.HashSet;
import java.util.Scanner;

public class NomeEstudantes {
    public static void main(String[] args) {
        HashSet<String> estudantes = new HashSet<>();
        Scanner scan = new Scanner(System.in);


        estudantes.add("Ana");
        estudantes.add("Beatriz");
        estudantes.add("Anastacio");
        estudantes.add("Dante");
        estudantes.add("Ryhan");

        boolean pertenceTurma = false;

        System.out.println("Qual aluno está procurando?");
        String alunoRequisitado = scan.nextLine();

        for (String nome : estudantes) {
            if (nome.equals(alunoRequisitado)) {
                pertenceTurma = true;
                break;
            }
        }

        if (pertenceTurma) {
            System.out.println("Este aluno pertence a turma");
        } else {
            System.out.println("Este aluno não pertence a turma");
        }
    }
}
