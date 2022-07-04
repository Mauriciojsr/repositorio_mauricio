package ramos.s.j.mauricio.testng;

public interface ICalculadora {
    int soma(int a, int b);

    int subtracao(int a, int b);

    int multiplicacao(int a, int b);

    int divisao(int a, int b) throws Exception;

    boolean equalInteiros(int a, int b);
}
