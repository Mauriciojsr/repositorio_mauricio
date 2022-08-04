import java.util.Scanner;

<<<<<<< HEAD
import lista_encadeada.Alunos;
import lista_encadeada.Lista_Simples;

=======
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
public class MainProgram {


    public static void main(String[] args) {

        Lista_Simples listaProfessores = new Lista_Simples();
        Lista_Simples listaAlunos= new Lista_Simples();

        while(true) {
            System.out.println("Escolha a ação que deseja executar:"
                    + "\n1-Cadastrar Professor"
                    + "\n2-Cadastrar Aluno"
                    + "\n3-Editar dados do Aluno");
<<<<<<< HEAD
            System.out.println("Digite o número da ação que deseja executar: ");
=======
            System.out.print("Digite o número da ação que deseja executar: ");
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
            Scanner menu = new Scanner(System.in);
            int acao = menu.nextInt();
    
            Alunos a = new Alunos();
    
            switch(acao) {
                case 1:
                    int fim2 = 0;
    
                    Scanner nomeA= new Scanner(System.in);
<<<<<<< HEAD
                    System.out.println("\nDigite o nome do Aluno:");
=======
                    System.out.print("\nDigite o nome do Aluno: ");
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
                    String nomeAluno = nomeA.nextLine();
                    a.setNome(nomeAluno);
                    System.out.println("\nO nome é "+a.getNome());
    
                    Scanner matriculaM = new Scanner(System.in);
<<<<<<< HEAD
                    System.out.println("\nDigite a Matrícula do Aluno:");
=======
                    System.out.print("\nDigite a Matrícula do Aluno: ");
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
                    String matricula = matriculaM.nextLine();
                    a.setNome(matricula);
                    System.out.println("\na Matriucla é "+ a.getMatricula());
    
                    int fim;
                    do {
                        listaAlunos.inserirPrimeiro(a);
                        fim2++;
                        break;
                    }while(fim != 0);
    
                    System.out.println(listaAlunos.imprimirLista(a));
    
                    break;
    
                case 2: 
                   
                    System.out.println("\nDigite a sua Matrícula: ");
                    Scanner editar = new Scanner(System.in);
                    int matriculaExiste = editar.nextInt();
                   
                    while (listaAlunos.a.getMatricula() != matriculaExiste) {
                        if (matriculaExiste != listaAlunos.a.getMatricula()){
                            
                            System.out.println();
                            listaAlunos.getAux().getProx();
                            System.out.println(listaAlunos.getAux());
                            
                        }
                        else {
                            //M2.getListademdc().pesquisarNo(crmexiste);
                            System.out.println("\nDigite a sua Matrícula: ");
                            Scanner nova = new Scanner(System.in);
                            int novaMatricula = nova.nextInt();
                            listaAlunos.a.setMatricula(novaMatricula);
                        }
                    }
                    break;
    
            }
        }
    }
    
        
    
    
}
