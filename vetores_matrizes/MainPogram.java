import java.util.Scanner;

public class MainPogram {

    public static void main(String[] args) {
        //tamanho vetor
        int n = 10;
        //declaraçã do vetor "v"
        int vetorDeInteiros[]                   = new int[n];
        //Matriz
        int vetorDeInteirosMultiDimensional[][] = new int[3][3];
        //indice ou posição
        int i, j;

        Scanner entradaTeclado                  = new Scanner(System.in);

        // Entrada de Dados
        /*for (i=0; i<n; i++) {
            System.out.printf("informe %2d°. valor de %d: ", (i+1),
            n);
            vetorDeInteiros[i] = entradaTeclado.nextInt();
        }*/
        /*int controleDoLacoWhile = 0;
        while(controleDoLacoWhile < vetorDeInteiros.length){
            System.out.printf("informe %2d°. valor de %d: ", (controleDoLacoWhile+1),
            n);
            vetorDeInteiros[controleDoLacoWhile] = entradaTeclado.nextInt();

            controleDoLacoWhile++;        
        }*/

        for (i=0; i<3; i++) {
            System.out.printf("Informe os elementos %da. linha:\n", (i+1));
            for (j=0; j<3; j++) {
              System.out.printf("m[%d][%d] = ", i, j);
              vetorDeInteirosMultiDimensional[i][j] = entradaTeclado.nextInt();
            }
            System.out.printf("\n");
          }
      
          System.out.printf("\n");
          for (i=0; i<3; i++) {
            System.out.printf("%da. linha: ", (i+1));
            for (j=0; j<3; j++) {
              System.out.printf("%d ", vetorDeInteirosMultiDimensional[i][j]);
            }
            System.out.printf("\n");
        }
        int controleDoLacoDoWhile = 0;
        do {
            System.out.printf("informe %2d°. valor de %d: ", (controleDoLacoDoWhile+1),
            n);
            vetorDeInteiros[controleDoLacoDoWhile] = entradaTeclado.nextInt();
            //vetorDeInteirosMultiDimensional[controleDoLacoDoWhile][controleDoLacoDoWhile] = entradaTeclado.nextInt();

            controleDoLacoDoWhile++;
        }while(controleDoLacoDoWhile < vetorDeInteiros.length);


        //Somar todos os valores, definir o maior e o menos valor 
        int soma = 0;
        int menor = vetorDeInteiros[0]; //vetorDeInteiros[0] = 1º valor armazenador no vetor "vetorDeInteiros"   
        int maior = vetorDeInteiros[0];
        
        for (i=0; i<n; i++) {
            soma = soma + vetorDeInteiros[i];

            if (vetorDeInteiros[i] < menor){
                menor = vetorDeInteiros[i];
            }


            if (vetorDeInteiros[i] > maior)
                maior = vetorDeInteiros[i];
        }

        //Saída (resultados)
        System.out.printf("\n");
        for (i=0; i<n; i++){
            if (vetorDeInteiros[i] == menor){
                System.out.printf("vetorDeinteiros[%d] = %2d <--- menor valor\n", i, vetorDeInteiros[i]);
            } else if (vetorDeInteiros[i] == maior){
                System.out.printf("vetorDeInteiros[%d] = %2d <--- maior valor\n", i, vetorDeInteiros[i]);
            } else{
                System.out.printf("vetorDeInteiros[%d] = %2d\n", i, vetorDeInteiros[i]);
            }
        }

        System.out.printf("\n");

        System.out.printf("\nSoma = %d\n", soma);

        entradaTeclado.close();
    }    
}
