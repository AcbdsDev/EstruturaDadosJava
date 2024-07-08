package aula03;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.getTamanho());
        lista.adicionar("01");
        lista.adicionar("02");
        lista.adicionar("03");
        lista.adicionar("04");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

    }
}
