package logica.condicional.e.controle.de.fluxos;

public class ControleDeFluxo {

    public static void mesesDoAno(int numeroDoMes) {
        if (numeroDoMes == 1) {
            System.out.println("Janeiro");
        } else if (numeroDoMes == 2) {
            System.out.println("Fevereiro");
        } else if (numeroDoMes == 3) {
            System.out.println("Março");
        } else if (numeroDoMes == 4) {
            System.out.println("Abril");
        } else if (numeroDoMes == 5) {
            System.out.println("Maio");
        } else if (numeroDoMes == 6) {
            System.out.println("Junho");
        } else if (numeroDoMes == 7) {
            System.out.println("Julho");
        } else if (numeroDoMes == 8) {
            System.out.println("Agosto");
        } else if (numeroDoMes == 9) {
            System.out.println("Setembro");
        } else if (numeroDoMes == 10) {
            System.out.println("Outubro");
        } else if (numeroDoMes == 11) {
            System.out.println("Novembro");
        } else if (numeroDoMes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido!!");
        }
    }

    public static void ferias(int numeroDoMes) {
        if (numeroDoMes == 6 || numeroDoMes == 12 || numeroDoMes == 1) {
            System.out.println("FÉRIAS!!!!1");
        } else {
            System.out.println("TRABALHO!");
        }
    }

    public static void diaSemana(int diaDaSemana) {
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    public static void numero(int numero) {
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }
    }
}
