package estruturasDeRepeticaoEArrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, 2 , 56, 20, 9, -6};
        int i = 0;

        System.out.print("Array: ");
        while (i <= (vetor.length - 1)) {
            System.out.print(vetor[i] + ", ");
            i++;
        }

        System.out.print("Array Invertido: ");
        for (int j = (vetor.length - 1); j >= 0; j--) {
            System.out.print(vetor[j] + ", ");
        }

    }

}
