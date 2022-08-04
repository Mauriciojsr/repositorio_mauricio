package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.async_crud;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.List;

import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.DatabaseApp;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.dbcallbacks.IAlunoProvaDBCallback;
import ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas.AlunoProva;
import ramos.s.j.mauricio.uno.morintegraocomjava.utils_app.UtilsApp;


public class AsyncAlunoProvaCRUD extends AsyncTask<AlunoProva, Integer, List<AlunoProva>> {
    private static String TAG = "AsyncAlunoProvaCRUD";
    private UtilsApp.DataBaseCrudOperations dbOperations;
    private Context contextActivityOrFragment;
    private List<AlunoProva> lista = null;

    //Evitar leak de memória
    private WeakReference<IAlunoProvaDBCallback> dbCallBack;

    public AsyncAlunoProvaCRUD(UtilsApp.DataBaseCrudOperations dbOperations
            , Context context
            , IAlunoProvaDBCallback callBack){
        this.dbOperations              = dbOperations;
        this.contextActivityOrFragment = context;
        dbCallBack                     = new WeakReference(callBack);
    }


    @Override
    protected List<AlunoProva> doInBackground(AlunoProva... alunosProvas) {
        try{
            DatabaseApp databaseApp = DatabaseApp.getInstance(contextActivityOrFragment);
            lista                   = null;

            switch (dbOperations){
                case CREATE:{
                    for(AlunoProva alunoProva : alunosProvas) {
                        databaseApp.alunoProvaDAO().insertAlunoProva(alunoProva);
                    }
                    break;
                }
                case READ:{
                    lista = databaseApp.alunoProvaDAO().getAllAlunoProva();
                    break;
                }
                case UPDATE:{
                    databaseApp.alunoProvaDAO().updateAlunoProva(alunosProvas[0]);
                    break;
                }
                case DELETE:{
                    databaseApp.alunoProvaDAO().deleteAlunoProva(alunosProvas[0]);
                    break;
                }
            }
        } catch (Exception e){
            Log.d(TAG, "doInBackground: FALHA - " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    protected void onPostExecute(List<AlunoProva> alunosProvas) {
        super.onPostExecute(alunosProvas);

        if(dbOperations == UtilsApp.DataBaseCrudOperations.CREATE
                || dbOperations == UtilsApp.DataBaseCrudOperations.READ) {
            IAlunoProvaDBCallback callBack = dbCallBack.get();
            if (callBack != null) {
                callBack.getAlunoProvaFromDB(alunosProvas);
            }
        }
    }
}
