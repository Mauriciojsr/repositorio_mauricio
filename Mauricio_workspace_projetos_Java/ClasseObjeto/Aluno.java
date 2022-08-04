public class Aluno {
   //Aqui seream declarados os atributos da classe
    //private String id, nome, matricula;
    private String id, matricula, nome;

    public Aluno(){}
    //Construtor Vazio
    public Aluno(String id, String matricula, String nome){
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getid() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostrarDados(){
        String msg = "Nome do Aluno: "
<<<<<<< HEAD
        + nome
        + "\nMatricula: "
        + matricula
        + "\nID: "
        + id
        + "\n";
=======
        + getNome()
        + "\nMatricula: "
        + getMatricula()
        + "\nID: "
        + getid()
        + "\n------------------------------";
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c

        return msg;
        
        /*System.out.println("Sobre o Aluno");
        System.out.println("Id: " + this.id);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("-------------------"); */
    }

<<<<<<< HEAD
    public static void limparTela() {
    }
=======
    /*public static void limparTela() {
    }*/
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
  
}

/* Toda classe java precisa de um método construtor
 Criar uma classe chamada Aluno que implemente: ID, matricula, nome, do aluno.
Definas os atributos e métodos que achar necessário p/ que a classe tenha as
funcionalidades e comportamentos desejáveis para atender ao seu propósito.*/
