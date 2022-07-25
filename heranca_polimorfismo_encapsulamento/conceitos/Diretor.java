package conceitos;

public class Diretor extends Funcionario {
    private String areaDeNegocio;

    public Diretor() {}
    
    public String getAreaDeNegocio() {
        return this.areaDeNegocio;
    }

    public void setAreaDeNegocio(String areaDeNegocio) {
        this.areaDeNegocio = areaDeNegocio;
    }

}
