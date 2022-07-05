package ramos.s.j.mauricio.uno.tddtesteunitario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Retangulo;

public class RetanguloTest {
    public static Retangulo retangulo = new Retangulo();

    @Test
    public void deveriaCalcularAreaDoRetangulo(){
        double area_BaseXAltura    = 10;
        double DIFERENCA_ACEITAVEL = 0.0001;

        retangulo.setMedida(0, 5);
        retangulo.setMedida(1, 3);

        double area = retangulo.getMedida(0) * retangulo.getMedida(1);

        assertEquals("Área de um retângulo: " + area_BaseXAltura, area_BaseXAltura, area, DIFERENCA_ACEITAVEL);

        /*Double calculoPapel = new Double(area_BaseXAltura);
        boolean x = calculoPapel.equals(new Double(area));
        assertTrue(x);*/
    }

    @Test
    public void calcularPerimetroRetangulo(){
        double perimetro_Base5Altura2 = 20;
        double PRECISAO_4_CASAS_DECIMAIS = 0.0001;

        retangulo.setMedida(0, 5);
        retangulo.setMedida(1, 2);

        double perimetro = 2 * (retangulo.getMedida(0) + retangulo.getMedida(1));

        assertEquals("O perímetro de um retângulo de base 5 e altura 2 é : 20", perimetro_Base5Altura2,
                perimetro, PRECISAO_4_CASAS_DECIMAIS);
    }
}
