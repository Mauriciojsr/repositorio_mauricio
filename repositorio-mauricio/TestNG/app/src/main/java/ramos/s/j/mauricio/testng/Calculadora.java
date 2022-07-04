package ramos.s.j.mauricio.testng;

public class Calculadora implements ICalculadora{

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtracao(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    @Override
    public int divisao(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("O divisor não pode ser zero");
        }

        return a / b;
    }

    @Override
    public boolean equalInteiros(int a, int b) {
        boolean result = false;

        if (a == b) {
            result = true;
        }

        return result;
    }
}
