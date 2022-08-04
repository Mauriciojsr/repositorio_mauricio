import java.io.IOException;

public class MainProgram {
    //Aqui seream declarados os atributos da classe
<<<<<<< HEAD
    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
=======
   /* public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }*/
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    
    public MainProgram(){}

    public static void main(String[] args) throws IOException, InterruptedException {
        //MainProgram.limparTela();

        Aluno aluno                              = new Aluno();
        Aluno aluno2                             = new Aluno();
        Aluno aluno3                             = new Aluno("003", "925866", "Paulo Augusto");
        CustomMessage customMessage              = new CustomMessage();
        CustomMessage customMessage2             = new CustomMessage();
        CalculoBasico calculoBasico              = new CalculoBasico();
        CalculoBasico calculoBasico2             = new CalculoBasico();
        CalculoBasico calculoBasico3             = new CalculoBasico(2+2, 100-25, 2*2, 2/2);
        Disciplina disciplina1                   = new Disciplina();
        Disciplina disciplina2                   = new Disciplina();
        Disciplina disciplina3                   = new Disciplina(58, "Delphi", 60);
        Funcionario funcionario1                 = new Funcionario();
        Funcionario funcionario2                 = new Funcionario();
        Funcionario funcionario3                 = new Funcionario("Jonas Padilha", "Rua São Marcos, 23E Bairro Santa Maria", "R$ 2530.00", "01/02/2012");
        InstituicaoDeEnsino instituicaoDeEnsino  = new InstituicaoDeEnsino();
        InstituicaoDeEnsino instituicaoDeEnsino2 = new InstituicaoDeEnsino();
        InstituicaoDeEnsino instituicaoDeEnsino3 = new InstituicaoDeEnsino("Unopar", "125.256.254/0001-56", "Av Fernando Machado 350D Centro", "Chapecó", "(49) 3356-5475");
        LaboratorioDeInformatica laboratorio     = new LaboratorioDeInformatica();
        LaboratorioDeInformatica laboratorio2    = new LaboratorioDeInformatica();
        LaboratorioDeInformatica laboratorio3    = new LaboratorioDeInformatica("RE", 5, 40);
        
        aluno.setId("001");
        aluno.setMatricula("925864");
<<<<<<< HEAD
        aluno.setNome("Mauricio Ramos");
        

=======
        aluno.setNome("Mauricio");
        
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        aluno2.setId("002");
        aluno2.setMatricula("925865");
        aluno2.setNome("Valentina");

        customMessage.printCustomMessage(aluno.mostrarDados());
        customMessage2.printCustomMessage(aluno2.mostrarDados());
        customMessage.printCustomMessage(aluno3.mostrarDados());
        //aluno.mostrarDados();
<<<<<<< HEAD
=======

        /* metodo do professor
         //Usa o objeto calculoBasico como parâmetro de "valueOf"
        //que é usado como parâmetro de "printCustomMessage".
        customMessage.printCustomMessage("Valor da soma: "
            + String.valueOf(calculoBasico.soma(1457, 2036)));
        */
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        
        calculoBasico.soma(10 , 2);
        calculoBasico.subtração(10 , 2);
        calculoBasico.multiplicação(10 , 2);
        calculoBasico.divisão(10 , 2);
        
<<<<<<< HEAD

=======
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        calculoBasico2.soma(25, 25);
        calculoBasico2.subtração(25, 25);
        calculoBasico2.multiplicação(25, 25);
        calculoBasico2.divisão(25, 25);

        customMessage.printCustomMessage(calculoBasico.mostrarDados());
        customMessage2.printCustomMessage(calculoBasico2.mostrarDados());
        customMessage.printCustomMessage(calculoBasico3.mostrarDados());
      //  calculoBasico.mostrarDados();       
        
        disciplina1.setCódigo(56);
        disciplina1.setNome("Java");
        disciplina1.setCargaHorária(40);
        
<<<<<<< HEAD

=======
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        disciplina2.setCódigo(57);
        disciplina2.setNome("Programação");
        disciplina2.setCargaHorária(60);

        customMessage.printCustomMessage(disciplina1.mostrarDados());
        customMessage2.printCustomMessage(disciplina2.mostrarDados());
        customMessage.printCustomMessage(disciplina3.mostrarDados());
       // disciplina1.mostrarDados();
        
        funcionario1.setNome("João da Silva");
        funcionario1.setEndereço("Rua Sabiá, 23 Efapi, Chapecó");
        funcionario1.setSalário("R$ 2350,25");
        funcionario1.setDataAdmissão("21/02/2002");
        
<<<<<<< HEAD

=======
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        funcionario2.setNome("Arthur da Silva");
        funcionario2.setEndereço("Rua Sabiá, 150 Efapi, Chapecó");
        funcionario2.setSalário("R$ 1350,25");
        funcionario2.setDataAdmissão("15/02/2015");

        customMessage.printCustomMessage(funcionario1.mostrarDados());
        customMessage2.printCustomMessage(funcionario2.mostrarDados());
        customMessage.printCustomMessage(funcionario3.mostrarDados());
       // funcionario1.mostrarDados();
        
        instituicaoDeEnsino.setRazãoSocial("Unochapecó");
        instituicaoDeEnsino.setCnpj("158.564.215/0001-25");
<<<<<<< HEAD
        instituicaoDeEnsino.setEndereço("Servidão Anjos da Guarda, 25 Bairro Efapi");
        instituicaoDeEnsino.setCidade("Chapecó");
        instituicaoDeEnsino.setTelefone("(49) 3325-2564");
        

        instituicaoDeEnsino2.setRazãoSocial("Unoesc");
        instituicaoDeEnsino2.setCnpj("125.664.215/0001-12");
        instituicaoDeEnsino2.setEndereço("Av Nereu Ramos, 25 Bairro Seminário");
=======
        instituicaoDeEnsino.setEndereço("Sv. Anjos da Guarda, 25 Efapi");
        instituicaoDeEnsino.setCidade("Chapecó");
        instituicaoDeEnsino.setTelefone("(49) 3325-2564");
        
        instituicaoDeEnsino2.setRazãoSocial("Unoesc");
        instituicaoDeEnsino2.setCnpj("125.664.215/0001-12");
        instituicaoDeEnsino2.setEndereço("Av Nereu Ramos, 25 Seminário");
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        instituicaoDeEnsino2.setCidade("Chapecó");
        instituicaoDeEnsino2.setTelefone("(49) 3323-1064");

        customMessage.printCustomMessage(instituicaoDeEnsino.mostrarDados());
        customMessage2.printCustomMessage(instituicaoDeEnsino2.mostrarDados());
        customMessage.printCustomMessage(instituicaoDeEnsino3.mostrarDados());
      //  instituicaoDeEnsino.mostrarDados();
        
        laboratorio.setNome("RD");
        laboratorio.setBloco(5);
        laboratorio.setQuantidadeDeComputadores(42);
<<<<<<< HEAD
       

=======
        
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
        laboratorio2.setNome("RA");
        laboratorio2.setBloco(5);
        laboratorio2.setQuantidadeDeComputadores(35);

        customMessage.printCustomMessage(laboratorio.mostrarDados());
        customMessage2.printCustomMessage(laboratorio2.mostrarDados());
        customMessage.printCustomMessage(laboratorio3.mostrarDados());
       // laboratorio.mostrarDados();
    }   

}

/* Criar uma classe chamada MainProgram que consiga fazer uso de todas as classes
mencionadas acima tal que seja possível observar o comportamento e as
funcionalidades através da execução do programa. */