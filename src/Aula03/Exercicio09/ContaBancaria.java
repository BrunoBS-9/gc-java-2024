package Aula03.Exercicio09;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String nomeDoBanco;
    private String endereco;
    private double saldo;
    private double deposito;
    private double pix;
    private LocalTime horarioAtual;
    private boolean estaAtiva;
    private List<String> historicoTransacoes;
    Scanner scan = new Scanner(System.in);

    public ContaBancaria(String nome, String cpf, String identificadorConta, String nomeDoBanco, String endereco, double saldo, LocalTime horarioAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.nomeDoBanco = nomeDoBanco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.deposito = deposito;
        this.pix = pix;
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

    String real;

    public int sacar(int saldo, int saque) {
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Seu saldo atual agora é:");
            System.out.println("$ " + saldo);
            return saldo;
        } else {
            System.out.println("Saque inválido");
        }
        return saldo;  // Retorna saldo original se saque n válido
    }

    public int depositar(int saldo, int deposito){

        System.out.println("Você recebeu um depósito em sua conta");
        System.out.println("Seu saldo atual agora é:");
        System.out.println("$ " + saldo);
       return deposito + saldo;

    }
    public int pix(int saldo, int pix){
        if (pix <= saldo) {
            saldo -= pix;
            System.out.println("Pix feito com sucesso!");
            System.out.println("Seu saldo atual agora é:");
            System.out.println("$ " + saldo);
            return saldo;
        } else {
            System.out.println("impossivel efetuar o pix");
        }
        return saldo;  // Retorna saldo original se saque n válido

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
