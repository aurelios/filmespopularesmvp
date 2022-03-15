package com.aurelio.filmespopulares.mapper;

import com.aurelio.filmespopulares.modal.Filme;
import com.aurelio.filmespopulares.network.response.FilmeResponse;

import java.util.ArrayList;
import java.util.List;


public class FilmeMapper {

    public static List<Filme> deResponseParaDominio(List<FilmeResponse> listaFilmeResponse) {
        List<Filme> listaFilmes = new ArrayList<>();

        for (FilmeResponse filmeResponse : listaFilmeResponse) {
            final Filme filme = new Filme(filmeResponse.getTituloOriginal(), filmeResponse.getCaminhoPoster());
            listaFilmes.add(filme);
        }

        return listaFilmes;
    }
}
