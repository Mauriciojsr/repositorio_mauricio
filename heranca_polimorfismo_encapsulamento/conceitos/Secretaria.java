package conceitos;

public class Secretaria extends Funcionario {
    private String departamento;

    //Construtor Vazio
    public Secretaria() {}

    //Construtor com parametros
    public Secretaria(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarDados(){
        System.out.println("Nome secretaria: "+ getNome() + ", Matricula: " + getMatricula() + ", Secretario do departamento: " + departamento);
        System.out.println("---------------------------------------------------------------------------------");
    }

    
}
