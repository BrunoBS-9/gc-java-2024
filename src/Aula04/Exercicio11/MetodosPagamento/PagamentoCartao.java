package Aula04.Exercicio11.MetodosPagamento;

import java.util.Random;

public class PagamentoCartao implements Pagamento{
    private String nomeDoTitular;
    private String numeroDoCartao;
    private String cpfDoTitular;
    private String notaFiscalEletronica;

    public PagamentoCartao(String nomeDoTitular, String numeroDoCartao, String cpfDoTitular) {
        Gerador gerador = new Gerador();
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoCartao = numeroDoCartao;
        this.cpfDoTitular = cpfDoTitular;
        this.notaFiscalEletronica = gerador.gerarNumeroAleatorio();
    }

    @Override
    public void executarPagamento(int valor){
        System.out.println("Pagamento com cartão foi realizado com sucesso");
        System.out.println("Dados do pagamento: Valor da conta: "+ valor + ", Nome do Titular: "+ nomeDoTitular + ", CPF do titular: "+ cpfDoTitular + ", Nota FiscalEletronica: " + notaFiscalEletronica);
    }

    public boolean verificarNumeroCartao(String numeroDoCartao){


        return false;
    }
}
