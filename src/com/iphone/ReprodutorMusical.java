package com.iphone;

public class ReprodutorMusical implements IReprodutorMusical {
    private String musicaAtual;
    private String estado; // "tocando", "pausado", "parado"

    @Override
    public void tocar() {
        this.estado = "tocando";
        System.out.println("Reproduzindo a música: " + this.musicaAtual);
    }

    @Override
    public void pausar() {
        this.estado = "pausado";
        System.out.println("Música pausada: " + this.musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        this.estado = "parado";
        System.out.println("Música selecionada: " + this.musicaAtual);
    }
}
