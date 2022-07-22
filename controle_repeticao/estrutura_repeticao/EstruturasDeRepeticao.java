package estrutura_repeticao;

import java.util.List;

public class EstruturasDeRepeticao {
    
    public EstruturasDeRepeticao(){

    }

    public void gerarTabuadaUsandoLacoFor(int numero){
        
        if(numero > 0){
            
            for( int i = 1; i <= 10; i++){
                System.out.println(numero + " X " + i + " = " + (numero*i));
            }

        } else {
            System.out.println("Para gerar a tabuada, informe um valor MAIOR que ZERO");
        }
    }

    public void gerarTabuadaUsandolacoWhile(int numero){
        int DEZ = 10;

        if(numero > 0){
            System.out.println("Tabuada do " + numero);
            int controleDoLacoWhile = 1;
            while(controleDoLacoWhile <= DEZ){
                System.out.println(numero + " X " + controleDoLacoWhile + " = " + (numero*controleDoLacoWhile));
                
                controleDoLacoWhile++;
            }
        } else {
            System.out.println("Para gerar a tabuada informe um valor MAIOR que ZERO");
        }
    }

    public void gerarTabuadaUsandoLacoDoWhile(int numero){
        int DEZ = 10;

        if(numero > 0){
            System.out.println("Tabuada do " + numero);
            int controleDoLacoDoWhile = 1;
            do {
                System.out.println(numero + " X " + controleDoLacoDoWhile + " = " + (numero*controleDoLacoDoWhile));

                controleDoLacoDoWhile++;
            }while(controleDoLacoDoWhile <= DEZ);
        
        } else {
            System.out.println("Para gerar a tabuada, informe um valor MAIOR que ZERO");
        } 
    }


    public void imprimirListaAlunosUsandoForeach(List<String> listaDeAlunos){
        if(listaDeAlunos != null){
            if(listaDeAlunos.size() > 0){
                System.out.println("Lista de alunos do curso Formação de Desenvolvedores em TI");
                for(String aluno : listaDeAlunos){
                    System.out.println(aluno);
                }
            } else {
                System.out.println("Lista de alunos vazia.");
            }

        } else {
            System.out.println("Lista de alunos invalida.");
        }
    }
}
