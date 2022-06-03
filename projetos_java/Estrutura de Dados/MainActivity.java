package disciplina.java.conceitosestruturadedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import disciplina.java.conceitosestruturadedados.lista_duplamente_encadeada.ListaDuplamenteEncadeadaActivity;
import disciplina.java.conceitosestruturadedados.lista_encadeada.ListaEncadeadaSimples;

public class MainActivity extends AppCompatActivity {
    private EditText edtValorNo;
    private Button btnInserirNoInicio, btnInserirNoFim
            , btnRemoverInicio, btnRemoverFim, btnListaDuplamenteEncadeada;
    private TextView tvLista;

    ListaEncadeadaSimples lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ListaEncadeadaSimples();

        edtValorNo         = findViewById(R.id.tvValorNo);
        btnInserirNoInicio = findViewById(R.id.btnInserirNoInicio);
        btnInserirNoFim    = findViewById(R.id.btnInserirNoFim);
        btnRemoverInicio   = findViewById(R.id.btnRemoverInicio);
        btnRemoverFim      = findViewById(R.id.btnRemoverFim);
        tvLista            = findViewById(R.id.tvLista);

        btnListaDuplamenteEncadeada = findViewById(R.id.btnListaDuplamenteEncadeada);

        btnInserirNoInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtValorNo.getText().toString().isEmpty()) {
                    lista.inserirNoInicioDaLista(Integer.valueOf(edtValorNo.getText().toString()));

                    String no =  "| " + lista.getNo().getDado() + tvLista.getText();
                    tvLista.setText(no);
                    edtValorNo.setText("");
                } else{
                    Toast.makeText(MainActivity.this, "Informe um Nó a ser adicionado ao início da lista.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnInserirNoFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtValorNo.getText().toString().isEmpty()) {
                    lista.inserirNoFinalDaLista(Integer.valueOf(edtValorNo.getText().toString()));

                    String no =  tvLista.getText() + "| " + lista.getFimDaLista().getDado();
                    tvLista.setText(no);
                    edtValorNo.setText("");
                } else{
                    Toast.makeText(MainActivity.this, "Informe um Nó a ser adicionado ao final lista.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRemoverInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvLista.getText().toString().isEmpty()) {
                    lista.removerDoInicioDaLista();

                    if(lista.getNo() != null) {
                        tvLista.setText(lista.getListaEncadeadaSimples());
                        edtValorNo.setText("");
                    }else{
                        tvLista.setText("");
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Não existe Nó a ser removido do início da lista.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRemoverFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvLista.getText().toString().isEmpty()) {
                    lista.removerDoFinalDaLista();

                    if(lista.getNo() != null) {
                        tvLista.setText(lista.getListaEncadeadaSimples());
                        edtValorNo.setText("");
                    } else{
                        tvLista.setText("");
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Não existe Nó a ser removido do final da lista.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnListaDuplamenteEncadeada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityListaDuplamenteEncadeada = new Intent(MainActivity.this, ListaDuplamenteEncadeadaActivity.class);
                startActivity(activityListaDuplamenteEncadeada);
            }
        });
    }
}