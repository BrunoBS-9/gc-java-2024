package aula05.Exercicio14;

public class Moto implements Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private int quantidadeCilindradas;

    public Moto(String marca, String modelo, int ano, int quantidadeCilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeCilindradas = quantidadeCilindradas;
    }

    @Override
    public String coletarDetalhes(){
        return "Moto{Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Quantidade de Cilindradas: " + quantidadeCilindradas +"}";
    }
}
