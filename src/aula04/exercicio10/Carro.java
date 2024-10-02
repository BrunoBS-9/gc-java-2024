package aula04.exercicio10;

public class Carro extends Veiculos {
        int numPortas = 4;

        public Carro(String modelo,String marca,int ano) {
                super(modelo, marca, ano);
        }

        @Override
        public String informacoes() {

                String respostas = "Marca: " + getMarca() +
                        "\nModelo: " + getModelo() +
                        "\nAno de fabricação: " + getAno() +
                        "\nNúmero de portas: " + numPortas;
                return respostas;
        }
}

