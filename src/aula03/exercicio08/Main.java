package aula03.exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro("SILVERADO","Chevrolet",2024);
        Moto moto = new Moto("NC 750X DCT","Honda",2024);

        System.out.println("Qual seu veiculo?(carro/moto)");
        String veiculoUsuario = scanner.nextLine();

        if (veiculoUsuario.equals("moto")) {
            System.out.println("O custo desta viajem vai ser " + moto.calcularCustoViagem(10) + "Km");
        } else if (veiculoUsuario.equals("carro")) {
            System.out.println("O custo desta viajem vai ser " + carro.calcularCustoViagem(10) + "Km");
        } else {
            System.out.println("Escolha uma opção valida");
        }

    }
}