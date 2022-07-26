package ramos.s.j.mauricio.uno.morintegraocomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.async_crud.AsyncAlunoCRUD;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Aluno;
import ramos.s.j.mauricio.uno.morintegraocomjava.utils_app.UtilsApp;

public class MainActivity extends AppCompatActivity {
    private Aluno aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aluno = new Aluno();
        aluno.setNome("Mauricio");
        aluno.setCelular("4999178-2727");
        aluno.setEmail("mauriciojsr@gmail.com");
        aluno.setGitHub("Mauriciojsr");

    }

    /*@Override
    protected void onResume(){
        super.onResume();

        context = getApplicationContext();

        AsyncAlunoCRUD asyncAlunoCRUD = new AsyncAlunoCRUD(UtilsApp.DataBaseCrudOperations.CREATE
        );
    }*/
}