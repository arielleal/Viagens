package leal.cursoandroid.com.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import leal.cursoandroid.com.ui.Pacote;
import leal.cursoandroid.com.ui.PacoteDAO;
import leal.cursoandroid.com.ui.adapter.ListaPacotesAdapter;
import leal.cursoandroid.com.viagens.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class Activity_Lista_Pacotes extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        setTitle(TITULO_APP_BAR);

        configuraLista();

        Intent intent = new Intent(this, ResumoPacoteActivity.class);
        startActivity(intent);
    }

    private void configuraLista() {
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listView);
        List<Pacote> pacotes = new PacoteDAO().lista();
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes,this));
    }
}
