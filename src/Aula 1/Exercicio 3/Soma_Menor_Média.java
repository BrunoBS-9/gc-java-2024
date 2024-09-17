import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Diga 3 números");
    System.out.println("Primeiro Número:");
    int numero1 = Integer.parseInt(scanner.nextLine());
    System.out.println("Segundo Número:");
    int numero2 = Integer.parseInt(scanner.nextLine());
    System.out.println("Terceiro Número:");
    int numero3 = Integer.parseInt(scanner.nextLine());

    System.out.println(STR."A sua soma é \{numero1 + numero2 + numero3}");
    int media = (numero1 + numero2 + numero3)/2;
    System.out.println(STR."Sua média é \{media}");

}