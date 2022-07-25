public class Lista_Simples {

    private No prim;        
    private No ult;         
    private int qntdno;     
    private No aux;

    Alunos a = new Alunos();


    public Lista_Simples() {
        this.prim = null;    
        this.ult = null;     
        this.qntdno = 0;     
        this.aux = this.prim;
    }

    public boolean listavazia () {
        return (this.prim == null);
    }

    public void inserirPrimeiro(Alunos a) {
        No novoNo = new No(a);
       
        if(this.listavazia()){
            this.ult = novoNo;
        }
        novoNo.setProx(this.prim);      
        this.prim = novoNo;            
        this.qntdno++;                  
    }

    public No getAux() {
        return aux;
    }
    
    public void setAux(No aux) {
        this.aux = prim;
    }

    public char[] imprimirLista(Alunos a2) {
        return null;
    }

    
}
