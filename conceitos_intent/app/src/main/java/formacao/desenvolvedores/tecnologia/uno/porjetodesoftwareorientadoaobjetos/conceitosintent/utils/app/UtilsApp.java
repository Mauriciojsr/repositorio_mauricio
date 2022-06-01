package formacao.desenvolvedores.tecnologia.uno.porjetodesoftwareorientadoaobjetos.conceitosintent.utils.app;

import android.content.Context;
import android.widget.Toast;

public class UtilsApp {
    //Escopo de classe
    private int soma = 0;


    //Construtor vazio
    public UtilsApp() {
        metodo(5);
    }

    private void metodo(int x){
        //A variavel x tem escopo local do método
    }

    //Converter p/ tipos primitivos do Java
    public int convertToInt(double valorDouble){
        return (int) valorDouble;
    }

    public int convertToInt(Context context, String objstring){
        try {
            return Integer.parseInt(objstring);
        } catch (NumberFormatException e){
            Toast.makeText(context, "Por favor , informe um valor numérico válido", Toast.LENGTH_SHORT).show();
            return 0;
        }
    }

    /*public int convertToInt(String objstring){
        return Integer.parseInt(objstring);
    }*/

    public int convertToInt(byte valorByte){
        return (int) valorByte;
    }

    public int convertToInt(short valorShort){
        return (int) valorShort;
    }

    public int convertToInt(long valorLong){
        return (int) valorLong;
    }



}
