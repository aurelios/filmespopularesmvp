package com.aurelio.filmespopulares.ui.detalhesfilme;

import android.os.Bundle;
import android.widget.TextView;

import com.aurelio.filmespopulares.R;
import com.aurelio.filmespopulares.modal.Filme;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesFilmeActivity extends AppCompatActivity {

    public static final String EXTRA_FILME = "EXTRA_FILME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filmes);

        TextView textTituloFilme = findViewById(R.id.text_titulo_filme);

        final Filme filme = (Filme) getIntent().getSerializableExtra(EXTRA_FILME);

        textTituloFilme.setText(filme.getTitulo());
    }
}
