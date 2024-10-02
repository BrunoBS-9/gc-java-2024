package aula01.exercicio01;

import java.util.Scanner;

public class NomeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Prazer " + nome);
    }
}
