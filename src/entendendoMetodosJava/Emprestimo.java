package entendendoMetodosJava;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorPago = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Duas parcelas: " + valorPago);
        } else if (parcelas == 3) {

            double valorPago = valor + (valor * getTaxaTresParcelas());

            System.out.println("Três parcelas: " + valorPago);
        } else {
            System.out.println("Quantidade de parcelas inválida");
        }
    }
}
