package entendendoMetodosJava;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área Retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area trapézio: " + ((baseMaior + baseMenor) * altura)/ 2);
    }

    public static double areaRetorno(double lado) {
        return lado * lado;
    }

    public static double areaRetorno(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double areaRetorno(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura)/2;
    }
}