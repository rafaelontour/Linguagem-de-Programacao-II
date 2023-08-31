package EstudoOO.roteiro3.parte1;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, grat, imp, sr;

        System.out.print("Informe o salário base: R$");
        salario = entrada.nextDouble();
        grat = calcGrat(salario);
        imp = calcImp(salario);
        sr = salario + grat - imp;

        System.out.println("Salário a receber: R$" + sr);
    }

    public static double calcGrat(double salario) {
        return salario * 0.05;
    }

    public static double calcImp(double salario) {
        return salario * 0.07;
    }
}
