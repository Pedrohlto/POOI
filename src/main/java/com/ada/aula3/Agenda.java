package com.ada.aula3;

public class Agenda {

    String ano;
    String marca;
    Compromisso compromisso;

    public Agenda (String ano, String marca){
        this.ano = ano;
        this.marca = marca;
    }

    public void setCompromisso (Compromisso compromisso){
        this.compromisso = compromisso;
    }

    public void exibirHorarioCompromisso(){
        System.out.println(this.compromisso.horario);
    }
}
