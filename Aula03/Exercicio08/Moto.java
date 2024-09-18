public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);

    }

    @Override
    public double calcularCustoViagem(double distanciaQuilometros) {
        double valorQuilometro = 0.15;

        return valorQuilometro * distanciaQuilometros;
    }

    @Override
    public String toString() {
        return "Moto{Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Ano:" + getAno() + "}";
    }
}
