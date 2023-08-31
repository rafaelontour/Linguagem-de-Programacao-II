package EstudoOO.roteiro2.parte3;

import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int c = 0;c < 5;c++) {
            System.out.println("informe uma nota: ");
            int nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
