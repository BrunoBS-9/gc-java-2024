package aula3.exercicio1;

abstract class Veiculos {
    String modelo;
    String marca;
    int ano;

    public Veiculos(String modelo,String marca,int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public abstract double calcularCustoViagem(int distancia);
}
