package ramos.s.j.mauricio.uno.tddtesteunitario.forma;

public class Retangulo extends Forma{
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 1;

    public Retangulo() {
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA);
    }

    public int getTamanhoArrayInfoCalculoArea(){
        return TAMANHO_ARRAY_INFO_CALCULO_AREA;
    }

    @Override
    public double area() {
        return 0;
    }
}
