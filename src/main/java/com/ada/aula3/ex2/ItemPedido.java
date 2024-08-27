package com.ada.aula3.ex2;

public class ItemPedido {

    String nome;
    int quantidade;
    double preco;

    public ItemPedido(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double calcularTotal() {
        return quantidade * preco;
    }

    public void exibirDetalhes() {
        System.out.println(quantidade + "x " + nome + " - R$ " + preco + " cada");
    }

}
