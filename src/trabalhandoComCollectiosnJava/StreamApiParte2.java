package trabalhandoComCollectiosnJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiParte2 {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1", "5", "8", "5", "1");

        System.out.println("Imprimir todos os elementos da lista");
        numeros.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//      utilizando lambda
        System.out.println("utilizando lambda");
        numeros.forEach(s -> System.out.println(s));

        System.out.println("utilizando reference method");
        numeros.forEach(System.out::println);

        System.out.println("os 3 primeiros numeros de um Set");
        numeros.stream().limit(3).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transformar a lista de string em lista de inteiros");
//
        numeros.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });

        System.out.println("utilizando reference method");
        numeros.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Pegar números pares e maiores que 2");
        List<Integer> paresMaioresQueDois = numeros.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());
        System.out.println(paresMaioresQueDois);

        System.out.println("Média dos números");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(v -> System.out.println(v));

        System.out.println("Remover ímpares");
        List<Integer> removerImpares = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        removerImpares.removeIf(impar -> impar % 2 != 0);
        System.out.println(removerImpares);
    }
}
