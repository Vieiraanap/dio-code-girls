package trabalhandoComCollectiosnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoListParte1 {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("petlov", "rajado", 12));
            add(new Gato("simba", "tigrado", 6));
            add(new Gato("petlov", "preto", 8));
        }};
        System.out.println("Gatos: " + gatos);
        System.out.println("Ordem de insercao: " + gatos);

        Collections.shuffle(gatos);
        System.out.println("Ordem aleatória: " + gatos);

        Collections.sort(gatos);
        System.out.println("Ordem natural: " + gatos);

        Collections.sort(gatos, new CompararIdade());
        System.out.println("Ordem por idade com Collections: " + gatos);

        gatos.sort(new CompararIdade());
        System.out.println("Ordem por idade com Sort: " + gatos);

        Collections.sort(gatos, new CompararCor());
        System.out.println("Ordem por cor: " + gatos);

        Collections.sort(gatos, new CompararNomeCorIdade());
        System.out.println("Ordem por nome -> cor -> idade: " + gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private int idade;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class CompararIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class CompararCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class CompararNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return  cor;
        return Integer.compare(gato1.getIdade(), gato2.getIdade());

    }
}