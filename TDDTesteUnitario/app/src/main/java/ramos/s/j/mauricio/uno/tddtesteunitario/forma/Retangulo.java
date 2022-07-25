package ramos.s.j.mauricio.uno.tddtesteunitario.forma;

public class Retangulo extends Forma{
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 2;
    public static final int POSICAO_ZERO_BASE                = 0;
    public static final int POSICAO_UM_ALTUA                 = 1;
    public static final int POSICAO                          = 2;


    public Retangulo() {

        super(TAMANHO_ARRAY_INFO_CALCULO_AREA);
    }

    /*public int getTamanhoArrayInfoCalculoArea(){

        return TAMANHO_ARRAY_INFO_CALCULO_AREA;
    }*/

    public double calcularPerimetro(){
        double perimetro = POSICAO * (getMedida(POSICAO_ZERO_BASE) + getMedida(POSICAO_UM_ALTUA));

        return perimetro;
    }

    @Override
    public double area() {

        return getMedida(POSICAO_ZERO_BASE) * getMedida(POSICAO_UM_ALTUA);
    }
}
