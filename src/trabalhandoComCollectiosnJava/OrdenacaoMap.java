package trabalhandoComCollectiosnJava;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>(){{
            put("Ana Beatriz Barbosa", new Livro("Mentes Perigosas", 155));
            put("JK Rowlling", new Livro("Morte Súbita", 250));
            put("Giorgio Faletti", new Livro("Eu Mato", 400));

        }};

        System.out.println("---------- Ordem aleatória ----------: " + livros.toString());
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Ana Beatriz Barbosa", new Livro("Mentes Perigosas", 155));
            put("JK Rowlling", new Livro("Morte Súbita", 250));
            put("Giorgio Faletti", new Livro("Eu Mato", 400));

        }};
        System.out.println("---------- Ordem inserção ----------: " );
        for (Map.Entry<String, Livro> livro : livros1.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        System.out.println("---------- Ordem alfabética autores ----------: " );
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new CompararNome());
        livros3.addAll(livros.entrySet());
        System.out.println("---------- Ordem alfabética livros ----------: ");
        for (Map.Entry<String, Livro> livro : livros3) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new CompararNumeroPaginas());
        livros4.addAll(livros.entrySet());
        System.out.println("---------- Ordem númnero de páginas ----------: ");
        for (Map.Entry<String, Livro> livro : livros4) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getPaginas());
        }
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class CompararNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class CompararNumeroPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}