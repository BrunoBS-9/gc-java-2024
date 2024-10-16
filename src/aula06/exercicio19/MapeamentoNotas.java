package aula06.exercicio19;
import java.util.HashMap;
import java.util.Scanner;
import java.math.BigDecimal;


public class MapeamentoNotas {
    public static void main(String[] args) {
        HashMap<String, BigDecimal> mapaNotas = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        BigDecimal valor;


        mapaNotas.put("Ana", new BigDecimal(9));
        mapaNotas.put("Beatriz", new BigDecimal(6.8));
        mapaNotas.put("Anastacio", new BigDecimal(3.9));
        mapaNotas.put("Dante", new BigDecimal(10));
        mapaNotas.put("Ryhan", new BigDecimal(7));

        System.out.println("Nome do aluno");
        String estudante = scan.nextLine();

        String informacao = String.valueOf(mapaNotas.get(estudante));

        if (mapaNotas.containsKey(estudante)) {
            System.out.println(informacao);
        } else {
            System.out.println("Informações não encontradas, adicionar notas do aluno?(Sim ou Não)");
            String adicaoProfessor = scan.nextLine();

            switch (adicaoProfessor) {
                case "Sim":
                    System.out.println("Diga o nome e a nota do aluno");
                    String nomeAluno  = scan.nextLine();
                    String notaAluno  = scan.nextLine();

                    valor = new BigDecimal(notaAluno);

                    mapaNotas.put(nomeAluno,valor);
                    break;
                case "Não":
                    System.out.println("Verifique se o nome do aluno está correto");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }


        }
    }
}
