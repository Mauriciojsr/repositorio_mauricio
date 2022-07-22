package lista_encadeada;

public class ListaEncadeadaSimples {
    private NoDaListaEncadeadaSimples inicioDaLista;

    public ListaEncadeadaSimples() {
        inicioDaLista = null;
    }
    
    public boolean listaEncadeadaVazia(){
        return inicioDaLista == null;
        /*if(this.inicioDaLista == null){
            return true;
        }else{
            return false;    
        }*/       
    }

    public void inserirNoInicioDaLista(int e){
       NoDaListaEncadeadaSimples novo = new NoDaListaEncadeadaSimples(e);
       novo.setProximoNo(inicioDaLista);
       inicioDaLista = novo;
    }

    public void inserirNoFinalDaLista(int e){
        NoDaListaEncadeadaSimples fim = new NoDaListaEncadeadaSimples(e);
        fim.setProximoNo(inicioDaLista);
        inicioDaLista = fim;
    }

    
}
