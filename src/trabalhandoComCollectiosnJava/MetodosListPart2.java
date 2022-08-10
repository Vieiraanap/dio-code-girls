package trabalhandoComCollectiosnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosListPart2 {
    public static void main(String[] args) {
        List<Double> notasGenerics = new ArrayList<Double>();

        notasGenerics.add(7d);
        notasGenerics.add(8.5d);
        notasGenerics.add(9.3d);
        notasGenerics.add(5d);
        notasGenerics.add(7d);
        notasGenerics.add(0d);
        notasGenerics.add(3.6d);

        System.out.println("Terceira nota adicionada: " + notasGenerics.get(2));
        System.out.println("Menor nota: " + Collections.min(notasGenerics));
        System.out.println("Maior nota: " + Collections.max(notasGenerics));

        Iterator<Double> iterator = notasGenerics.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("Média: " + (soma/notasGenerics.size()));

        System.out.println("Remover nota 0.0: " + notasGenerics.remove(0d));

        Iterator<Double> iterator1 = notasGenerics.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
             if (next < 7d) iterator1.remove();
        }
        System.out.println("Remover notas menores que 7.0: " + notasGenerics);

        notasGenerics.clear();
        System.out.println("Apagar lista: " + notasGenerics);

        System.out.println("Is vazia: " + notasGenerics.isEmpty());
    }
}
