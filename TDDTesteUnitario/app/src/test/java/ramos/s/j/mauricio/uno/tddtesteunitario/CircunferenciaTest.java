package ramos.s.j.mauricio.uno.tddtesteunitario;


import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

import ramos.s.j.mauricio.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {
    public static final Circunferencia circunferencia = new Circunferencia();
    public static final int POSICAO_ZERO                     = 0;
    public static final int EXPOENTE_2                       = 2;

    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidadas(){
        circunferencia.setMedida(0, 1);

        double raio       = circunferencia.getMedida(0);
        boolean validacao = raio > 0;

        assertTrue(validacao);
        //assertEquals(validacao, raio > 0);

    }

    /*@Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInfomacoesDoCalculoDaArea(){
        //boolean TamanhoValido = circunferencia.setMedida(0, 3) > circunferencia.;

    }*/

    @Test
    public void deveriaCalcularAreaDaCircunferencia(){
        //O cálculo da área de uma circunferência é dada pela fórmula: A = PI * Raio ao quadrado
        int PRECISAO_4_CASAS_DECIMAIS = 4;

        //Valores calculados no papel e caneta:
        double area_raio3             = 28.2743;
        double area_raio4             = 50.2655;
        double area_raio5             = 78.5398;

        //Raio armazenado na estrutura de dados da classe Pai (Forma)
        circunferencia.setMedida(POSICAO_ZERO, 3);

        double area = Math.PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);

        assertEquals("A área de uma circunferência de raio 3 é 28,2743", area_raio3, area, PRECISAO_4_CASAS_DECIMAIS);

    }


}
