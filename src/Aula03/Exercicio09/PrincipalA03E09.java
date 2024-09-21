package Aula03.Exercicio09;

import Aula03.Exercicio09.Verificadores.VerificadorDeCpf;

import java.time.LocalTime;
import java.util.Scanner;

public class PrincipalA03E09 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        VerificadorDeCpf verificadorDeCpf = new VerificadorDeCpf();
        ContaBancaria conta = new ContaBancaria("Helio", "042.076.270-14", "123123-12", "Bradesco", "Endereco123", 750, localTime);

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um cpf:");

        String cpf = scan.nextLine();

        System.out.println(verificadorDeCpf.verificadorDeCpf(cpf));

    }
}
