package formacao.desenvolvedores.tecnologia.uno.estruturasdedadosjava.lista_encadeada;

public class ListaEncadeadaSimples {
    private NoDaListaEncadeadaSimples inicioDaLista;
    private NoDaListaEncadeadaSimples fimDaLista;

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
        if(listaEncadeadaVazia()){
            inserirNoInicioDaLista(e);
        }else{
            NoDaListaEncadeadaSimples aux = inicioDaLista;
            while(aux.getProximoNo() != null){
                aux = aux.getProximoNo();
            }
            aux.setProximoNo(new NoDaListaEncadeadaSimples(e));
            fimDaLista = aux.getProximoNo();
        }
    }

    public int removerDoInicioDaLista(){
        int r = -1;

        if(listaEncadeadaVazia()){
            System.err.println("Erro! Lista vazia.");
        }else{
            r             = inicioDaLista.getDado();
            inicioDaLista = inicioDaLista.getProximoNo();
        }

        return r;
    }

    public int removerDoFinalDaLista() {
        int r = -1;

        if (listaEncadeadaVazia()) {
            System.err.println("Erro! Lista vazia.");
        } else {
            if (inicioDaLista.getProximoNo() == null) {
                r             = inicioDaLista.getDado();
                inicioDaLista = inicioDaLista.getProximoNo();
            } else {
                NoDaListaEncadeadaSimples aux1 = inicioDaLista;
                NoDaListaEncadeadaSimples aux2 = inicioDaLista;

                while (aux1.getProximoNo() != null) {
                    aux2 = aux1;
                    aux1 = aux1.getProximoNo();
                }

                r = aux1.getDado();
                aux2.setProximoNo(null);
            }
        }

        return r;
    }

    public String getListaEncadeadaSimples() {
        String nos = "";
        if (!listaEncadeadaVazia()) {
            NoDaListaEncadeadaSimples aux = inicioDaLista;
            while (aux != null) {
                //System.out.printf("| %d ", aux.getDado());
                nos = nos + "| " + aux.getDado();
                aux = aux.getProximoNo();
            }
            //System.out.println("");
        }

        return nos;
    }

    public NoDaListaEncadeadaSimples getNo(){

        return this.inicioDaLista;
    }

    public NoDaListaEncadeadaSimples getFimDaLista() {

        return fimDaLista;
    }

	/*public int getLastNo(){
		NoDaListaEncadeadaSimples aux = null;
		while (inicioDaLista != null) {
			aux = inicioDaLista.getProximoNo();
		}

		return aux.getDado();
	}*/


}
