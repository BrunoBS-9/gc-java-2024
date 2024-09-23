package Aula04.Exercicio11.MetodosPagamento;

import java.util.Random;

public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;
    private String NotaFiscalEletronica;
    private String numeroDaContaRecebedor;

    public PagamentoBoleto() {
        Gerador gerador = new Gerador();
        this.codigoBoleto = gerador.gerarNumeroAleatorio();
        NotaFiscalEletronica = gerador.gerarNumeroAleatorio();
        this.numeroDaContaRecebedor = gerador.gerarNumeroAleatorio();
    }

    public void executarPagamento(int valorEmDinheiro){
        System.out.println("Dados do pagamento: Valor da conta: "+ valorEmDinheiro + ", Código do Boleto:"+ codigoBoleto + ", Numero da Conta do Recebedor: "+ numeroDaContaRecebedor);
    }
}
