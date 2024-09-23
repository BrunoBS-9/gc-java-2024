package Aula04.Exercicio11.MetodosPagamento;

import java.util.Random;

public class Gerador {
    public String gerarNumeroAleatorio() {
        Random random = new Random();

        // Gera o número aleatório no intervalo [100_000_000, 999_999_999] para garantir 9 dígitos
        int numeroAleatorio = 100_000_000 + random.nextInt(900_000_000);

        // Converte para String e retorna
        return String.valueOf(numeroAleatorio);
    }
}
