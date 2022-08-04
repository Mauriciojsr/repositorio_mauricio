package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO {
    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAluno(Aluno tbl_aluno);

    @Query("SELECT * FROM tbl_aluno where id = :id")
    Aluno getEspecificAlunoByID(int id);

    @Query("SELECT * FROM tbl_aluno ORDER BY id DESC")
    List<Aluno> getAllAlunos();

    @Transaction
    @Update(entity = Aluno.class, onConflict = OnConflictStrategy.REPLACE)
    void updateAluno(Aluno tbl_aluno);

    @Transaction
    @Delete(entity = Aluno.class)
    void deleteAluno(Aluno tbl_aluno);

    @Delete
    @Query("DELETE FROM tbl_aluno WHERE id = :id")
    void deleteAlunoByID(int id);

    @Delete
    @Query("DELETE FROM tbl_aluno WHERE id > 0")
    void deleteAllAlunos();
}


