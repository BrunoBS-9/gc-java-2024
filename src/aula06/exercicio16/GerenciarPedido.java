package aula06.exercicio16;

import aula06.exercicio15.GerenciarAcesso;

public class GerenciarPedido {
    public static void main(String[] args) {
        enum StatusPedido {
            PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE
        }
        StatusPedido pacote = StatusPedido.ENVIADO;

        switch (pacote) {
            case PENDENTE -> System.out.println("Seu pedido  está na fila de espera");
            case PROCESSANDO -> System.out.println("Seu pedido está sendo sendo feito");
            case ENVIADO -> System.out.println("Seu pedido já foi enviado para a entrega");
            case ENTREGUE -> System.out.println("Seu pedido já foi entregue");
            default -> System.out.println("Pedido não encontrado");
        }
    }
}