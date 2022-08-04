public class Funcionario {
    //Aqui seream declarados os atributos da classe

    private String nome, endereço, salário, dataAdmissão;
    
    public Funcionario(){}

    public Funcionario(String nome, String endereço, String salário, String dataAdmissão){
        this.nome = nome;
        this.endereço = endereço;
        this.salário = salário;
        this.dataAdmissão = dataAdmissão;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getSalário() {
        return salário;
    }

    public void setSalário(String salário) {
        this.salário = salário;
    }

    public String getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(String dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public String mostrarDados(){
        String msg = "Nome do Funcionário: "
<<<<<<< HEAD
        + nome
        + "\nEndereço: "
        + endereço
        + "\nSalário: "
        + salário
        + "\nData Admissão: "
        + dataAdmissão
        + "\n";
=======
        + getNome()
        + "\nEndereço: "
        + getEndereço()
        + "\nSalário: "
        + getSalário()
        + "\nData Admissão: "
        + getDataAdmissão()
        + "\n------------------------------";
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c

        return msg;

    }
    /*public void mostrarDados(){
        System.out.println("Funcionários");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereço);
        System.out.println("Salário: " + this.salário);
        System.out.println("Data de Admissão: " + this.dataAdmissão);
        System.out.println("-------------------");
    }*/
}

/*Criar uma classe chamada Funcionario que implemente: nome, endereço, salário, data
de admissão, do funcionário. Definas os atributos e métodos que achar necessário p/
que a classe tenha as funcionalidades e comportamentos desejáveis para atender ao
seu propósito. */
