public class LaboratorioDeInformatica {
    //Aqui seream declarados os atributos da classe

    private String nome;
    private int bloco, quantidadeDeComputadores;
    
    public LaboratorioDeInformatica(){}

    public LaboratorioDeInformatica(String nome, int bloco, int quantidadeDeComputadores){
        this.nome = nome;
        this.bloco = bloco;
        this.quantidadeDeComputadores = quantidadeDeComputadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getQuantidadeDeComputadores() {
        return quantidadeDeComputadores;
    }

    public void setQuantidadeDeComputadores(int quantidadeDeComputadores) {
        this.quantidadeDeComputadores = quantidadeDeComputadores;
    }

    public String mostrarDados(){
        String msg = "Nome do Laboratório: "
        + nome
        + "\nBloco: "
        + bloco
        + "\nQuantidade de Computadores: "
        + quantidadeDeComputadores
        + "\n";

        return msg;

    }

    /*public void mostrarDados(){
        System.out.println("Laboratório de Informática");
        System.out.println("Nome: " + this.nome);
        System.out.println("Bloco: " + this.bloco);
        System.out.println("Quantidade de Computadores: " + this.quantidadeDeComputadores);
        System.out.println("-------------------");
    }*/

}

/* Criar uma classe chamada LaboratórioDeInformatica que implemente: nome, bloco,
quantidade de computadores, sistema operacional, do laboratório de informática.
Definas os atributos e métodos que achar necessário p/ que a classe tenha as
funcionalidades e comportamentos desejáveis para atender ao seu propósito. */