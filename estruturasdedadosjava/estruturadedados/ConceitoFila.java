package formacao.desenvolvedores.tecnologia.uno.estruturasdedadosjava.estruturadedados;


public class ConceitoFila {
    private int inicio, fim;
    private int tamanhoDaFila;
    private int numeroDeElementos;
    private int[] filaDeInteiros;
    private final static int FILA_SEM_ELEMENTOS = -1;


    public ConceitoFila(int tamanhoDaFila) {
        if(tamanhoDaFila >0){
            this.tamanhoDaFila = tamanhoDaFila;
        }else{
            this.tamanhoDaFila = 5;
        }

        filaDeInteiros = new int[this.tamanhoDaFila];
        inicio = fim = -1;
        numeroDeElementos = 0;

    }

    public boolean filaVazia(){
        if(numeroDeElementos == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean filaCheia(){
        if(numeroDeElementos == tamanhoDaFila -1){
            return true;
        }else{
            return false;
        }
    }

    public int tamanhoDaFila(){
        if(filaVazia()){
            return 0;
        }else{
            return filaDeInteiros.length;
        }
    }

    public void adicionarElementoFila(int valorNumerico){
        if(!filaCheia()){
            if(inicio == FILA_SEM_ELEMENTOS){
                inicio = 0;
            }
            fim++;
            filaDeInteiros[fim] = valorNumerico;
            numeroDeElementos++;
        }
    }

    public void removerElementosFila(){
        if(!filaVazia()){
            inicio++;
            numeroDeElementos--;
        }
    }

    public void imprimirElementosDaFila(){
        if(filaDeInteiros == null){
            System.out.println("Erro. A fila não foi criada!");
        }else if(filaVazia()){
            System.out.println("A fila está vazia!");
        }else{
            String elementos = "";
            for(int i = inicio; i<=fim; i++){
                //System.out.printl("%2do da fila: %2d \n", i+i, filaDeInteiros[i]);
                elementos += filaDeInteiros[i]+ ",";
            }
            String msg= "Elementos da fila: " + elementos;

            if(elementos != ""){

            }
        }
    }
    



    
}
