package EstudoOO.roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, grat, imp, sr;

        System.out.print("Informe o salário base: R$");
        salario = entrada.nextDouble();
        grat = calc(salario, 1);
        imp = calc(salario, 2);
        sr = salario + grat - imp;

        System.out.println("Salário a receber: R$" + sr);
    }

    public static double calc(double valor, int flag) {
        if (flag == 1) {
            return valor * 0.05;
        } else {
            return valor * 0.07;

        }
    }
}
