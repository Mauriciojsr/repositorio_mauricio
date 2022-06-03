public class Lista_Encadeada_Simples {
    private Aluno primeira = null;
    private Aluno ultima = null;
    private int totalDeElementos = 0;


    public Lista_Encadeada_Simples() {}

    public void adicionaNoComeco(Object elemento) {
        Aluno nova = new Aluno(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }

        this.totalDeElementos++;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Aluno atual = primeira;

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }

    // adiciona no fim
    public void adicionaFim(Object elemento) {

        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Aluno nova = new Aluno(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeElementos;
    }

    private Aluno pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição Inexistente");
        }
        Aluno atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    // adiciona no meio
    public void adicionaPosicao(int posicao, Object elemento) {

        Aluno atual = primeira;
        Aluno ultimo = null;
        Aluno novo = new Aluno(elemento);
        int i = 0;

        while (atual != null) {
            atual = atual.getProximo();

            if (i == posicao) {
                ultimo.setProximo(novo);
                novo.setProximo(atual);
                break;
            }
            i++;
            ultimo = atual;
        }
        this.totalDeElementos++;
    }

    public Object pega (int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco () {
        if(this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        totalDeElementos--;

        if(this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void remove ( int posicao){
    }

    public int tamanho () {
        return this.totalDeElementos;
    }

    public boolean contem (Object o){
        return false;
    }
    
}
