package trabalhandoComCollectiosnJava;

import java.util.*;
import java.util.function.Function;

public class StreamApiParte1 {
    public static void main(String[] args) {
        Map<String, Livro2> livros = new HashMap<>(){{
            put("Ana Beatriz Barbosa", new Livro2("Mentes Perigosas", 155));
            put("JK Rowlling", new Livro2("Morte Súbita", 250));
            put("Giorgio Faletti", new Livro2("Eu Mato", 400));

        }};

        System.out.println("---------- Ordem aleatória ----------: " + livros.toString());
        for (Map.Entry<String, Livro2> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Map<String, Livro2> livros1 = new LinkedHashMap<>(){{
            put("Ana Beatriz Barbosa", new Livro2("Mentes Perigosas", 155));
            put("JK Rowlling", new Livro2("Morte Súbita", 250));
            put("Giorgio Faletti", new Livro2("Eu Mato", 400));

        }};
        System.out.println("---------- Ordem inserção ----------: " );
        for (Map.Entry<String, Livro2> livro : livros1.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

        Map<String, Livro2> livros2 = new TreeMap<>(livros1);
        System.out.println("---------- Ordem alfabética autores ----------: " );
        for (Map.Entry<String, Livro2> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

//        Método refatorado para usar classe anônima no comparator
        Set<Map.Entry<String, Livro2>> livros3 = new TreeSet<>(new Comparator<Map.Entry<String, Livro2>>() {
            @Override
            public int compare(Map.Entry<String, Livro2> o1, Map.Entry<String, Livro2> o2) {
                return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
            }
        });
        livros3.addAll(livros.entrySet());
        System.out.println("---------- Ordem alfabética livros ----------: ");
        for (Map.Entry<String, Livro2> livro : livros3) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome());
        }

//        Método refatorado para usar classe anônima e método comparing
        System.out.println("---------- Ordem númnero de páginas método comparing  ----------: ");
        Set<Map.Entry<String, Livro2>> livros5 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<String, Livro2>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<String, Livro2> livro) {
                        return livro.getValue().getPaginas();
                    }
                }));

        livros5.addAll(livros.entrySet());
        for (Map.Entry<String, Livro2> livro : livros5) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getPaginas());
        }

        //        Método refatorado para usar lambda e método comparing
        System.out.println("---------- Ordem númnero de páginas método comparing e lambda ----------: ");
        Set<Map.Entry<String, Livro2>> livros6 = new TreeSet<>(Comparator.comparing(
                livro -> livro.getValue().getPaginas()));

        livros6.addAll(livros.entrySet());
        for (Map.Entry<String, Livro2> livro : livros5) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getPaginas());
        }


    }
}

class Livro2 {
    private String nome2;
    private Integer paginas2;

    public Livro2(String nome, Integer paginas) {
        this.nome2 = nome;
        this.paginas2 = paginas;
    }

    public String getNome() {
        return nome2;
    }

    public Integer getPaginas() {
        return paginas2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro2 livro = (Livro2) o;
        return nome2.equals(livro.nome2) && paginas2.equals(livro.paginas2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome2, paginas2);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome2 + '\'' +
                ", paginas=" + paginas2 +
                '}';
    }
}

//class CompararNom implements Comparator<Map.Entry<String, Livro>>{
//
//    @Override
//    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
//        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
//    }
//}

class CompararNumPaginas implements Comparator<Map.Entry<String, Livro2>> {

    @Override
    public int compare(Map.Entry<String, Livro2> o1, Map.Entry<String, Livro2> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}
