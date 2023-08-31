package EstudoOO.roteiro2.parte3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa06 {
    public static void main(String[] args) {
        int nota = 0;
        while (nota != -1) {
            try {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Informe uma nota: "));
                if (nota != -1) {
                    if (nota >= 7) {
                        JOptionPane.showMessageDialog(null, "Aprovado");

                    } else {
                        JOptionPane.showMessageDialog(null, "Reprovado");
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
