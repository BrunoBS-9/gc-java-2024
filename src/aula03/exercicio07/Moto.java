package aula03.exercicio07;

public class Moto extends Veiculos {
        double consumo = 0.15;

    public Moto(String modelo,String marca,int ano) {
        super(modelo, marca, ano);
    }

        @Override
        public double calcularCustoViagem(int distancia) {
        return consumo * distancia;
    }
}
