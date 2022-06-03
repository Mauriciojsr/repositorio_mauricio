package disciplina.java.conceitosestruturadedados.lista_duplamente_encadeada;

import java.util.ArrayList;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplamenteEncadeado<T> primeiroNo;
    private NoDuplamenteEncadeado<T> ultimoNo;

    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T getValueNoByPosition(int index) {
        return this.getNoByPosition(index).getValorNo();
    }

    public void addNo(T elemento) {
        NoDuplamenteEncadeado<T> novoNo = new NoDuplamenteEncadeado<T>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if(primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if(ultimoNo != null) {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void addNoAtPosition(int index, T elemento) {
        NoDuplamenteEncadeado<T> noAuxiliar = getNoByPosition(index);
        NoDuplamenteEncadeado<T> novoNo = new NoDuplamenteEncadeado<>(elemento);
        novoNo.setProximoNo(noAuxiliar);

        if(novoNo.getProximoNo() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setProximoNo(novoNo);
        }
        tamanhoLista++;

    }

    public void removeNoAtPosition(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplamenteEncadeado<T> noAuxiliar = getNoByPosition(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo) {
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplamenteEncadeado<T> getNoByPosition(int index) {
        NoDuplamenteEncadeado<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public int listSize() {
        return this.tamanhoLista;
    }

    public boolean isValueNoInTheList(T elemento) {
        NoDuplamenteEncadeado<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < this.listSize(); i++) {
            if(elemento == noAuxiliar.getValorNo()){
                return true;
            }
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return false;
    }

    public ArrayList<String> listaValorNo(){
        ArrayList<String> lista = null;
        String s = "";
        NoDuplamenteEncadeado<T> noAuxiliar = primeiroNo;
        lista = new ArrayList<>();
        for(int i = 0; i < this.listSize(); i++) {
            if(noAuxiliar.getValorNo() != null){
                s = String.valueOf(noAuxiliar.getValorNo());
                lista.add(s);
            }
            noAuxiliar = noAuxiliar.getProximoNo();

        }

        return lista;
    }

    /*@Override
    public String toString() {
        String strRetorno = "";

        NoDuplamenteEncadeado<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < listSize(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getValorNo() + "}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }*/

}

/*Baseado no código:
* https://github.com/adriano-sick/listaDuplamenteEncadeada/blob/main/src/main/java/duplamente/lista/Main.java*/