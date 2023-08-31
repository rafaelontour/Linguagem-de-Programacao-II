package EstudoOO.roteiro3.parte2;

import java.util.Scanner;

public class Programa13 {
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
                soma(x, y);
                break;
            case "-" :
                subtracao(x, y);
                break;
            case "*" :
                multiplicacao(x, y);
                break;
            case "/" :
                divisao(x, y);
                break;
            default:
                System.out.println("Operacao invalida");
        }
    }
    public static void soma(double x, double y) {
        System.out.println("Resultado : " + (x + y) );
    }

    public static void subtracao(double x, double y) {
        System.out.println("Resultado : " + (x - y) );
    }

    public static void multiplicacao(double x, double y) {
        System.out.println("Resultado : " + (x * y) );
    }

    public static void divisao(double x, double y) {
        System.out.println("Resultado : " + (x / y) );
    }
}
