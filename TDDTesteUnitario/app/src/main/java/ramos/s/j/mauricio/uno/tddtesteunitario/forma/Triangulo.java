package ramos.s.j.mauricio.uno.tddtesteunitario.forma;

public class Triangulo extends Forma{
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA_TRIANGULO = 3;
    private static final int DIVIDIDO_POR_2                            = 2;
    public static final int POSICA0_UM                                 = 0;
    public static final int POSICA0_DOIS                               = 1;
    public static final int POSICA0_TRES                               = 2;

    /*public Triangulo(int numMedidas) {
        super(numMedidas);
    }*/

    public Triangulo(){
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA_TRIANGULO);
    }

    @Override
    public double area() {
        double perimetro     = getMedida(POSICA0_UM) + getMedida(POSICA0_DOIS) + getMedida(POSICA0_TRES);

        double semiPerimetro = perimetro /DIVIDIDO_POR_2;

        double area          = semiPerimetro * (semiPerimetro - getMedida(POSICA0_UM)) * (semiPerimetro - getMedida(POSICA0_DOIS))
                * (semiPerimetro - getMedida(POSICA0_TRES));
        return Math.sqrt(area);
    }
}
