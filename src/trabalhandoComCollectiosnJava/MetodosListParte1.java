package trabalhandoComCollectiosnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosListParte1 {
    public static void main(String[] args) {

//        Formas de inicializar uma lista
        List notasList = new ArrayList();
        List<Double> notasDiamondOperator = new ArrayList<>();
        List<Double> notasGenerics = new ArrayList<Double>();
        List<Double> notasAsList = new ArrayList<>(Arrays.asList(7d, 5d, 10d));

        notasGenerics.add(7d);
        notasGenerics.add(8.5d);
        notasGenerics.add(9.3d);
        notasGenerics.add(5d);
        notasGenerics.add(7d);
        notasGenerics.add(0d);
        notasGenerics.add(3.6d);

        System.out.println("Lista de Notas: " + notasGenerics.toString());
        System.out.println("Posição nota 5.0: " + notasGenerics.indexOf(5d));

        notasGenerics.add(4, 8d);
        System.out.println("Nota 8.0 na posição 4: " + notasGenerics.toString());

        notasGenerics.set(notasGenerics.indexOf(5d), 6d);
        System.out.println("Nota 5.0 substituída pela nota 6.0: " + notasGenerics);

        System.out.println("Possui nota 5.0: " + notasGenerics.contains(5d));

        System.out.println("Imprimir na ordem em que foram adicionados: ");
        for(Double nota : notasGenerics) {
            System.out.println(nota);
        }
    }
}
