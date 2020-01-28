package leal.cursoandroid.com.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import leal.cursoandroid.com.ui.Pacote;
import leal.cursoandroid.com.util.MoedaUtil;
import leal.cursoandroid.com.viagens.R;

import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;

public class PagamentoActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pagamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle(TITULO_APP_BAR);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

        mostraPreco(pacoteSaoPaulo);
    }

    private void mostraPreco(Pacote pacote) {
        TextView txtPreco = findViewById(R.id.pagamento_preco_pacote);
        String precoFormatado = MoedaUtil.formataParaBrasileiro(pacote.getPreco());
        txtPreco.setText(precoFormatado);
    }
}
