package leal.cursoandroid.com.ui.viagens;

import androidx.appcompat.app.AppCompatActivity;
import br.com.alura.aluraviagens.model.Pacote;
import leal.cursoandroid.com.ui.PacoteDAO;
import leal.cursoandroid.com.ui.adapter.ListaPacotesAdapter;
import leal.cursoandroid.com.viagens.R;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class Activity_Lista_Pacotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);

        findViewById(R.id.lista_pacotes_listView);
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listView);

        List<Pacote> pacotes = new PacoteDAO().lista();

        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes,this));
    }
}
