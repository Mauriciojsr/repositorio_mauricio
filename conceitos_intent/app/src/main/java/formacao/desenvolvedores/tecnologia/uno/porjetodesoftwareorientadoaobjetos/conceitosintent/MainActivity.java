package formacao.desenvolvedores.tecnologia.uno.porjetodesoftwareorientadoaobjetos.conceitosintent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.uno.porjetodesoftwareorientadoaobjetos.conceitosintent.utils.app.UtilsApp;

public class MainActivity extends AppCompatActivity {
    //Atributos de classe
    public static final String TAG = "Main";
    private Button btnPerguntar;
    private TextView tvExibirRespota;
    private TextView tvTitulo;
    private EditText edtPergunta;
    private ImageButton btnDelete;
    public static final int REQUEST_CODE = 5;
    private ActivityResultLauncher<Intent> activityResultLauncher; //<...> Generics



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPerguntar    = findViewById(R.id.btnPerguntar);
        tvExibirRespota = findViewById(R.id.tvExibirResposta);
        edtPergunta     = findViewById(R.id.edtPergunta);
        btnDelete       = findViewById(R.id.btnDelete);
        tvTitulo        = findViewById(R.id.tvTitulo);

        tvTitulo.setVisibility(View.INVISIBLE);


        btnPerguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtPergunta.getText().toString().isEmpty()){
                    if(Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
                        Intent irParaOutraActivity = new Intent(MainActivity.this, RespostaActivity.class);

                        String conteudo = edtPergunta.getText().toString();
                        irParaOutraActivity.putExtra("Pergunta", conteudo);


                        startActivityForResult(irParaOutraActivity, REQUEST_CODE);
                    }else {

                    }


                } else {
                    Toast.makeText(MainActivity.this, "Insira uma pergunta", Toast.LENGTH_LONG).show();
                }
                    openActivityForResult();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtPergunta.setText("");
                tvExibirRespota.setText("");
            }
        });

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult()
                , new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    tvTitulo.setVisibility(View.VISIBLE);
                    tvExibirRespota.setText(data.getExtras().getString("returnData"));
                }
            }
        });

        UtilsApp utilsApp = new UtilsApp();
        Log.d(TAG, "valor convertido de tipo primitivo float p/ int: " + utilsApp.convertToInt(5.1987));

        byte b = 55;
        Log.d(TAG, "valor convertido de tipo primitivo byte p/ int: " + utilsApp.convertToInt(b));

        short c = 256;
        Log.d(TAG, "valor convertido de tipo primitivo short p/ int: " + utilsApp.convertToInt(c));

        long d = 5548564;
        Log.d(TAG, "valor convertido de tipo primitivo long p/ int: " + utilsApp.convertToInt(d));

        Log.d(TAG,"valor convertido de tipo primitivo String p/ int: " + utilsApp.convertToInt(this, "2"));

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if((requestCode == REQUEST_CODE) && (resultCode == RESULT_OK)){

            String returnString = data.getExtras().getString("returnData");



            if(returnString != null){
                if(!returnString.isEmpty()){

                    //edtPergunta.setText(returnString);

                }
            }

            tvExibirRespota.setText(returnString);
        }


    }

    private void openActivityForResult(){
        Intent intent01 = new Intent(this, RespostaActivity.class);//Obejetos instanciado, dinamicamente.This==argumento de um método.

        /*String myString = edtPergunta.getText().toString();
        intent01.putExtra("Pergunta", myString);*/


        intent01.putExtra("Pergunta", edtPergunta.getText().toString());

        activityResultLauncher.launch(intent01);

    }




}