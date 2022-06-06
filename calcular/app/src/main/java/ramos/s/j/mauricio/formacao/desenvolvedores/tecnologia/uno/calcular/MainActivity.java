package ramos.s.j.mauricio.formacao.desenvolvedores.tecnologia.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static final String DIVIDIR     = "dividir";
    public static final String MULTIPLICAR = "multiplicar";
    public static final String SOMAR       = "somar";
    public static final String SUBTRAIR    = "subtrair";
    private TextView tvResultado;
    private Spinner spiOpcoes;
    private EditText edtNumero1, edtNumero2;
    private ImageView imgSoma;
    private Button btnCalular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        spiOpcoes   = findViewById(R.id.spiOpcoes);
        edtNumero1  = findViewById(R.id.edtNumero1);
        edtNumero2  = findViewById(R.id.edtNumero2);
        imgSoma     = findViewById(R.id.imgSoma);
        btnCalular  = findViewById(R.id.btnCalcular);

        imgSoma.setVisibility(View.INVISIBLE);


        ArrayAdapter<String> adapterOperacoes = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOperacoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOperacoes);
        spiOpcoes.setOnItemSelectedListener(this);//Usada como argumento do método.

        String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();

        btnCalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResultado.setText(String.valueOf(DIVIDIR));
                tvResultado.setText(String.valueOf(MULTIPLICAR));
                tvResultado.setText(String.valueOf(SOMAR));
                tvResultado.setText(String.valueOf(SUBTRAIR));


                if(operacaoSelecionada == DIVIDIR){

                }

                if(operacaoSelecionada == MULTIPLICAR){

                }

                if(operacaoSelecionada == SOMAR){

                }

                if(operacaoSelecionada == SUBTRAIR){
                }

            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString()
                , Toast.LENGTH_SHORT).show();

        if(adapterView.getItemAtPosition(i).toString() == DIVIDIR){

        }else if(adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)){

        }else if(adapterView.getItemAtPosition(i).toString().equals(SOMAR)){
            imgSoma.setVisibility(View.VISIBLE);

        }else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)){

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}