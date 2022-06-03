public class InstituicaoDeEnsino {
    //Aqui seream declarados os atributos da classe

    private String razãoSocial, cnpj, endereço, cidade, telefone;
        
    public InstituicaoDeEnsino(){}

    public InstituicaoDeEnsino(String razãoSocial, String cnpj, String endereço, String cidade, String telefone){
        this.razãoSocial = razãoSocial;
        this.cnpj = cnpj;
        this.endereço = endereço;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public String getRazãoSocial() {
        return razãoSocial;
    }

    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String mostrarDados(){
        String msg = "Razão Social: "
        + razãoSocial
        + "\nCnpj: "
        + cnpj
        + "\nEndereço: "
        + endereço
        + "\nCidade: "
        + cidade
        + "\nTelefone: "
        + telefone
        + "\n------------------";

        return msg;

    }
   
    /* public void mostrarDados(){
        System.out.println("Instituição de Ensino");
        System.out.println("Razão Social: " + this.razãoSocial);
        System.out.println("Cnpj: " + this.cnpj);
        System.out.println("Endereço: " + this.endereço);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("-------------------");
    }*/

}

/*Criar uma classe chamada InstituicaoDeEnsino que implemente: razão social, cnpj,
endereço, cidade, telefone, da instituição de ensino. Definas os atributos e métodos
que achar necessário p/ que a classe tenha as funcionalidades e comportamentos
desejáveis para atender ao seu propósito. */
