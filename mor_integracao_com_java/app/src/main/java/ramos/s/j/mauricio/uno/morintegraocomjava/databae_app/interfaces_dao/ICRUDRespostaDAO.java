package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Prova;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Resposta;

@Dao
public interface ICRUDRespostaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertResposta(Resposta tblResposta);

    @Transaction
    @Query("SELECT * FROM tblResposta where id = :id")
    void getEspecificRespostaByID(int id);

    @Query("SELECT * FROM tblResposta ORDER BY id DESC")
    List<Prova> getAllResposta();

    @Transaction
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateResposta(Resposta tblResposta);

    @Transaction
    @Delete(entity = Resposta.class)
    void deleteResposta(Resposta tblResposta);

    @Delete
    @Query("DELETE FROM tblResposta WHERE id = :id")
    void deleteRespostaByID(int id);

    @Delete
    @Query("DELETE FROM tblResposta WHERE id > 0")
    void deleteAllResposta();
}
