package Aula04.Exercicio11.MetodosPagamento;

public class PagamentoCartao implements Pagamento{
    private String nomeDoTitular;
    private String numeroDoCartao;
    private String cpfDoTitular;
    private String NotaFiscalEletronica;

    @Override
    public boolean executarPagamento(int valor){
        if(nomeDoTitular == null)
        System.out.println("Pagamento foi realizado com sucesso");

        return false;
    }

    public boolean verificarNumeroCartao(String numeroDoCartao){


        return false;
    }
}
