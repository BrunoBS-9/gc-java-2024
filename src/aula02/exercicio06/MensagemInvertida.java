package aula02.exercicio06;

import java.util.Scanner;

public class MensagemInvertida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga sua comida favorita");
        String resposta = scan.nextLine();

        for (int i = resposta.length(); i > 0; i--) {
            System.out.print(resposta.charAt(i - 1));
        }
        System.out.println();
        scan.close();
    }
}