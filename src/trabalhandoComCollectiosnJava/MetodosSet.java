package trabalhandoComCollectiosnJava;

import java.util.*;

public class MetodosSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 3.8, 7d));
        System.out.println("Conjunto de notas: " + notas.toString());
        System.out.println("Conferir se nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Exibir menor nota: " + Collections.min(notas));
        System.out.println("Exibir maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir soma dos valores: " + soma);
        System.out.println("Média: " + (soma / notas.size()));

        notas.remove(3.8);
        System.out.println("Remover nota 3.8: " + notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7d) iterator1.remove();
        }
        System.out.println("Remover notas menores que 7.0: " + notas);

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 3.8, 7d, 9.8));
        System.out.println("Exibir notas na ordem que foram inseridas: " + notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Exibir notas em ordem crescente: " + notas3);

        notas2.clear();
        System.out.println("Apagar o conjunto: " + notas2);
        System.out.println("Conferir se está vazio: " + notas2.isEmpty());



//        os métodos a seguir não são possíveis pois a estrutura Set
//        não trabalha com posições e índices

//        System.out.println("Posição da nota 8.5: ");
//        System.out.println("Adicionar nota a posição 4: ");
//        System.out.println("Substituir nota 3.8 por 6.0: ");
//        System.out.println("Exibir a terceira nota inserida: ");
//        System.out.println("Remover nota da posição 0: ");


    }
}
