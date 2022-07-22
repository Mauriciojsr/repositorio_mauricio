package conceitos;

public class Diretor extends Funcionario {
    private String areaDeNegocio;

    //Construtor Vazio
    public Diretor() {}

    //Construtor com parametros
    public Diretor(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }
    
    public String getAreaDeNegocio() {
        return this.areaDeNegocio;
    }

    public void setAreaDeNegocio(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }

    public void mostrarDados(){
        System.out.println("Nome diretor: "+ getNome() + ", Matricula: " + getMatricula() + ", Area de negocio: " + areaDeNegocio);
        System.out.println("---------------------------------------------------------------------------------");

    }

}
