package com.iphone;

public class Main {
    public static void main(String[] args) {
        IReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Imagine - John Lennon");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        IAparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        INavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
