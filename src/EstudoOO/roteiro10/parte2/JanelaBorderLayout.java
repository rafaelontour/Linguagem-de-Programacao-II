package EstudoOO.roteiro10.parte2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JanelaBorderLayout extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;

    public JanelaBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");
        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);

    }

    public void iniciarComponentes(){
        btn1 = new JButton("Botão 1");
        btn2 = new JButton("Botão 2");
        btn3 = new JButton("Botão 3");
        btn4 = new JButton("Botão 4");
        btn5 = new JButton("Botão 5");

        this.add(btn1, BorderLayout.PAGE_START);
        this.add(btn2, BorderLayout.PAGE_END);
        this.add(btn3, BorderLayout.LINE_START);
        this.add(btn4, BorderLayout.LINE_END);
        this.add(btn5, BorderLayout.CENTER);
    }
}