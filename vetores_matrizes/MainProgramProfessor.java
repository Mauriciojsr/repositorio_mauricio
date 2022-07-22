import java.util.Scanner;

public class MainProgramProfessor {
    private static int TAMANHO_VETOR                 = 10;
    private static int TAMANHO_MATRIX_DUAS_DIMENSOES = 3;

    private int vetorDeInteiros[];
    private int matriz3x3[][];

    public MainProgramProfessor() {}
        
    public static void main(String[] args) {
        MainProgramProfessor obj = new MainProgramProfessor();

        /*obj.criarVetor();
        obj.preencherVetor();
        obj.exibirMsgVetor();*/

        obj.criarMatriz();
        obj.preencherMatriz();
        obj.exibirMsgMatriz();

        
    }

    public void criarVetor(){
        vetorDeInteiros = new int[TAMANHO_VETOR];
    }

    public void preencherVetor(){
        if(vetorDeInteiros != null){
            Scanner entradaTeclado = new Scanner(System.in);
            // Entrada de Dados
            for (int i=0; i<vetorDeInteiros.length; i++) {
                System.out.printf("Informe %2do. valor de %d: ", (i+1), vetorDeInteiros.length);
                vetorDeInteiros[i] = entradaTeclado.nextInt();
            }
            entradaTeclado.close();
        }
    }

    public int somarVetorDeInteiros(){
        int soma = 0;

        for (int i=0; i<vetorDeInteiros.length; i++) {
            soma = soma + vetorDeInteiros[i];

        }

        return soma;
    }

    public int subtrairVetorDeInteiros(){
        int subtrair = 0;

        for (int i=0; i<vetorDeInteiros.length; i++) {
            subtrair = subtrair - vetorDeInteiros[i];

        }

        return subtrair;
    }

    public int menorValorVetor(){
        int menor = vetorDeInteiros[0]; // vetorDeInteiros[0] = 1º valor armazenador no vetor "vetorDeInteiros"
        for (int i=0; i<vetorDeInteiros.length; i++) {
            if (vetorDeInteiros[i] < menor){
                menor = vetorDeInteiros[i];
            }
        }

        return menor;
    }

    public int maiorValorVetor(){
        int maior = vetorDeInteiros[0];
        for (int i=0; i<vetorDeInteiros.length; i++) {
            if (vetorDeInteiros[i] > maior){
                maior = vetorDeInteiros[i];
            }
        }

        return maior;
    }

    public void exibirMsgVetor(){
        int menor, maior;

        menor = menorValorVetor();
        maior = maiorValorVetor();
        
        System.out.printf("\n");
        for (int i=0; i<vetorDeInteiros.length; i++) {
            if (vetorDeInteiros[i] == menor){
                System.out.printf("vetorDeInteiros[%d] = %2d <--- menor valor\n", i, vetorDeInteiros[i]);
            } else if (vetorDeInteiros[i] == maior){
                System.out.printf("vetorDeInteiros[%d] = %2d <--- maior valor\n", i, vetorDeInteiros[i]);
            } else{
                System.out.printf("vetorDeInteiros[%d] = %2d\n", i, vetorDeInteiros[i]);
            }
        }

        System.out.printf("\nSoma do vetor = %d\n", somarVetorDeInteiros());
        System.out.printf("\nSubtracao do vetor = %d\n", subtrairVetorDeInteiros());
    }

    public void criarMatriz(){
        matriz3x3 = new int[TAMANHO_MATRIX_DUAS_DIMENSOES][TAMANHO_MATRIX_DUAS_DIMENSOES];
    }

    public void preencherMatriz(){
        if(matriz3x3 != null){
            Scanner entradaTeclado = new Scanner(System.in);
            // Entrada de Dados da Matriz 3x3
            for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                    System.out.printf("Informe valor para a matriz3x3 [%2d][%2d]: ", i, j);
                    matriz3x3[i][j] = entradaTeclado.nextInt();
                }
            
            }
            entradaTeclado.close();
        }
    }

    public int somarMatrizDeInteiros(){
        int soma = 0;

        if(matriz3x3 != null){
            for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                    soma = soma + matriz3x3[i][j];
    
                }                
            }
        }        

        return soma;
    }

    public int subtrairMatrizDeInteiros(){
        int subtrair = 0;

        if(matriz3x3 != null){
            for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                    subtrair = subtrair - matriz3x3[i][j];
    
                }                
            }
        }        

        return subtrair;
    }
    public int menorValorMatriz(){
        int menor = 0;

        if(matriz3x3 != null){
            menor = matriz3x3[0][0];

            if(matriz3x3 != null){
                for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                    for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                        if (matriz3x3[i][j] < menor){
                            menor = matriz3x3[i][j];
                        }        
                    }                
                }
            }
        }

        return menor;
    }

    public int maiorValorMatriz(){
        int maior = 0;

        if(matriz3x3 != null){
            maior = matriz3x3[0][0];

            if(matriz3x3 != null){
                for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                    for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                        if (matriz3x3[i][j] > maior){
                            maior = matriz3x3[i][j];
                        }        
                    }                
                }
            }
        }

        return maior;
    }

    public void exibirMsgMatriz(){
        int menor, maior;

        menor = menorValorMatriz();
        maior = maiorValorMatriz();

        System.out.printf("\n");
        if(matriz3x3 != null){
            if(matriz3x3.length > 0){        
                for (int i=0; i<TAMANHO_MATRIX_DUAS_DIMENSOES; i++) {//percorre as linhas da matriz 3x3
                    for(int j=0; j<TAMANHO_MATRIX_DUAS_DIMENSOES; j++){//percorre as colunas da matrix 3x3
                        if (matriz3x3[i][j] == menor){
                            System.out.printf("matriz3x3[%d][%d] = %2d <--- menor valor\n", i, j, matriz3x3[i][j]);
                        } else if (matriz3x3[i][j] == maior){
                            System.out.printf("matriz3x3[%d][%d] = %2d <--- maior valor\n", i, j, matriz3x3[i][j]);
                        } else{
                            System.out.printf("matriz3x3[%d][%d] = %2d\n", i, j, matriz3x3[i][j]);
                        }   
                    }                
                }
            }
        }

        System.out.printf("\nSoma da matriz = %d\n", somarMatrizDeInteiros());
        System.out.printf("\nSubtração da matriz = %d\n", subtrairMatrizDeInteiros());
    }

}