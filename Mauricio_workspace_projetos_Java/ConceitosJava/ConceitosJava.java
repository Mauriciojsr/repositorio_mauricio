import java.util.Scanner;

public class ConceitosJava {
    private static String mensagem = "Um valor textual representa os símbolos contidos na tabela ACSII, um padrão UNICODE";
    //private String msg = "Um valor textual representa os"
    // + "símbolos contidos na tabela ACSII, um padrão UNICODE";
      //  + "símbolos contidos na tabela ACSII, um padrão UNICODE";
    //private short tipoNumerico = 500000; Erro do Tipo, onde foi colocado short ao invés de int!

    public ConceitosJava(){}
    
    public static void main(String[] args) throws Exception{
        System.out.println("Primeiro programa em Java da Turma de Formação de Desenvolvedores em Tecnologia da Informação (manhã).");

        System.out.println(mensagem);
        //System.out.println(somaValores(15, 25));

        ConceitosJava conceitosJava = new ConceitosJava();
        System.out.println("O valor da soma é: " + conceitosJava.somaValores(15, 25));

        conceitosJava.compararValores();

    }

    public int somaValores(int x, int y){
        int resultadoSoma = x + y;

        return resultadoSoma;
    }

    public void compararValores(){
        int valor1, valor2;

        //Lê entradas do teclado
        Scanner entradaTeclado = new Scanner( System.in );

        System.out.print( "Digite o 1° valor inteiro: " );
        valor1 = entradaTeclado.nextInt();

        System.out.print( "Digite o 2° valor inteiro: " );
        valor2 = entradaTeclado.nextInt();

        if ( valor1 == valor2 )
            System.out.printf( "%d IGUAL(==) %d\n" , valor1, valor2 );
        else
            System.out.printf( "%d DIFERENTE(!=) %d\n" , valor1, valor2 );

        //Encerra a leitura de dados do teclado
        entradaTeclado.close();
    }
}

//Fim do escopo da classe ConceitosJava

/*O Visual Studio Code é um editor de código-fonte desenvolvido pela Microsoft para Windows, Linux
 e macOS. Ele inclui suporte para depuração, controle de versionamento Git incorporado, 
 realce de sintaxe, complementação inteligente de código, snippets e refatoração de código */