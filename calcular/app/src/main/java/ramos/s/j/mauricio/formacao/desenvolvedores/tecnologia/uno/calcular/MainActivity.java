package ramos.s.j.mauricio.formacao.desenvolvedores.tecnologia.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static final String DIVIDIR     = "dividir";
    public static final String MULTIPLICAR = "multiplicar";
    public static final String SOMAR       = "somar";
    public static final String SUBTRAIR    = "subtrair";
    private TextView tvOpcao, tvOperacao, tvResultado;
    private Spinner spiOpcoes;
    private EditText edtNumero1, edtNumero2;
    private ImageView imgOperacao;
    private Button btnCalular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        spiOpcoes   = findViewById(R.id.spiOpcoes);
        edtNumero1  = findViewById(R.id.edtNumero1);
        edtNumero2  = findViewById(R.id.edtNumero2);
        imgOperacao = findViewById(R.id.imgOperacao);
        btnCalular  = findViewById(R.id.btnCalcular);

        imgOperacao.setVisibility(View.INVISIBLE);


        ArrayAdapter<String> adapterOperacoesMatematicas = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOperacoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spiOpcoes.setAdapter(adapterOperacoesMatematicas);
        spiOpcoes.setOnItemClickListener((AdapterView.OnItemClickListener) this);//Usada como argumento do método.

        String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();

        btnCalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
        Toast.makeText(this, "Teste",  Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this, "Teste 2", Toast.LENGTH_SHORT).show();
    }


}