package formacao.desenvolvedores.tecnologia.uno.estruturasdedadosjava.lista_encadeada;

public class NoDaListaEncadeadaSimples {
    private int dado;
    private NoDaListaEncadeadaSimples proximoNo;

    public NoDaListaEncadeadaSimples(int dado) {
        this.dado = dado;
        proximoNo = null;
    }

    public int getDado() {
        return this.dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoDaListaEncadeadaSimples getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(NoDaListaEncadeadaSimples proximoNo) {
        this.proximoNo = proximoNo;
    }

    
}
