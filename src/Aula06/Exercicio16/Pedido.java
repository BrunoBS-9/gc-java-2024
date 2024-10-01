package Aula06.Exercicio16;

public class Pedido {
    private StatusPedido statusAtualPedido;


    public void setStatusAtualPedido(StatusPedido statusAtualPedido) {
        this.statusAtualPedido = statusAtualPedido;
    }

    public void statusPedido(){
        switch (statusAtualPedido){
            case PENDENTE -> System.out.println("Seu pedido está pendente.");
            case PROCESSANDO -> System.out.println("Seu pedido está sendo processado.");
            case ENVIADO -> System.out.println("Seu pedido foi enviado.");
            case ENTREGUE -> System.out.println("Seu pedido foi entregue!");
            default -> System.out.println("Status inválido do pedido.");
        }
    }
}
