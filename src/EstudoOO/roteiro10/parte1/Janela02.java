package EstudoOO.roteiro10.parte1;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Janela02 extends JFrame {
    private int largura = 300;
    private int altura = 300;
    private JButton btn1;
    private JButton btn2;

    public Janela02() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela 02");
        this.setLayout(null);

        btn1 = new JButton("Botão 1");
        btn2 = new JButton("Botão 2");

        // Definindo a posição dos botões
        btn1.setBounds(20, 50, 100, 40);
        btn2.setBounds(130, 50, 100, 40);

        this.add(btn1);
        this.add(btn2);

        this.setVisible(true);
    }
}
