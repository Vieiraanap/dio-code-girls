package entendendoMetodosJava;

public class Main {

    public static void main(String[] args) {
//        Calculadora
        System.out.println("Calculadora");
        Calculadora.soma(4, 8);
        Calculadora.subtracao(20, 6);
        Calculadora.multiplicacao(3, 3);
        Calculadora.divisao(10, 2);

//        Mensagem
        System.out.println("Mensagem");
        Mensagem.exibirMensagem(10);
        Mensagem.exibirMensagem(17);
        Mensagem.exibirMensagem(21);
        Mensagem.exibirMensagem(25);

//        Empréstimo
        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());

//        Quadrilátero
        System.out.println("Quadrilátero");
        Quadrilatero.area(2);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);

    }
}
