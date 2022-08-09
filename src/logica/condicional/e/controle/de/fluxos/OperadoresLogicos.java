package logica.condicional.e.controle.de.fluxos;

public class OperadoresLogicos {

    public static void logicos() {
        boolean bl1 = true;
        boolean bl2 = false;
        boolean bl3 = true;
        boolean bl4 = false;

        System.out.println("Conjunção: " + (bl1 && bl2));
        System.out.println("Conjunção: " + (bl1 && bl3));

        System.out.println("Disjunção: " + (bl2 || bl3));
        System.out.println("Disjunção: " + (bl2 || bl4));

        System.out.println("xor: " + (bl1 ^ bl3));
        System.out.println("xor: " + (bl4 ^ bl1));

        System.out.println("Negação: " + (!bl1));
        System.out.println("Negação: " + (!bl2));
    }
}
