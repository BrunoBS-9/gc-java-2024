import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Diga uma soma");
    System.out.println("Primeiro Número:");
    int numero1 = Integer.parseInt(scanner.nextLine());
    System.out.println("Segundo Número:");
    int numero2 = Integer.parseInt(scanner.nextLine());

    System.out.println(STR."A sua soma é \{numero1 + numero2}");
}