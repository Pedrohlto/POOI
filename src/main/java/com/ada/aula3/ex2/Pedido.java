package com.ada.aula3.ex2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void exibirPedido() {
        double valorTotal = 0;
        System.out.println("Resumo do Pedido:");
        for (ItemPedido item : itens) {
            item.exibirDetalhes();
            valorTotal += item.calcularTotal();
        }
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}
