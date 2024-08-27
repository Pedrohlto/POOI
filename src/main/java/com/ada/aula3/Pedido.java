package com.ada.aula3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    String horarioPedido;
    String formaPagamento;
    double valorTotal;
    List<Produto> produtos;

    public Pedido(String horarioPedido, String formaPagamento){
        this.formaPagamento = formaPagamento;
        this.horarioPedido = horarioPedido;
        this.produtos = new ArrayList<>();
    }

    public void incluirProduto(Produto produto){
        this.produtos.add(produto);
    }

}
