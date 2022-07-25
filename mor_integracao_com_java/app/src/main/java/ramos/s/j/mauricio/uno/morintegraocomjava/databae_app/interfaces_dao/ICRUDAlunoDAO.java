package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAluno(Aluno tblAluno);

    @Query("SELECT * FROM tblAluno where id = :id");

    @Query("SELECT * FROM tblAluno ORDER BY id DESC")
    public List<Aluno> getAllAlunos();
}
