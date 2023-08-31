package EstudoOO.roteiro2.parte3;

import javax.swing.*;

public class Programa07 {
    public static void main(String[] args) {
        float nota = 0.0f;
        float media = 0.0f;
        float x = 0.0f;
        while (nota != -1) {
            try {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Informe uma nota: "));
                if (nota != -1) {
                    if (nota >= 7) {
                        x++;
                        media += nota;
                        JOptionPane.showMessageDialog(null, "Aprovado");

                    } else {
                        x++;
                        media += nota;
                        JOptionPane.showMessageDialog(null, "Reprovado");
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Média: " + media / x);
    }
}
