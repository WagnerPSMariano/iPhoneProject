package com.iphone;

public class AparelhoTelefonico implements IAparelhoTelefonico {
    private String numeroAtual;
    private String estadoChamada; // "em chamada", "esperando", "correio de voz"

    @Override
    public void ligar(String numero) {
        this.numeroAtual = numero;
        this.estadoChamada = "em chamada";
        System.out.println("Ligando para: " + this.numeroAtual);
    }

    @Override
    public void atender() {
        this.estadoChamada = "em chamada";
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        this.estadoChamada = "correio de voz";
        System.out.println("Iniciando correio de voz.");
    }
}
