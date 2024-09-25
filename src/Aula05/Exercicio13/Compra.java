package Aula05.Exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

class Compra {
    private String nome;
    private String dataValidade;

    public Compra(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Item: " + nome + ", Validade: " + dataValidade;
    }
}