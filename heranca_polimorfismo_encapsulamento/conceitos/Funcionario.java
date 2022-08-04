package conceitos;

public class Funcionario {
    private String nome, matricula;

<<<<<<< HEAD
    public Funcionario() {}

=======
    //Construtor Vazio
    public Funcionario() {}

    //Construtor com parametros
    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;

    }
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

<<<<<<< HEAD
=======
    public void mostrarDados(){
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Numero da matricula: " + matricula);
    }

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
}
 