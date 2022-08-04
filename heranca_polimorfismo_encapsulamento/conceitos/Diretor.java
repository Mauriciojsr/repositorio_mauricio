package conceitos;

public class Diretor extends Funcionario {
    private String areaDeNegocio;

<<<<<<< HEAD
    public Diretor() {}
=======
    //Construtor Vazio
    public Diretor() {}

    //Construtor com parametros
    public Diretor(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    
    public String getAreaDeNegocio() {
        return this.areaDeNegocio;
    }

    public void setAreaDeNegocio(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }

<<<<<<< HEAD
=======
    public void mostrarDados(){
        System.out.println("Nome diretor: "+ getNome() + ", Matricula: " + getMatricula() + ", Area de negocio: " + areaDeNegocio);
        System.out.println("---------------------------------------------------------------------------------");

    }

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
}
