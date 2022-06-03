package prova0804;

public class Prova0804_Mauricio_Jose_Da_Silva_Ramos {


    public Prova0804_Mauricio_Jose_Da_Silva_Ramos(){}
    
        public static void main(String[] args) {
            Prova0804_Mauricio_Jose_Da_Silva_Ramos respostas = new Prova0804_Mauricio_Jose_Da_Silva_Ramos();
    
            System.out.println(respostas.provaCabecalho());
            System.out.println(respostas.respostaQuestao01());
            System.out.println(respostas.respostaQuestao02());
            System.out.println(respostas.respostaQuestao03());
            System.out.println(respostas.respostaQuestao04());
            System.out.println(respostas.respostaQuestao05());
            System.out.println(respostas.respostaQuestao06());

        }

        public String provaCabecalho(){
            return "Prova Teórica/Prática" + 
            "Disciplina - Programação de computadores com Java" +
            "\n" + "\nNome do Aluno: Mauricio Jose da Silva Ramos" + 
            "\n" + "\nRespostas: ";            
        }

        public String respostaQuestao01(){
            return "\nA resposta da questão 1: " + "Modificar de acesso que define como a classe podera ser acessada, o nome da " +
            "\nclasse deve começar com letra maiúscula, e usar o abre e fecha chaves.";
        }

        public String respostaQuestao02(){
            return "\nA resposta da questão 2: " + "Nesse caso é criado um método a partir do new, onde a partir dai se pode dar " + 
            "\ncontinuidade para poder colocar atributos da classe criada.";
        }

        public String respostaQuestao03(){
            return "\nA resposta da questão 3: " + "São: byte, short, int, long e char.";
        }

        public String respostaQuestao04(){
            return "\nA resposta da questão 4: " + " Para criar um método de classe deve começar com letra minúscula, preferencialmente" +
            "\nusar verbos, se o nome tiver várias palavras iniciar com minúscula e em seguida com maiúscula, sem dar espaço.";
        }

        public String respostaQuestao05(){
            return "\nA resposta da questão 5: " + "Os astributos podem ser declarados no corpo da classe, ou localmente em qualquer " + 
            "\nparte da implementação de um método. Os métodos cosntrutores são declarados dentro da classe, sem a indicação de retorno.";
        }

        public String respostaQuestao06(){
            return "\nA resposta da questão 6: " + "Regras de esrita dos comandos de texto do Java.";
        }
    
    
}
