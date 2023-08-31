package EstudoOO.roteiro3.parte1;

import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, grat, imp, sr;

        System.out.print("Informe o salário base: R$");
        salario = entrada.nextDouble();
        grat = salario * 0.05;
        imp = salario * 0.07;
        sr = salario + grat - imp;

        System.out.println("Salário a receber: R$" + sr);
    }
}
