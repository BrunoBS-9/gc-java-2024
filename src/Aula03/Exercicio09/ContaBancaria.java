package Aula03.Exercicio09;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String nomeDoBanco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;
    private boolean estaAtiva;
    private List<String> historicoTransacoes;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String nomeDoBanco, String endereco, double saldo, LocalTime horarioAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.nomeDoBanco = nomeDoBanco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = horarioAtual;
        this.estaAtiva = true;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void fecharConta(){
        estaAtiva = false;
    }

    public boolean verificaContaAtiva(ContaBancaria conta){
        if (conta.estaAtiva){
            return true;
        }else {
            return false;
        }
    }

    public void adicionarTransacaoHistorico(String toStringTransacao){
        historicoTransacoes.add(toStringTransacao);
    }
    public void exibirTodasTransacoes(){
        System.out.println("===================================");
        System.out.println("Histórico de transações:");
        for (String historico : historicoTransacoes){
            System.out.print(historico + " \n");
        }
        System.out.println("===================================");
    }
}
