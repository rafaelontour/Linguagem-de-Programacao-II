package EstudoOO.roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Inform o valor de X: ");
        double x = entrada.nextInt();
        System.out.print("Informe a operação (+, -, *, /): ");
        String op = entrada.next();
        System.out.println("Informe o valor de y ");
        double y = entrada.nextDouble();

        switch (op) {
            case "+" :
                System.out.println(soma(x, y));
                break;
            case "-" :
                System.out.println(subtracao(x, y));
                break;
            case "*" :
                System.out.println(multiplicacao(x, y));
                break;
            case "/" :
                System.out.println(divisao(x, y));
                break;
            default:
                System.out.println("Operacao invalida");
        }
    }
    public static double soma(double x, double y) {
        return x + y;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        return x / y;
    }
}
