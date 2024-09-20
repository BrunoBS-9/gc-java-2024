package Aula04.Exercicio10;

public class Moto extends Veiculo{
    private String tipoDeGuidao;
    public Moto(String marca, String modelo, int ano, String tipoDeGuidao){
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String informacoes(){
        return "Veículo{Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Tipo De Guidão:" + tipoDeGuidao + "}";
    }
}
