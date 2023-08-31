package EstudoOO.roteiro2.parte4;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorNotas = new int[5];

        for (int c = 0;c < 5;c++) {
            System.out.print("Infore uma nota: ");
            int nota = entrada.nextInt();

            vetorNotas[c] = nota;
        }

        for (int c = 0;c < 5;c++) {
            System.out.println(vetorNotas[c]);
        }
    }

}
