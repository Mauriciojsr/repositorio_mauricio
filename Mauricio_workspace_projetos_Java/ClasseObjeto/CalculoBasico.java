public class CalculoBasico{
    private long soma, subtração, multiplicação, divisão;

    public CalculoBasico(){}

    public CalculoBasico(long soma, long subtração, long multiplicação, long divisão){
        this.soma = soma;
        this.subtração = subtração;
        this.multiplicação = multiplicação;
        this.divisão = divisão;
    }

    //Método de CLASSE do tipo GET
    //public long getSoma(){
    //    return soma;
    //}

    public long soma(long x, long y){
        this.soma = x + y;

        return soma;
    }

    /*public long getSubtração(){
        return subtração;
    }*/

    public long subtração(long x, long y){
        this.subtração = x - y;

        return subtração;
    }

    /*public long getMultiplicação(){
        return multiplicação;
    }*/

    public long multiplicação(long x, long y){
        this.multiplicação = x * y;

        return multiplicação;
    }

    /*public long getDivisão(){
        return divisão;
    }*/

    public long divisão(long x, long y){
        this.divisão = x / y;

        return divisão;
    }

    public String mostrarDados(){
        String msg = "Soma: "
        + soma
        + "\nSubtração: "
        + subtração
        + "\nMultiplicação: "
        + multiplicação
        + "\nDivisão: "
        + divisão
<<<<<<< HEAD
        + "\n";
=======
        + "\n------------------------------";
>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c

        return msg;

    }

<<<<<<< HEAD
=======
/* metodo do professor
public class CalculoBasico {
    private long somar, subtrair, multiplicar, dividir;

    public CalculoBasico(){}

    public long somar(long x, long y){
        this.somar = x + y;
        return this.somar;
    }

    public long subtrair(long x, long y){
        this.subtrair = x - y;
        return this.subtrair;
    }

    public long multiplicar(long x, long y){
        this.multiplicar = x * y;
        return this.multiplicar;
    }

    public long dividir(long x, long y){
        
        if(y != 0){
            this.dividir = x / y;
            return this.dividir;

        } else{
            return 0;
        }
    }

}
*/

>>>>>>> 2ecf949f8246f2667c14f7a157a6f55a1e01187c
    
    /*public void mostrarDados(){
        System.out.println("Programa Matemático");
        System.out.println("Soma: " + this.soma);
        System.out.println("Subtração: " + this.subtração);
        System.out.println("Multiplicação: " + this.multiplicação);
        System.out.println("Divisão: " + this.divisão);
        System.out.println("-------------------");
    }*/
}

/*
Método Setter (void) 
public void setSoma(){


}
*/



/*import java.util.Scanner;

public class CalculoBasico {
    public static void main(String[] args) {
        int valor1, valor2;

        System.out.println("Programa Matematico");   

        Scanner entradaTeclado = new Scanner( System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = entradaTeclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = entradaTeclado.nextInt();

        entradaTeclado.close();

        CalculoBasico calculoBasico = new CalculoBasico();

        calculoBasico.somaValores(valor1, valor2);
        calculoBasico.subtração(valor1, valor2);
        calculoBasico.multiplicação(valor1, valor2);
        calculoBasico.divisão(valor1, valor2);
         
    } 

    public void somaValores(int valor1, int valor2){       
        int soma = valor1 + valor2;
        System.out.println("O valor da soma é: " + soma);

    }

    public void subtração(int valor1, int valor2){       
        int subtração = valor1 - valor2;
        System.out.println("O valor subtração é: " + subtração);

    }

    public void multiplicação(int valor1, int valor2){       
        int multiplicação = valor1 * valor2;
        System.out.println("O valor subtração é: " + multiplicação);

    }

    public void divisão(int valor1, int valor2){       
        int divisão = valor1 / valor2;
        System.out.println("O valor subtração é: " + divisão);

    }


}*/

/*Criar uma classe chamada CalculoBasico que implemente as 4 operações básicas:
soma, subtração, multiplicação, divisão. Definas os atributos e métodos que achar
necessário p/ que a classe tenha as funcionalidades e comportamentos desejáveis
para atender ao seu propósito. */