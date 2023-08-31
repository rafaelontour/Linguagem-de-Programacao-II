package EstudoOO.roteiro2.parte4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorNotas = new int[5];
        short c = 0;

        while (c < 5) {
            System.out.print("Informe uma nota: ");
            short nota = entrada.nextShort();

            if (nota >= 0 && nota <= 10) {
                vetorNotas[c] = nota;
                c++;
            } else {
                JOptionPane.showMessageDialog(null, "Insira um valor entre 0 e 10");
            }
        }

        for (c = 0;c < 5;c++) {
            System.out.println(vetorNotas[c]);
        }
    }

}
