package estruturasDeRepeticaoEArrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : matriz) {
            for (int elemento : linha ) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
