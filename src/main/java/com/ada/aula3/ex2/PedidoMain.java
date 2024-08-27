package com.ada.aula3.ex2;

public class PedidoMain {

    public static void main(String[] args) {
        ItemPedido bebida = new ItemPedido("Coca-Cola", 2, 5.0);
        ItemPedido pratoPrincipal = new ItemPedido("Bife Acebolado", 1, 40.0);
        ItemPedido sobremesa = new ItemPedido("Sorvete", 1, 12.0);

        Pedido meuPedido = new Pedido();
        meuPedido.adicionarItem(bebida);
        meuPedido.adicionarItem(pratoPrincipal);
        meuPedido.adicionarItem(sobremesa);

        meuPedido.exibirPedido();
    }
}
