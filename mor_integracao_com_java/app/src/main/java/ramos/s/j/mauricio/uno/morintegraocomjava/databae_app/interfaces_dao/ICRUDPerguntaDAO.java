package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Pergunta;

@Dao
public interface ICRUDPerguntaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPergunta(Pergunta tblPergunta);

    @Query("SELECT * FROM tblPergunta where id = :id")
    Pergunta getEspecificPerguntaByID (int id);

    @Query("SELECT * FROM tblPergunta ORDER BY id DESC")
    List<Pergunta> getAllPerguntas();

    @Transaction
    @Update(entity = Pergunta.class, onConflict = OnConflictStrategy.REPLACE)
    void updatePergunta(Pergunta tblPergunta);

    @Transaction
    @Delete(entity = Pergunta.class)
    void deletePergunta(Pergunta tblPergunta);

    @Delete
    @Query("DELETE FROM tblPergunta WHERE id = :id")
    void deletePerguntaByID(int id);

    @Delete
    @Query("DELETE FROM tblPergunta WHERE id > 0")
    void deleteAllPergunta();
}
