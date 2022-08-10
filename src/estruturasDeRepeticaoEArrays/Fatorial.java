package estruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.println("Número: ");
        numero = scan.nextInt();

        for (int i = numero; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println("Fatorial: " + resultado);
    }
}
