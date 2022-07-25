package estrututas_de_dados;

public class ConceitoPilha{
    private int tamanhoDaPilha;
    private Object pilha[];

    public ConceitoPilha(int tamanhoDaPilha){
        if(tamanhoDaPilha > 0){    
            this.tamanhoDaPilha = tamanhoDaPilha;
        }else{
        //Se um valor inválido for passado no construtor, uma pilha de tamanho CINCO será criada.
        this.tamanhoDaPilha = 7;
        }

        pilha = new Object[this.tamanhoDaPilha];
    }

    public boolean pilhaVazia(){
        if(this.pilha == null){
            return true;
        }else{
            //return (pilha.length == 0 ? true : false);
            if(pilha.length == 0){
                return true;
            }else{
                return false;
            }
        }
    }

    public int tamanhoDaPilha(){
        if(pilhaVazia()){
            return 0;
        }else{
            return pilha.length;
        }
    }

    public Object pegarElementoDoTopoDaPilha(){
        Object topo = null;

        if(pilhaVazia()){
            return null;
        }else{
            int controleDoLacoWhile = tamanhoDaPilha() -1;
            while(controleDoLacoWhile >= 0){
            if(pilha[controleDoLacoWhile] != null){
                topo = pilha[controleDoLacoWhile];
                break;
            }
                controleDoLacoWhile--;
            }

            return topo;
        }
    }

    public void empilhar(Object elemento){
        if(pilha != null){
            int indice = 0;
            /*O while percorre, de maneira controlada, todos os índices da pilha e não acessa 
            de uma posição inválida.*/
            while(indice <pilha.length){
                if(pilha[indice] == null){
                    //Só insere no topo da pilha, aé chegar a sua capacidade máxima.
                    if(elemento != null){
                        pilha[indice] = elemento;
                        break;
                    }
                }
                    indice++;
            }
        }
    }

    public void desempilhar(){
        if(!pilhaVazia()){
            int controleDoLacoWhile = tamanhoDaPilha() -1;
            while(controleDoLacoWhile >= 0){
                if(pilha[controleDoLacoWhile] != null){
                    /*Vasculha a pilha do topo té o primeiro elemeto. Nesse trajeto, o primeiro elemento não Nullo
                    será o topo da pilha sofrerá um "pop", ou seja, será dese,pilhado, excluido da pilha.
                    */
                    pilha[controleDoLacoWhile] = null;
                    break; //sai do laço quando encontrar o topo da pilha
                }
                controleDoLacoWhile--;
            }
        }
    }

    public void imprimirElementosDaPilha(){
        if(pilha == null){ //se a pilha não foi criada.
            System.out.println("Erro. A pilha não foi criada!"); 
        }else if(pilhaVazia()){ //se a pilha estiver criada, mas vazia.
            System.out.println("A pilha está vazia!"); 
        }else{
            for(int i=pilha.length -1; i>=0; i--){
                if(pilha[i] instanceof String){ //instanceof - somente irá imprimir se tiver elementos string.
                    System.out.printf("Elemento %2d: %s \n", i, pilha[i]);
                }
            }
        }    
        
        /*if(!pilhaVazia()){
            int controleDoLacoWhile = tamanhoDaPilha() -1;
            while(controleDoLacoWhile >= 0){
                if(pilha[controleDoLacoWhile] != null){
                    System.out.println(pilha[controleDoLacoWhile]);
                    break;
                }
            }
            controleDoLacoWhile--;
        }*/
    }

    public void push(int nextInt) {
    }

    public void push(String string) {
    }

}