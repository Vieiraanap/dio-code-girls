package logica.condicional.e.controle.de.fluxos;

public class Main {

    public static void main(String[] args) {

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

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Ana Paula";
        String s2 = "Vieira";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 159L;
        long l2 = 8997L;
        short h1 = 25;

        System.out.println("IGUAL " + (i1 == i2));
        System.out.println("DIFERENTE " + (i1 != i2));
        System.out.println("MAIOR QUE " + (i1 > i2));
        System.out.println("MENOR OU IGUAL " + (i1 <= i2));

        System.out.println("IGUAL " + (f1 == i2));
        System.out.println("DIFERENTE " + (f1 != f2));
        System.out.println("MAIOR QUE " + (f1 > f2));
        System.out.println("MENOR OU IGUAL " + (f1 <= f2));

        System.out.println("IGUAL " + (c1 == c2));
        System.out.println("DIFERENTE " + (c1 != c2));
        System.out.println("MAIOR QUE " + (c1 > c2));
        System.out.println("MENOR OU IGUAL " + (c1 <= c2));

        System.out.println("IGUAL " + (s1 == s2));
        System.out.println("DIFERENTE " + (s1 != s2));
//        System.out.println("MAIOR QUE " + (s1 > s2));
//        System.out.println("MENOR OU IGUAL " + (s1 <= s2));

        System.out.println("IGUAL " + (b1 == b2));
        System.out.println("DIFERENTE " + (b1 != b2));
//        System.out.println("MAIOR QUE " + (b1 > b2));
//        System.out.println("MENOR OU IGUAL " + (b1 <= b2));


        System.out.println("IGUAL " + (d1 == h1));
//        System.out.println("DIFERENTE " + (s2 != c2));
        System.out.println("MAIOR QUE " + (i2 > c2));
//        System.out.println("MENOR OU IGUAL " + (s3 <= i1));

        System.out.println("IGUAL " + (l1 == l2));
        System.out.println("DIFERENTE " + (l1 != l2));
        System.out.println("MAIOR QUE " + (l1 > l2));
        System.out.println("MENOR OU IGUAL " + (l1 <= l2));

        System.out.println("IGUAL " + (l1 == i2));
        System.out.println("DIFERENTE " + (l1 != i2));
        System.out.println("MAIOR QUE " + (l1 > i2));
        System.out.println("MENOR OU IGUAL " + (l1 <= i2));
    }
}
