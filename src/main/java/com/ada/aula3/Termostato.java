package com.ada.aula3;

public class Termostato {

    double temperaturaAtual;
    double temperaturaDesejada;

    public Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void aumentarTemperatura(double valor) {
        temperaturaAtual += valor;
        System.out.println("Temperatura aumentada em " + valor + " graus.");
    }

    public void diminuirTemperatura(double valor) {
        temperaturaAtual -= valor;
        System.out.println("Temperatura diminuída em " + valor + " graus.");
    }

    public void ajustarTemperaturaDesejada(double novaTemperatura) {
        temperaturaDesejada = novaTemperatura;
        System.out.println("Temperatura desejada ajustada para " + novaTemperatura + " graus.");
    }

    public void exibirStatus() {
        System.out.println("Temperatura Atual: " + temperaturaAtual + " graus.");
        System.out.println("Temperatura Desejada: " + temperaturaDesejada + " graus.");

        if (temperaturaAtual < temperaturaDesejada) {
            System.out.println("A temperatura atual está abaixo da temperatura desejada.");
        } else if (temperaturaAtual > temperaturaDesejada) {
            System.out.println("A temperatura atual está acima da temperatura desejada.");
        } else {
            System.out.println("A temperatura atual está na temperatura desejada.");
        }
    }
}
