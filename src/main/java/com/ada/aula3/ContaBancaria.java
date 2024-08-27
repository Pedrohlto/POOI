package com.ada.aula3;

public class ContaBancaria {

    String numeroConta;
    String titular;
    double saldo;


    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }


    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else if (valor > 0) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else if (valor > 0) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso da conta " + numeroConta + " para a conta " + destino.numeroConta);
        } else {
            System.out.println("O valor da transferência deve ser positivo.");
        }
    }
}
