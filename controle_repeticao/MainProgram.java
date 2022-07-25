import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import estrutura_condicional.Estrutura;
import estrutura_repeticao.EstruturasDeRepeticao;
import estrutura_repeticao.ListaDeAlunos;

public class MainProgram{

    static int idade;

    public static void main(String[] args) {
        
        Estrutura estrutura             = new Estrutura();
        EstruturasDeRepeticao repeticao = new EstruturasDeRepeticao();
        Scanner entradaTeclado          = new Scanner(System.in);

       /* try {
            System.out.print("Informe a sua idade: ");
            idade = entradaTeclado.nextInt();

            if(!estrutura.isHumanBeingValidAge(idade)){
                System.out.println(idade + " anos de idade, não é uma idade válida para o ser humano");

            } else if(estrutura.validarIdade(idade)){
                System.out.println("Aos " + idade + " anos de idade, voce é um adulto");

            } else {
                System.out.println("Aos " + idade + " ano(s) de idade, voce NÃO é um adulto");

            }


        } catch (InputMismatchException e) {
            StringWriter sw  = new StringWriter();
            PrintWriter pw   = new PrintWriter(sw);
            e.printStackTrace(pw);

            System.out.println("Informe sua idade com um valor numérico, ou o erro: "
            + "\""+ sw.toString() + "\"" + " ocorre!");
        }*/

        System.out.print("Informe um número inteiro positivo para gerar a tabuada: ");
        //repeticao.gerarTabuadaUsandoLacoFor(entradaTeclado.nextInt())?
        //repeticao.gerarTabuadaUsandolacoWhile(entradaTeclado.nextInt());
        repeticao.gerarTabuadaUsandoLacoDoWhile(entradaTeclado.nextInt());
        repeticao.imprimirListaAlunosUsandoForeach(ListaDeAlunos.lista);

        entradaTeclado.close();
    }
}