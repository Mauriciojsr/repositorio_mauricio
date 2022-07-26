package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.dbcallbacks;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.AlunoProva;


public interface IAlunoProvaDBCallback {

    void getAlunoProvaFromDB(List<AlunoProva> tblAlunoProva);
}
