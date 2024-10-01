package Aula06.Exercicio16;


public class PrincipalA06E15 {
    public static void main(String[] args) {
        var pedido1 = new Pedido();

        pedido1.setStatusAtualPedido(StatusPedido.PENDENTE);
        pedido1.statusPedido();

        pedido1.setStatusAtualPedido(StatusPedido.PROCESSANDO);
        pedido1.statusPedido();

        pedido1.setStatusAtualPedido(StatusPedido.ENVIADO);
        pedido1.statusPedido();

        pedido1.setStatusAtualPedido(StatusPedido.ENTREGUE);
        pedido1.statusPedido();
    }
}
