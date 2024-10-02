package aula04.exercicio10;

abstract class Veiculos {
    String modelo;
    String marca;
    int ano;

    public Veiculos(String modelo,String marca,int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public abstract String informacoes();
}