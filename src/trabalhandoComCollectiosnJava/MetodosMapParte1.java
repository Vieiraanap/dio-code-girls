package trabalhandoComCollectiosnJava;

import java.util.*;

public class MetodosMapParte1 {
    public static void main(String[] args) {

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4d);
            put("uno", 15.6d);
            put("mobi", 16.1d);
            put("hb20", 14.5d);
            put("kwid", 15.6d);
        }};
        System.out.println("Dicionário que relacione os modelos de carros e seus consumos: " + carrosPopulares.toString());

        carrosPopulares.put("gol", 15.2);
        System.out.println("Substituir consumo do gol: " + carrosPopulares.toString());
        System.out.println("Carro argo está no dicionário: " + carrosPopulares.containsKey("argo"));
        System.out.println("Exibir consumo do uno: " + carrosPopulares.get("uno"));

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Exibir modelos: " + modelos);

        System.out.println("Exibir consumos: " + carrosPopulares.values());

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Exibir modelo mais econômico e seu consumo: " + modeloMaisEficiente + " -> " + consumoMaisEficiente);

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Exibir modelo menos econômico e seu consumo: " + modeloMenosEficiente + " -> " + consumoMenosEficiente );

        Iterator<Double> somaConsumos = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (somaConsumos.hasNext()) {
            soma += somaConsumos.next();
        }
        System.out.println("Soma dos consumos: " + soma);

        System.out.println("Média de consumos: " + (soma/carrosPopulares.size()));

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 15.6) iterator.remove();
        }
        System.out.println("Remover modelos com consumo igual a 15.6: " + carrosPopulares.toString());

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4d);
            put("uno", 15.6d);
            put("mobi", 16.1d);
            put("hb20", 14.5d);
            put("kwid", 15.6d);
        }};
        System.out.println("Exibir na ordem que foram informados: " + carrosPopulares1.toString());

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println("Exibir ordenado pelo modelo: " + carrosPopulares2.toString());

        System.out.println("Apagar o dicionário: ");
        carrosPopulares2.clear();

        System.out.println("Conferir se está vazio: " + carrosPopulares2.isEmpty());

//        System.out.println("Exibir o terceiro modelo adicionado: "); -->  dicionário nao é indexado
    }
}
