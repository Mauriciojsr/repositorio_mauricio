package formacao.desenvolvedores.tecnologia.uno.estruturasdedadosjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.uno.estruturasdedadosjava.lista_encadeada.ListaEncadeadaSimples;


public class MainActivity extends AppCompatActivity {
    private EditText edtValorNo;
    private Button btnInserirNoInicio, btnInserirNoFim, btnRemoverInicio, btnRemoverFim;
    private TextView tvLista;

    private ListaEncadeadaSimples lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ListaEncadeadaSimples();

        edtValorNo         = findViewById(R.id.edtValorNo);
        btnInserirNoInicio = findViewById(R.id.btnInserirNoInicio);
        btnInserirNoFim    = findViewById(R.id.btnInserirNoFim);
        btnRemoverInicio   = findViewById(R.id.btnRemoverInicio);
        btnRemoverFim      = findViewById(R.id.btnRemoverFim);
        tvLista            = findViewById(R.id.tvLista);

        btnInserirNoInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtValorNo.getText().toString().isEmpty()) {
                    lista.inserirNoInicioDaLista(Integer.valueOf(edtValorNo.getText().toString()));

                    String no ="| " + lista.getNo().getDado() + tvLista.getText();

                    tvLista.setText(no);
                    edtValorNo.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Informe o valor a ser inserido na lista.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnInserirNoFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtValorNo.getText().toString().isEmpty()) {
                    lista.inserirNoFinalDaLista(Integer.valueOf(edtValorNo.getText().toString()));

                    String no ="| " + lista.getNo().getDado() + tvLista.getText();

                    tvLista.setText(no);
                    edtValorNo.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "Informe o valor para ser inserido no final da lista.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnRemoverInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

            }
        });

        btnRemoverFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}