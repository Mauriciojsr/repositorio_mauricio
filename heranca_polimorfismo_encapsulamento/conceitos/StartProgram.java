package conceitos;

<<<<<<< HEAD
public class StartProgram {
    
    public static void main(String[] args) {
        
=======
import java.util.Scanner;

public class StartProgram {
    
    public static void main(String[] args) {
        //Funcionario funcionario1     = new Funcionario();
        //Funcionario funcionario2     = new Funcionario("Paulo", "5526");
        Diretor diretorCeo           = new Diretor();
       // Diretor diretor2             = new Diretor("De calçados");
        Engenheiro engenheiro1       = new Engenheiro();
        //Engenheiro engenheiro2       = new Engenheiro("25663");
        Gerente gerenteMatriz        = new Gerente();
        //Gerente gerenteFilial        = new Gerente("Litoral");
        Secretaria secretaria1       = new Secretaria();
       // Secretario secretario2       = new Secretario("Cobranca");
        Scanner entradaTeclado       = new Scanner(System.in);

        //System.out.println("Nome do funcionario: ");
        //funcionario1.setNome(entradaTeclado.nextLine());
        //System.out.println("Numero da matricula: ");
        //funcionario1.setMatricula(entradaTeclado.nextLine());
        
        //Diretor
        System.out.print("Nome do Diretor: ");
        diretorCeo.setNome(entradaTeclado.nextLine());

        System.out.print("Matricula: ");
        diretorCeo.setMatricula(entradaTeclado.nextLine());

        System.out.print("Area de Negocio: ");
        diretorCeo.setAreaDeNegocio(entradaTeclado.nextLine());

        System.out.println("");
        
        //Engenheiro
        System.out.print("Nome do Engenheiro: ");
        engenheiro1.setNome(entradaTeclado.nextLine());
        
        System.out.print("Matricula: ");
        engenheiro1.setMatricula(entradaTeclado.nextLine());

        System.out.print("CREA: ");
        engenheiro1.setCrea(entradaTeclado.nextLine());

        System.out.println("");
        
        //Gerente
        System.out.print("Nome do Gerente: ");
        gerenteMatriz.setNome(entradaTeclado.nextLine());
        
        System.out.print("Matricula: ");
        gerenteMatriz.setMatricula(entradaTeclado.nextLine());

        System.out.print("Diretor da loja: ");
        gerenteMatriz.setDiretoria(entradaTeclado.nextLine());

        System.out.println("");

        //Secretario
        System.out.print("Nome do secretario: ");
        secretaria1.setNome(entradaTeclado.nextLine());

        System.out.print("Matricula: ");
        secretaria1.setMatricula(entradaTeclado.nextLine());

        System.out.print("Secretario do departamento: ");
        secretaria1.setDepartamento(entradaTeclado.nextLine());

        System.out.println("");

        entradaTeclado.close();    
        
        //funcionario2.mostrarDados();
        diretorCeo.mostrarDados();
        engenheiro1.mostrarDados();
        gerenteMatriz.mostrarDados();
        secretaria1.mostrarDados();
      
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    }
}
