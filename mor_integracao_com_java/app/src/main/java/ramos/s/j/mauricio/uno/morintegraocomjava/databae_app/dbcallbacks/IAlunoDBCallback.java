package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.dbcallbacks;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Aluno;

public interface IAlunoDBCallback {
    void getAlunoFromDB(List<Aluno> tbl_aluno);
}
