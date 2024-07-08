package aula05;

import aula03.ListaLigada;




public class Programa05 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.getTamanho());
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        lista.remover("BA");
        System.out.println("Removeu estado BA");
        lista.adicionar("PR");
        System.out.println("Adicionou estado PR");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
            System.out.println(lista.get(i).getValor());
        }
    }
}
