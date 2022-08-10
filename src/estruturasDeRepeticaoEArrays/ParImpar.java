package estruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares + " Ímpares: " + impares);

    }
}
