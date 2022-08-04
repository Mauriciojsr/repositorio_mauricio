package lista_encadeada_simples;

public class No {

    private Alunos a;
    private No prox; 

    
public No(Alunos al) {
    this.setA(al);
    this.setProx(null);
}


    public Alunos getA() {
        return this.a;
    }

    public void setA(Alunos a) {
        this.a = a;
    }

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }


}
