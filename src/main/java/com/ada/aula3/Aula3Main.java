package com.ada.aula3;

public class Aula3Main {

    public static void main(String[] args) {
//        Agenda agenda = new Agenda("2024", "Tilibra");
//
//        Compromisso compromisso = new Compromisso("26/08/2024", "Meet", "19:00");
//        agenda.setCompromisso(compromisso);
//
//        System.out.println(agenda.marca);
//        System.out.println(agenda.ano);
//
//        Mural mural = new Mural();
//        mural.exibirCompromisso(agenda);

        Pedido pedido = new Pedido("21:46", "DEBITO");

        Produto produto = new Produto();
        produto.nome = "Hamburguer";
        produto.preco = 25.00;

        Produto refrigerante = new Produto();
        refrigerante.nome = "coca-cola";
        refrigerante.preco = 8.00;

        pedido.incluirProduto(produto);
        pedido.incluirProduto(refrigerante);

        System.out.println("");

    }
}
