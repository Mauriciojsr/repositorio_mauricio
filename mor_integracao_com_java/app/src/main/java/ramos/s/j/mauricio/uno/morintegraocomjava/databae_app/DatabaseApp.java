package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app;


import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class DatabaseApp extends RoomDatabase {
    private static final String DB_NAME = "db_app.db";
    private static volatile DatabaseApp sInstance;
    public static final String TAG      = "Database";


    public DatabaseApp() {}

    public static synchronized DatabaseApp getInstance(Context context){
        return null;

    }

    private static DatabaseApp getConnection(Context contextActivity){
        return null;
    }

    static RoomDatabase.Callback initDB = new RoomDatabase.Callback() {
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            Executors.newSingleThreadScheduledExecutor().execute(() -> {
                //Executar métodos e\ou rotinas logo aós a criação do banco
                Log.d(TAG,"Banco criado com sucesso! Exeutar rotinas posteriores.");
            });
        }
        
        public void onOpen(SupportSQLiteDatabase db){

        }
    };
}
