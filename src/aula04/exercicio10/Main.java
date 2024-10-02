package aula04.exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro("SILVERADO","Chevrolet",2024);
        Moto moto = new Moto("NC 750X DCT","Honda",2024);

        System.out.println("Qual seu veiculo?(carro/moto)");
        String veiculoUsuario = scanner.nextLine();

        if (veiculoUsuario.equals("moto")) {
            System.out.println("Informações da moto:\n" + moto.informacoes());
        } else if (veiculoUsuario.equals("carro")) {
            System.out.println("Informações do carro\n" + carro.informacoes());
        } else {
            System.out.println("Escolha uma opção valida");
        }
    }
}