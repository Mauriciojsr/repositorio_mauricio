package ramos.s.j.mauricio.testng;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculadoraTest {
    private static ICalculadora calculadora;

    @BeforeClass
    public static void initCalculator() {
        calculadora = new Calculadora();
    }

    @BeforeTest
    public void antesDoTeste() {
        System.out.println("Isso é executado antes de cada teste");
    }

    @AfterTest
    public void depoisDeCadaTeste() {
        System.out.println("Isso é executado após cada teste");
    }

    @Test
    public void testeSoma() {
        int result = calculadora.soma(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void testeDivisao() {
        try {
            int result = calculadora.divisao(10, 2);

            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Test(expectedExceptions = Exception.class)
    public void testDivisionException() throws Exception {
        calculadora.divisao(10, 0);
    }

    @Test
    public void testEqual() {
        boolean result = calculadora.equalInteiros(20, 20);
        assertTrue(result);
    }

    @Test
    public void testeSubtracao() {
        int result = 10 - 3;

        assertTrue(result == 7);
    }
}
