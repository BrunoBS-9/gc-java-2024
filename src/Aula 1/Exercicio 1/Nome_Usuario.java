import java.util.Scanner;

public class Nome_Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Prazer " + nome);
    }
}
