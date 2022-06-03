package estrutura_condicional;

public class Estrutura {
    private int IDADE_ADULTA = 18;
    private int IDADE_HUMANA_VALIDA = 115;

    public Estrutura(){}

    public boolean validarIdade(int valor){
        if(valor >= IDADE_ADULTA){
            return true;
        } else {
            return false;
        }
    }

    public boolean isHumanBeingValidAge(int age){
        return (age <= IDADE_HUMANA_VALIDA ? true : false);

        /*
        if(age <= IDADE_HUMANA_VALIDA){
            return true;
        } else {
            return false;*/
    }
}
