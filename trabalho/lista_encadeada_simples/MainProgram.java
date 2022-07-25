package lista_encadeada_simples;

import java.util.Scanner;

public class MainProgram {


    public static void main(String[] args) {
        /*
        Professor ou aluno sera apagado 
        vamos deixar só uma lista de aluno ou professor pra facilitar 
        Codificar o metodo imprimirLista dentro de Lista_Simples
        Criar um metodo para exibir o tamanho da lista
        Criar um metodo para exibir o primeiro elemento da lista
         Criar um metodo para remover elementos da lista
        */
   
        Lista_Simples listaAlunos= new Lista_Simples();

        while(true) {
            System.out.println("Escolha a ação que deseja executar:"
                    + "\n1-Cadastrar Aluno" // aluno
                    + "\n2-Imprimir lista de alunos" // imprimir lista de alunos
                    + "\n3-Imprimir total de alunos"); // imprimir total de alunos
                    // imprimir primeiro aluno da lista
            System.out.println("Digite o número da ação que deseja executar: ");
            Scanner menu = new Scanner(System.in);
            int acao = menu.nextInt();
    
            Alunos a = new Alunos();
    
    
            switch(acao) {
                case 1: // aqui sera a criação aluno
                    int fim2 = 0;
    
                    Scanner nomeA = new Scanner(System.in);
                    System.out.println("\nDigite o nome do Aluno:");
                    String nomeAluno = nomeA.nextLine();
                    a.setNome(nomeAluno);
                    //System.out.println("\nO nome é "+a.getNome());
    

                    
                    do {
                        listaAlunos.inserirPrimeiro(a);
                        fim2++;
                        break;
                    }while(fim2 != 0);
    
                    //System.out.println(listaProfessores.imprimirLista(a));
    
                    break;
    
                case 2: // aqui sera impresso a lista de alunos
                   
                    System.out.println("\nImprimindo lista de alunos: ");
                    System.out.print(listaAlunos.imprimirLista());
                    break;
    
            }
        }
    }
    
        
    
    
}
