import java.util.Random;
import java.util.Stack;

import estrututas_de_dados.ConceitoFila;
import estrututas_de_dados.ConceitoPilha;

public class MainProgram {
    //Pilha
    private static ConceitoPilha pilhaDeLivros; //declarado como atributo.
    private static Stack<String> pilhaDeLivrosStack; //declarado como atributo.
    private static Stack<Integer> pilhaDeNumerosInteiros;
    private static Random random;

    //Fila
    private static ConceitoFila fila;

    public MainProgram() {}

    public static void main(String[] args) {
        random                 = new Random();
        pilhaDeNumerosInteiros = new Stack<>();
        pilhaDeLivros          = new ConceitoPilha(7); //Instanciado o pilhaDeLivros.
        pilhaDeLivrosStack     = new Stack<>();
    
        pilhaDeLivros.empilhar("Java \n");
        pilhaDeLivros.empilhar("Python");
        pilhaDeLivros.empilhar("MySql");
        pilhaDeLivros.empilhar("C");
        pilhaDeLivros.empilhar("C++");
        pilhaDeLivros.empilhar("Delphy");
        pilhaDeLivros.empilhar("Guia do Programador");

        pilhaDeLivros.imprimirElementosDaPilha();

       /* System.out.println("Elemento topo: " + pilhaDeLivros.pegarElementoDoTopoDaPilha() + "\n");
        
        pilhaDeLivros.imprimirElementosDaPilha();
        pilhaDeLivros.desempilhar();*/

        //Desempilhar
        System.out.println("");
        System.out.println("Desempilhando...");
        pilhaDeLivros.desempilhar();
        pilhaDeLivros.desempilhar();
        pilhaDeLivros.imprimirElementosDaPilha();

        //empilhar outros livros
        System.out.println("");
        pilhaDeLivros.empilhar("Python 3");

        pilhaDeLivros.imprimirElementosDaPilha();

        if(pilhaDeLivros.pegarElementoDoTopoDaPilha() instanceof String){
            System.out.println("");
            System.out.println("Elemento no topo da pilha : " + pilhaDeLivros.pegarElementoDoTopoDaPilha());
            System.out.println("");
        }

        //Usando a classe Stack (pilha) da API Java
        //System.out.println("https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html");
        System.out.println("Trabalhando com a classe Stack (pilha) da API Java");

        System.out.println("");
        System.out.println("Empilhando valores numéricos...");
        for(int i=0; i <10; i++){
            pilhaDeNumerosInteiros.push(random.nextInt(100));
        }
        System.out.println("Pilha de inteiros" + pilhaDeNumerosInteiros);

        pilhaDeNumerosInteiros.pop();
        System.out.println("Topo da pilha removido" + pilhaDeNumerosInteiros);
        pilhaDeNumerosInteiros.pop();
        System.out.println("Topo da pilha removido" + pilhaDeNumerosInteiros);

        System.out.println("");
        System.out.println("Elemento do topo da pilha: " + pilhaDeNumerosInteiros.peek());


        //Pilha de livos métodos Stack

        //Empilhar
        System.out.println("");
        System.out.println("Empilhando livros do tipo Stack: \n");
        for(int i=0; i < 7; i++){
            pilhaDeLivrosStack.push("Livro" + i);
        }
        System.out.println("Pilha de livros \n" + pilhaDeLivrosStack);

        //Desempilhar
        pilhaDeLivrosStack.pop();
        System.out.println("Topo da pilha removido" + pilhaDeLivrosStack);
        pilhaDeLivrosStack.pop();
        System.out.println("Topo da pilha removido" + pilhaDeLivrosStack);

        System.out.println("");
        System.out.println("Elemento do topo da pilha: " + pilhaDeLivrosStack.peek()); 
        
        //Fila

        fila = new ConceitoFila(6);

        fila.adicionarElementoFila(1);
        fila.adicionarElementoFila(2);
        fila.adicionarElementoFila(3);
        fila.adicionarElementoFila(4);
        fila.adicionarElementoFila(5);

        fila.imprimirElementosDaFila();

        fila.removerElementosFila();

        fila.imprimirElementosDaFila();

        System.out.println("Tamanho da fila: " + fila.tamanhoDaFila());

       
    }

}

 /*ConceitoPilha conceitoPilha = new ConceitoPilha(5);

        conceitoPilha.empilhar("Mauricio \n");
        conceitoPilha.empilhar("Eduardo");
        conceitoPilha.empilhar("Diego");
        conceitoPilha.empilhar("Matheus");
        conceitoPilha.empilhar("Julia");

        System.out.println("Elemento topo: " + conceitoPilha.pegarElementoDoTopoDaPilha() + "\n");

        conceitoPilha.imprimirElementosDaPilha();

        conceitoPilha.desempilhar();
        conceitoPilha.imprimirElementosDaPilha();*/
