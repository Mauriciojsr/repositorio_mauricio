package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;


import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.AlunoProva;

@Dao
public interface ICRUDAlunoProvaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAlunoProva(AlunoProva tlbAlunoProva);

    @Query("SELECT * FROM tblAlunoProva where aluno_id = :id")
    AlunoProva getEspecificAlunoProvaByID(int id);

    @Query("SELECT * FROM tblAlunoProva ORDER BY aluno_id DESC")
    List<AlunoProva> getAllAlunoProva();

    @Transaction
    @Update(entity = AlunoProva.class, onConflict = OnConflictStrategy.REPLACE)
    void updateAlunoProva(AlunoProva tblAlunoProva);

    @Transaction
    @Delete(entity = AlunoProva.class)
    void deleteAlunoProva(AlunoProva tblAlunoProva);

    @Delete
    @Query("DELETE FROM tblAlunoProva WHERE aluno_id = :id")
    void deleteAlunoProvaByID(int id);

    @Delete
    @Query("DELETE FROM tblAlunoProva WHERE aluno_id > 0")
    void deleAllAlunoProva();
}
