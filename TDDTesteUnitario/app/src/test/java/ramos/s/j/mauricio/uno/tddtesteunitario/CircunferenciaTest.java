package ramos.s.j.mauricio.uno.tddtesteunitario;


import org.junit.Test;
import static org.junit.Assert.*;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {
    public static final Circunferencia circunferencia = new Circunferencia(1);

    CircunferenciaTest(){
        circunferencia.setMedida(0, 2);
    }

    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidadas(){


        circunferencia.setMedida(0, 1);

        double raio = circunferencia.getMedida(0);
        boolean validacao = raio > 0;

        assertTrue(validacao);
        //assertEquals(validacao, raio > 0);

    }

    @Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInfomacoesDoCalculoDaArea(){
        //boolean TamanhoValido = circunferencia.setMedida(0, 3) > circunferencia.;
    }

}
