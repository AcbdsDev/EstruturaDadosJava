package aula03; // Imagina que 'aula03' é o nome da caixa onde guardamos nossos brinquedos.

public class Elemento { // Estamos criando um brinquedo chamado 'Elemento'. Cada 'Elemento' pode guardar um valor e se conectar a outro 'Elemento'.

    private String valor; // Cada 'Elemento' tem um nome ou valor que guarda (pode ser o nome de um brinquedo).
    private Elemento proximo; // Cada 'Elemento' pode apontar para o próximo brinquedo na linha.

    // Este é o construtor. Ele cria um novo 'Elemento' e dá a ele um nome (ou valor).
    public Elemento(String novoValor){
        this.valor = novoValor; // Quando criamos um 'Elemento', damos a ele o valor ou nome que recebemos.
    }

    // Esta função nos mostra o nome ou valor do 'Elemento'.
    public String getValor(){
        return valor; // Retorna o valor (nome) do 'Elemento'.
    }

    // Esta função nos mostra o próximo 'Elemento' que está conectado a este.
    public Elemento getProximo(){
        return proximo; // Retorna o próximo 'Elemento' na linha.
    }

    // Esta função permite que a gente mude o valor ou nome do 'Elemento'.
    public void setValor(String valor){
        this.valor = valor; // Define um novo valor (nome) para este 'Elemento'.
    }

    // Esta função permite que a gente conecte este 'Elemento' a outro.
    public void setProximo(Elemento proximo){
        this.proximo = proximo; // Diz qual é o próximo 'Elemento' na linha.
    }

}

