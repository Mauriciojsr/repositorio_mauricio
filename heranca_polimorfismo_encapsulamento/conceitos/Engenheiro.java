package conceitos;

public class Engenheiro extends Funcionario {
    private String crea;

    //Construtor Vazio
    public Engenheiro() {}

    //Construtor com parametros
    public Engenheiro(String crea) {
        this.crea = crea;

    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public void mostrarDados(){
        System.out.println("Nome engenheiro: "+ getNome() + ", Matricula: " + getMatricula() + ", CREA: " + crea);
        System.out.println("---------------------------------------------------------------------------------");
    }

}
