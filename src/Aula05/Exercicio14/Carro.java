package Aula05.Exercicio14;

public class Carro implements Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String coletarDetalhes(){
        return "Carro{Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano +", Quantidade de Portas: " + quantidadeDePortas + "}";
    }
}
