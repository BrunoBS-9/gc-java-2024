package Aula03.Exercicio08;

public class Carro  extends Veiculo{
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);

    }

    @Override
    public double calcularCustoViagem(double distanciaQuilometros) {
        double valorQuilometro = 0.20;

        return valorQuilometro * distanciaQuilometros;
    }

    @Override
    public String toString() {
        return "Carro{Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Ano:" + getAno() + "}";
    }
}
