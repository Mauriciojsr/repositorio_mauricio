package ramos.s.j.mauricio.uno.tddtesteunitario;


import org.junit.Test;
import static org.junit.Assert.*;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {

    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidadas(){

        Circunferencia circunferencia = new Circunferencia(1);

        double raio = circunferencia.getMedida(-3);
        boolean validacao = raio > 0;

        assertTrue(validacao);
        //assertEquals(validacao, raio > 0);

    }

}
