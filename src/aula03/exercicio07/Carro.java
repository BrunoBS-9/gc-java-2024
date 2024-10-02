package aula03.exercicio07;

public class Carro extends Veiculos {
        double consumo = 0.20;

        public Carro(String modelo,String marca,int ano) {
                super(modelo, marca, ano);
        }

        @Override
        public double calcularCustoViagem(int distancia) {
        return consumo * distancia;
        }
    }

