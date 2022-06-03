public class MainProgram {
    public static void main(String[] args) {
        
        Lista_Encadeada_Simples lista = new Lista_Encadeada_Simples();

        
        lista.adicionaNoComeco("Mauricio");
       System.out.println("Alunos na lista: " + lista);
        lista.adicionaNoComeco("Eduardo");
       System.out.println("Alunos na lista: " + lista);
        lista.adicionaNoComeco("Diego");
       System.out.println("Alunos na lista: " + lista);
        lista.adicionaFim("Arthur");
       System.out.println("Alunos na lista: " + lista);
        lista.adicionaPosicao(2, "Matheus");
       System.out.println("Alunos na lista: " + lista);
        lista.adicionaPosicao(2, "Lucas");
       System.out.println("Alunos na lista: " + lista);

        Object x = lista.pega(1);
        System.out.println("Primeiro aluno da lista: " + x);

        System.out.println("Total de alunos " + lista.tamanho());

        System.out.println("Removendo um aluno...");
        lista.removeDoComeco();
        System.out.println("Alunos na lista: " + lista);
        
        System.out.println("Total de alunos " + lista.tamanho());
    }
}
