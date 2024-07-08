package aula03; // Este é o nome do "pacote" onde nosso código está, como uma pasta onde guardamos a classe.

public class ListaLigada { // Estamos criando uma nova classe chamada ListaLigada.

    // Estas são as variáveis que nossa lista ligada usará.
    private Elemento primeiro; // O primeiro elemento na linha.
    private Elemento ultimo; // O último elemento na linha.
    private int tamanho; // Quantos brinquedos temos na linha.

    // Este é o construtor da nossa lista. Ele diz o que acontece quando criamos uma nova ListaLigada.
    public ListaLigada(){
        this.tamanho = 0; // Quando começamos, a lista está vazia, então o tamanho é 0.
    }

    // Esta função nos mostra qual é o primeiro elemento na linha.
    public Elemento getPrimeiro() {
        return primeiro; // Retorna o primeiro elemento.
    }

    // Esta função permite que a gente coloque um elemento específico como o primeiro na linha.
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro; // Define o elemento como o primeiro na linha.
    }

    // Esta função nos mostra qual é o último elemento na linha.
    public Elemento getUltimo() {
        return ultimo; // Retorna o último elemento.
    }

    // Esta função permite que a gente coloque um elemento específico como o último na linha.
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo; // Define o elemento como o último na linha.
    }

    // Esta função nos diz quantos elemento estão na linha.
    public int getTamanho() {
        return tamanho; // Retorna o número de elemento na linha.
    }

    // Esta função permite que a gente diga quantos elementos devem estar na linha.
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho; // Define o número de elementos na linha.
    }

    // Esta função adiciona um novo elemento à linha.
    public void adicionar(String novoValor){
        // Criamos um novo elemento com o nome que recebemos.
        Elemento novoElemento = new Elemento(novoValor);

        // Se a linha está vazia (sem brinquedos), colocamos o novo elemento como o primeiro e o último.
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento; // Coloca o novo brinquedo como o primeiro.
            this.ultimo = novoElemento; // Coloca o novo brinquedo como o último.
            this.tamanho++; // Aumenta o tamanho da linha porque adicionamos um elemento.
        } else {
            // Se a linha já tem elementos, adicionamos o novo brinquedo depois do último.
            this.ultimo.setProximo(novoElemento); // Liga o último elemento ao novo.
            this.ultimo = novoElemento; // Agora o novo elemento é o último.
        }
        this.tamanho++; // Aumenta o tamanho da linha porque adicionamos um brinquedo.
    }

    // Esta função deve remover um elemento com o nome que recebermos, mas ainda não faz nada.
    public void remover(String novoValor){

    }

    // Esta função nos dá o elemento que está em uma posição específica na linha.
    public Elemento get(int posicao){
        Elemento atual = this.primeiro; // Começamos no primeiro elemento.

        // Usamos um laço (loop) para contar e chegar até a posição desejada.
        for(int i=0; i< posicao; i++){
            if (atual.getProximo() != null){ // Se há um próximo elemento, avançamos para ele.
                atual = atual.getProximo();
            }
        }
        return atual; // Retorna o elemento que encontramos na posição desejada.
    }
}
