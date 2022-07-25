package conceitos;

public class Engenheiro extends Funcionario {
    private String crea;

<<<<<<< HEAD
    public Engenheiro() {}

=======
    //Construtor Vazio
    public Engenheiro() {}

    //Construtor com parametros
    public Engenheiro(String crea) {
        this.crea = crea;

    }

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

<<<<<<< HEAD
    
=======
    public void mostrarDados(){
        System.out.println("Nome engenheiro: "+ getNome() + ", Matricula: " + getMatricula() + ", CREA: " + crea);
        System.out.println("---------------------------------------------------------------------------------");
    }

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
}
