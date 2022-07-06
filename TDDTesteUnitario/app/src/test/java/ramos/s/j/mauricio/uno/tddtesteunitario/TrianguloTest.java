package ramos.s.j.mauricio.uno.tddtesteunitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Triangulo;

public class TrianguloTest {
    double DIFERENCA_ACEITAVEL                                         = 0.0001;
    private Triangulo triangulo;
    public static final int POSICA0_UM                                 = 0;
    public static final int POSICA0_DOIS                               = 1;
    public static final int POSICA0_TRES                               = 2;
    private static final int DIVIDIDO_POR_2                            = 2;

    public TrianguloTest() {}

    @Before
    public void objeto(){

        triangulo = new Triangulo();
    }

    @Test
    public void deveriaCalcularUmTriangulo(){
        double areaPapel = 1.732;

        //Lados (L1, L2, L3) do triângulo
        triangulo.setMedida(POSICA0_DOIS, POSICA0_TRES);
        triangulo.setMedida(POSICA0_DOIS, POSICA0_TRES);
        triangulo.setMedida(POSICA0_TRES, POSICA0_TRES);

        double perimetro     = triangulo.getMedida(POSICA0_UM) + triangulo.getMedida(POSICA0_DOIS) + triangulo.getMedida(POSICA0_TRES);

        double semiPerimetro = perimetro / DIVIDIDO_POR_2;

        double area1         = semiPerimetro * (semiPerimetro - triangulo.getMedida(POSICA0_UM)) * (semiPerimetro - triangulo.getMedida(POSICA0_DOIS))
                * (semiPerimetro - triangulo.getMedida(POSICA0_TRES));

        double areaFinal     = Math.sqrt(area1);

        assertEquals("A área do triângulo é: ", areaPapel, areaFinal, DIFERENCA_ACEITAVEL);
    }


}
