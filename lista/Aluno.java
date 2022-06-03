public class Aluno {
    private Object elemento;
    private Aluno proximo;

    public Aluno(Object elemento, Aluno proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Aluno(Object elemento){
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

    public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }

    
}
