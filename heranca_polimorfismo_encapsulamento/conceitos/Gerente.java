package conceitos;

public class Gerente extends Funcionario{
    private String diretoria;

<<<<<<< HEAD
    public Gerente() {}

=======
    //Construtor Vazio
    public Gerente() {}

    //Construtor com parametros
    public Gerente(String diretoria) {
        this.diretoria = diretoria;
    }

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    public String getDiretoria() {
        return this.diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

<<<<<<< HEAD
=======
    public void mostrarDados(){
        System.out.println("Nome gerente: "+ getNome() + ", Matricula: " + getMatricula() + ", Diretor da loja: " + diretoria);
        System.out.println("---------------------------------------------------------------------------------");
    }
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    
}
