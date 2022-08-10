package estruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double media;
        int soma = 0;
        int i = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;
            i++;
        } while (i < 5);

        media = soma / 5;
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);
    }
}
