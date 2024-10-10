package Aula05.Exercicio14;

public class Caminhao implements  Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private int maximoDeToneladas;

    public Caminhao(String marca, String modelo, int ano, int maximoDeToneladas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.maximoDeToneladas = maximoDeToneladas;
    }

    @Override
    public String coletarDetalhes(){
        return "Caminhão{Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano +", Maximo de Toneladas: "+ maximoDeToneladas + "}";
    }
}
