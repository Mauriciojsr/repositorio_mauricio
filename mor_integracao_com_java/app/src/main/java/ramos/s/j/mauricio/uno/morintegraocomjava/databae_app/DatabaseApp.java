package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.converter.Converters;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao.ICRUDAlunoDAO;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao.ICRUDAlunoProvaDAO;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao.ICRUDPerguntaDAO;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao.ICRUDProvaDAO;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.interfaces_dao.ICRUDRespostaDAO;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Aluno;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.AlunoProva;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Pergunta;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Prova;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.Resposta;

@Database(entities = {Aluno.class, Prova.class
        , AlunoProva.class, Pergunta.class
        , Resposta.class}
        , exportSchema = false
        , version = 1)

@TypeConverters({Converters.class})


public abstract class DatabaseApp extends RoomDatabase {

    private static final String DB_NAME = "db_app.db";
    private static volatile DatabaseApp sInstance;
    public static final String TAG      = "Database";


    //Definição dos atributos de classe das interfaces DAO
    public abstract ICRUDAlunoDAO alunoDAO();
    public abstract ICRUDAlunoProvaDAO alunoProvaDAO();
    public abstract ICRUDProvaDAO provaDAO();
    public abstract ICRUDPerguntaDAO perguntaDAO();
    public abstract ICRUDRespostaDAO respostaDAO();


    public DatabaseApp() {}

    public static synchronized DatabaseApp getInstance(Context context) {
        if (sInstance == null) {
            sInstance = getConnection(context);
        }
        return sInstance;
    }

    private static DatabaseApp getConnection(Context activityContext) {
        DatabaseApp db = Room.databaseBuilder(activityContext, DatabaseApp.class, DB_NAME)
                .addCallback(initDB)
                .build();

        return db;

    }


    static RoomDatabase.Callback initDB = new RoomDatabase.Callback() {
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadScheduledExecutor().execute(() -> {
                //Executar métodos e\ou rotinas logo appós a criação do banco
                Log.d(TAG, "Banco criado com sucesso! Executar rotinas posteriores.");

            });
        }

        public void onOpen(SupportSQLiteDatabase db){

        }

    };
}
