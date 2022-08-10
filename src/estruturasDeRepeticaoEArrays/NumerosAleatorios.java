package estruturasDeRepeticaoEArrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aletórios");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("");
        System.out.println("Sucessores Numeros Aletórios");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("");
        System.out.println("Antecessores Numeros Aletórios");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }
    }
}
