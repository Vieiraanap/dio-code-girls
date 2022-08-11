package trabalhandoComCollectiosnJava;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Westworld", "Ficção Científica", 60));
            add(new Serie("Disjoint", "Comédia", 30));
        }};

        System.out.println("Séries em ordem aleatória: ");
        for ( Serie serie : series ) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoMedioEpisodio());
        }
        System.out.println("");

        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Westworld", "Ficção Científica", 60));
            add(new Serie("Disjoint", "Comédia", 30));
        }};

        System.out.println("Séries em ordem de inserção: ");
        for ( Serie serie : series2 ) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoMedioEpisodio());
        }
        System.out.println("");

        Set<Serie> series3 = new TreeSet<>(series);
        System.out.println("Séries em ordem natural por tempo de episódio: ");
        for ( Serie serie : series3 ) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoMedioEpisodio());
        }
        System.out.println("");

        Set<Serie> series4 = new TreeSet<>(new CompararPorNomeGeneroTempoEp());
        series4.addAll(series);
        System.out.println("Ordem por nome - gênero - tempo: " );
        for ( Serie serie : series4 ) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoMedioEpisodio());
        }
        System.out.println("");
    }
}


class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoMedioEpisodio;

    public Serie(String nome, String genero, Integer tempoMedioEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoMedioEpisodio = tempoMedioEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoMedioEpisodio() {
        return tempoMedioEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoMedioEpisodio=" + tempoMedioEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoMedioEpisodio.equals(serie.tempoMedioEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoMedioEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEp =  Integer.compare(getTempoMedioEpisodio(), serie.getTempoMedioEpisodio());
        if (tempoEp != 0) return tempoEp;
        return getGenero().compareTo(serie.getGenero());

    }
}

class CompararPorNomeGeneroTempoEp implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(serie1.getTempoMedioEpisodio(), serie2.getTempoMedioEpisodio());
    }
}