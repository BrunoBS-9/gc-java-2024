package Aula04.Exercicio10;

public class Carro extends Veiculo{
    private int numeroDePortas;
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public String informacoes(){
        return "Veículo{Marca: "+ getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Numero de Portas: " + numeroDePortas +"}";
    }
}
