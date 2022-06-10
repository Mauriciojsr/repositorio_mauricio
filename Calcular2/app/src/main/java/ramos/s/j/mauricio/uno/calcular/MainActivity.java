package ramos.s.j.mauricio.uno.calcular;

import androidx.appcompat.app.ActionBar;
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

    public static final String DIVIDIR        = "Dividir";
    public static final String MULTIPLICAR    = "Multiplicar";
    public static final String SOMAR          = "Somar";
    public static final String SUBTRAIR       = "Subtrair";
    public static final String LOGARITMO      = "Logaritmo";
    public static final String POTENCIACAO    = "Potenciação";
    public static final String POTENCIA_DE_10 = "Potencia de 10";
    public static final String RAIZ_QUADRADA  = "Raiz Quadrada";
    public int ZERO = 0;
    public int DEZ = 10;
    private TextView tvResultado;
    private Spinner spiOpcoes;
    private EditText edtNumero1, edtNumero2;
    private ImageView imgOperacao;
    private Button btnCalular;
    private ImageButton imgLimpar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Calculadora Maluca dos DEV!");
        }


        tvResultado = findViewById(R.id.tvResultado);
        spiOpcoes   = findViewById(R.id.spiOpcoes);
        edtNumero1  = findViewById(R.id.edtNumero1);
        edtNumero2  = findViewById(R.id.edtNumero2);
        imgOperacao = findViewById(R.id.imgOperacao);
        btnCalular  = findViewById(R.id.btnCalcular);
        imgLimpar   = findViewById(R.id.imgLimpar);

        imgOperacao.setVisibility(View.INVISIBLE);


        ArrayAdapter<String> adapterOperacoes = new ArrayAdapter<String>(this
                ,android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOperacoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOperacoes);
        spiOpcoes.setOnItemSelectedListener(this);//Usada como argumento do método.



        btnCalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String operacaoSelecionada = spiOpcoes.getSelectedItem().toString();


                if(operacaoSelecionada.equals(DIVIDIR)){
                    if(validarTermosVazios()) {
                        if(validarDivisor()){
                            tvResultado.setText(dividir());
                        }else{
                            Toast.makeText(MainActivity.this, "O divisor não pode ser ZERO!!", Toast.LENGTH_SHORT).show();
                        }

                    } else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();

                    }

                }else  if(operacaoSelecionada.equals(MULTIPLICAR)){
                    if(validarTermosVazios()) {
                        tvResultado.setText(multiplicar());
                    } else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();

                    }

                }else if(operacaoSelecionada.equals(SOMAR)){
                    if(validarTermosVazios()) {
                        tvResultado.setText(somar());
                    } else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();

                    }

                }else if(operacaoSelecionada.equals(SUBTRAIR)){
                    if(validarTermosVazios()) {
                        tvResultado.setText(subtrair());
                    } else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();

                    }

                }else if(operacaoSelecionada.equals(LOGARITMO)){
                    if(validarTermosVazios()) {
                        tvResultado.setText(logaritimo());
                    }else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();
                    }

                }else if(operacaoSelecionada.equals(POTENCIACAO)){
                    if(validarTermosVazios()) {
                        tvResultado.setText(potenciacao());
                    }else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();
                    }

                }else if(operacaoSelecionada.equals(POTENCIA_DE_10)){
                    if(validarRaizPot()) {
                        tvResultado.setText(potencia_10());
                    }else{
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();
                    }

                }else if(operacaoSelecionada.equals(RAIZ_QUADRADA)){
                    if(validarRaizPot()) {
                        tvResultado.setText(raiz());
                    }else {
                        Toast.makeText(MainActivity.this, "Preencha com algum valor!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(MainActivity.this, "Selecione um número e uma opção matemática!!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        imgLimpar.setOnClickListener(new View.OnClickListener() { //Clic do botão limpar
            @Override
            public void onClick(View view) {
                edtNumero1.setText("");
                edtNumero2.setText("");
                tvResultado.setText("");
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

        if(adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Dividendo");
            edtNumero2.setHint("Divisor");
            edtNumero2.setVisibility(View.VISIBLE);


        }else if(adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Multiplicando");
            edtNumero2.setHint("Multiplicador");
            edtNumero2.setVisibility(View.VISIBLE);


        }else if(adapterView.getItemAtPosition(i).toString().equals(SOMAR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Parcela");
            edtNumero2.setHint("Parcela");
            edtNumero2.setVisibility(View.VISIBLE);


        }else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Minuendo");
            edtNumero2.setHint("Subtraendo");
            edtNumero2.setVisibility(View.VISIBLE);

        }else if(adapterView.getItemAtPosition(i).toString().equals(LOGARITMO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.logaritmo, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Logaritmo");
            edtNumero2.setHint("Logaritmando");
            edtNumero2.setVisibility(View.VISIBLE);

        }else if(adapterView.getItemAtPosition(i).toString().equals(POTENCIACAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.x_elevado_y, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Base");
            edtNumero2.setHint("Expoente");
            edtNumero2.setVisibility(View.VISIBLE);

        }else if(adapterView.getItemAtPosition(i).toString().equals(POTENCIA_DE_10)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.pot10, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Potencia");
            edtNumero2.setText("10");
            edtNumero2.setVisibility(View.INVISIBLE);

        }else if(adapterView.getItemAtPosition(i).toString().equals(RAIZ_QUADRADA)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.raiz_quadrada, getTheme()));
            imgOperacao.setVisibility(View.VISIBLE);
            edtNumero1.setHint("Raiz");
            edtNumero2.setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private String dividir(){
        int n1 = Integer.valueOf(edtNumero1.getText().toString()).intValue();
        int n2 = Integer.valueOf(edtNumero2.getText().toString()).intValue();
        int res = n1 / n2;

        return "O resultado da divisão é: " + res;
    }

    private String multiplicar(){
        int n1 = Integer.valueOf(edtNumero1.getText().toString()).intValue();
        int n2 = Integer.valueOf(edtNumero2.getText().toString()).intValue();
        int res = n1 * n2;

        return "O resultado da multiplicação é: " + res;
    }

    private String somar(){
        int n1 = Integer.valueOf(edtNumero1.getText().toString()).intValue();
        int n2 = Integer.valueOf(edtNumero2.getText().toString()).intValue();
        int res = n1+n2;

        return "O resultado da soma é: " + res;
    }

    private String subtrair(){
        int n1 = Integer.valueOf(edtNumero1.getText().toString()).intValue();
        int n2 = Integer.valueOf(edtNumero2.getText().toString()).intValue();
        int res = n1 - n2;

        return "O resultado da subtração é: " + res;
    }

    private String logaritimo(){
        Double n1 = Double.parseDouble(edtNumero1.getText().toString());
        Double n2 = Double.parseDouble(edtNumero2.getText().toString());

        Double res = Math.log(n1/n2);

        return "O retorno da operação é: " + res;
    }

    private String potenciacao(){
        Double n1 = Double.parseDouble(edtNumero1.getText().toString());
        Double n2 = Double.parseDouble(edtNumero2.getText().toString());

        Double res = Math.pow(n1,n2);

        return "O resultado da expressão é: " + res;
    }

    private String potencia_10(){
        Double n1 = Double.parseDouble(edtNumero1.getText().toString());

        Double res = Math.pow(DEZ, n1);

        return "O resultado da expressão: " + res;

    }

    private String raiz(){
        Double n1 = Double.parseDouble(edtNumero1.getText().toString());

        Double res = Math.sqrt(n1);

        return "O resultado da expressão é: " + res;
    }


    private boolean validarTermosVazios(){
        if(!edtNumero1.getText().toString().isEmpty()){
            if(!edtNumero2.getText().toString().isEmpty()){
                return true;
            }else{
                edtNumero2.requestFocus();
                return false;
            }

        }else {
            edtNumero1.requestFocus();
            return false;
        }
    }

    private boolean validarDivisor(){
        int n2 = Integer.valueOf(edtNumero2.getText().toString());
        if(n2 != ZERO){
            return true;

        }else {
            return false;
        }
    }

    private boolean validarRaizPot(){
        if(!edtNumero1.getText().toString().isEmpty()){
            return true;
        }else{
            return false;
        }
    }





}