package ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.formas.Circunferencia;
import ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.formas.Forma;
import ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.formas.Retangulo;
import ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.formas.Triangulo;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Circunferencia c = new Circunferencia(1.5);
        System.out.println("areaCirc = " + c.area());
        Retangulo r = new Retangulo(2.5, 4.0);
        System.out.println("areaRet = " + r.area());
        Forma formas[] = new Forma[3];
        formas[0] = c;
        formas[1] = r;
        formas[2] = new Triangulo(1.0, 2.0, 2.0);
        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]);
            System.out.println("area = " + formas[i].area());
        }

    }
}