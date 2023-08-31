package EstudoOO.roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        Random random = new Random()    ;
        int num = random.nextInt(100) + 1;

        System.out.println(num);

        System.out.print("Tente adivinha o número. Digite um número entre 0 e 100: ");
        Scanner num2 = new Scanner(System.in);
        int num2int = num2.nextInt();

        while (num2int != num) {

            if (num2int > num) {
                JOptionPane.showMessageDialog(null, "Baixo");
            } else {
                JOptionPane.showMessageDialog(null, "Alto");
            }


            System.out.print("Digite outro número: ");
            num2int = num2.nextInt();
        }
        JOptionPane.showMessageDialog(null, "Acertou!");
    }



}
