public class Disciplina {
    //Aqui seream declarados os atributos da classe

    private int código, cargaHorária;
    private String nome;
    
    public Disciplina(){}

    public Disciplina(int código, String nome, int cargaHorária){
        this.código = código;
        this.nome = nome;
        this.cargaHorária = cargaHorária;

    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    public String mostrarDados(){
        String msg = "Código da Disciplina: "
        + getCódigo()
        + "\nNome da Matéria: "
        + getNome()
        + "\nCarga Horária: "
        + getCargaHorária()
        + "\n------------------------------";

        return msg;

    }

   /* public void mostrarDados(){
        System.out.println("Disciplina");
        System.out.println("Código: " + this.código);
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga Horária: " + this.cargaHorária);
        System.out.println("-------------------");
    }*/
}

/* Criar uma classe chamada Disciplina que implemente: código, nome, carga horária, da
disciplina. Definas os atributos e métodos que achar necessário p/ que a classe tenha
as funcionalidades e comportamentos desejáveis para atender ao seu propósito.*/
