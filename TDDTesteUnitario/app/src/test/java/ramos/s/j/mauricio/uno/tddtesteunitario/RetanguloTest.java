package ramos.s.j.mauricio.uno.tddtesteunitario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Retangulo;

public class RetanguloTest {
    public static Retangulo retangulo                        = new Retangulo();
    public static final int POSICAO_ZERO_BASE                = 0;
    public static final int POSICAO_UM_ALTURA                = 1;
    public static final int POSICAO                          = 2;

    @Test
    public void deveriaCalcularAreaDoRetangulo(){
        double area_BaseXAltura    = 10;
        double DIFERENCA_ACEITAVEL = 0.0001;

        retangulo.setMedida(POSICAO_ZERO_BASE, 5);
        retangulo.setMedida(POSICAO_UM_ALTURA, 3);

        double area = retangulo.getMedida(POSICAO_ZERO_BASE) * retangulo.getMedida(POSICAO_UM_ALTURA);

        assertEquals("Área de um retângulo: " + area_BaseXAltura, area_BaseXAltura, area, DIFERENCA_ACEITAVEL);

        /*Double calculoPapel = new Double(area_BaseXAltura);
        boolean x = calculoPapel.equals(new Double(area));
        assertTrue(x);*/
    }

    @Test
    public void calcularPerimetroRetangulo(){
        double perimetro_Base5Altura2    = 20;
        double PRECISAO_4_CASAS_DECIMAIS = 0.0001;

        retangulo.setMedida(POSICAO_ZERO_BASE, 5);
        retangulo.setMedida(POSICAO_UM_ALTURA, 2);

        double perimetro = POSICAO * (retangulo.getMedida(POSICAO_ZERO_BASE) + retangulo.getMedida(POSICAO_UM_ALTURA));

        assertEquals("O perímetro de um retângulo de base 5 e altura 2 é : 20", perimetro_Base5Altura2,
                perimetro, PRECISAO_4_CASAS_DECIMAIS);
    }
}
