package estruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetorConsoantes = new String[6];
        int qtdConsoantes = 0;

        int i = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (
                 !( letra.equals("a") ||
                  letra.equals("e") ||
                  letra.equals("i") ||
                  letra.equals("o") ||
                  letra.equals("u") )
            ) {
                vetorConsoantes[i] = letra;
                qtdConsoantes++;
            }
            i++;
        } while (i < vetorConsoantes.length);

        for ( String consoante : vetorConsoantes ) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.print("Quantidade Consoantes: " + qtdConsoantes);
    }
}
