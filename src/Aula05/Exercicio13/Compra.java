package Aula05.Exercicio13;
import java.time.LocalDate;
import java.util.ArrayList;

class Compra {
    String nome;
    LocalDate validade;
    String tipo;

    public Compra(String nome,LocalDate validade,String tipo) {
        this.nome = nome;
        this.validade = validade;
        this.tipo = tipo;
    }
    public String getNome() {
            return nome;
    }

    static  ArrayList<Compra> listaCompras = new ArrayList<>();
}