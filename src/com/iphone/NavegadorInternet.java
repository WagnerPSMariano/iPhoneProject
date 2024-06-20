package com.iphone;

public class NavegadorInternet implements INavegadorInternet {
    private String urlAtual;
    private int abasAbertas;

    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + this.urlAtual);
    }

    @Override
    public void adicionarNovaAba() {
        this.abasAbertas++;
        System.out.println("Nova aba adicionada. Total de abas: " + this.abasAbertas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + this.urlAtual);
    }
}
