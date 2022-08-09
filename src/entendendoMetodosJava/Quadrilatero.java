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
}