package disciplina.java.conceitosestruturadedados.lista_duplamente_encadeada;

public class NoDuplamenteEncadeado<T> {

    private T valorNo;
    private NoDuplamenteEncadeado<T> proximoNo;
    private NoDuplamenteEncadeado<T> noAnterior;

    public NoDuplamenteEncadeado(T valorNo) {
        this.valorNo = valorNo;
    }

    public T getValorNo() {
        return valorNo;
    }

    public void setValorNo(T valorNo) {
        this.valorNo = valorNo;
    }

    public NoDuplamenteEncadeado<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplamenteEncadeado<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoDuplamenteEncadeado<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplamenteEncadeado<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplamenteEncadeado{" +
                "valorNo=" + valorNo +
                '}';
    }
}
