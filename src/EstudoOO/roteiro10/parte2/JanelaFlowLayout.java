package EstudoOO.roteiro10.parte2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaFlowLayout extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;

    public JanelaFlowLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela FlowLayout");
        this.setLayout(new FlowLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn1 = new JButton("Botão 1");
        btn2 = new JButton("Botão 2");
        btn3 = new JButton("Botão 3");
        btn4 = new JButton("Botão 4");
        btn5 = new JButton("Botão 5");
        btn6 = new JButton("Botão 6");

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
    }
}
