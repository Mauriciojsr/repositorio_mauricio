package conceitos;

public class Gerente extends Funcionario{
    private String diretoria;

    //Construtor Vazio
    public Gerente() {}

    //Construtor com parametros
    public Gerente(String diretoria) {
        this.diretoria = diretoria;
    }

    public String getDiretoria() {
        return this.diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public void mostrarDados(){
        System.out.println("Nome gerente: "+ getNome() + ", Matricula: " + getMatricula() + ", Diretor da loja: " + diretoria);
        System.out.println("---------------------------------------------------------------------------------");
    }
    
}
