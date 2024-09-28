package Aula04.Exercicio10;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String informacoes(){
        return "Veículo{Marca: "+ getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno()+"}";
    }
}
