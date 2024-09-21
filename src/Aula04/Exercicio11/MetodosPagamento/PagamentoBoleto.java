package Aula04.Exercicio11.MetodosPagamento;

public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;
    private String NotaFiscalEletronica;
    private String numeroDaContaRecebedor;

    public boolean executarPagamento(int valorEmDinheiro){
        System.out.println("Pagamento realizado com sucesso");
        return false;
    }
}
