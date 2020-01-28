package leal.cursoandroid.com.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import leal.cursoandroid.com.ui.Pacote;
import leal.cursoandroid.com.util.DataUtil;
import leal.cursoandroid.com.util.DiasUtil;
import leal.cursoandroid.com.util.MoedaUtil;
import leal.cursoandroid.com.util.ResouceUtil;
import leal.cursoandroid.com.viagens.R;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

public class ResumoPacoteActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Resumo do pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle(TITULO_APP_BAR);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

        mostraLocal(pacoteSaoPaulo);
        mostraImagem(pacoteSaoPaulo);
        mostraDias(pacoteSaoPaulo);
        mostraPreco(pacoteSaoPaulo);
        mostraData(pacoteSaoPaulo);

        Intent intent = new Intent(this, PagamentoActivity.class);
        startActivity(intent);

    }

    private void mostraData(Pacote pacote) {
        TextView periodo = findViewById(R.id.texto_resumo_periodo);
        String dataFormataDaViagem = DataUtil.periodoEmTexto(pacote.getDias());
        periodo.setText(dataFormataDaViagem);
    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.texto_resumo_valor);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }

    private void mostraDias(Pacote pacote) {
        TextView dias = findViewById(R.id.texto_resumo_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacote.getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(Pacote pacote) {
        ImageView imagem = findViewById(R.id.baner_resumo);
        Drawable drawableDoPacote = ResouceUtil.devolveDrawable(this, pacote.getImagem());
        imagem.setImageDrawable(drawableDoPacote);
    }

    private void mostraLocal(Pacote pacote) {
        TextView local = findViewById(R.id.texto_resumo_local);
        local.setText(pacote.getLocal());
    }
}
