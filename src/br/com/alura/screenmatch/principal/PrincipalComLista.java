package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão1", 1970);
        Filme meuFilme2 = new Filme("avatar", 1900);
        Filme meuFilme3 = new Filme("Dogviw", 2015);
        meuFilme.setDuracaoEmMinutos(180);

        Serie lost = new Serie("Lost", 2000);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme2);
        lista.add(meuFilme);
        lista.add(meuFilme3);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("paulo");
        buscaPorArtista.add("pedro");
        buscaPorArtista.add("adam sandle");
        System.out.println(buscaPorArtista);


        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);


        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
