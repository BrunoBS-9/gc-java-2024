package aula04.exercicio10;

public class Moto extends Veiculos {
    String tipoDeGuidao = "padrão";

    public Moto(String modelo, String marca, int ano) {
        super(modelo, marca, ano);
    }

    @Override
    public String informacoes() {

        String respostas = "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno de fabricação: " + getAno() +
                "\nTipo de guidão: " + tipoDeGuidao;
        return respostas;
    }
}