package EstudoOO.roteiro10.parte4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSemLayout extends JFrame implements ActionListener {

    private int largura = 500;
    private int altura = 500;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;

    public JanelaSemLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela Sem Layout");
        this.setLayout(null);
        this.iniciarComponentes();
        this.setVisible(true);



    }

    public void iniciarComponentes() {

        btn1 = new JButton("Botão 1");
        btn2 = new JButton("Botão 2");
        btn3 = new JButton("Botão 3");
        btn4 = new JButton("Botão 4");
        btn5 = new JButton("Botão 5");
        btn6 = new JButton("Botão 6");

        btn1.setBounds(20, 50, 90, 30);
        btn2.setBounds(130, 50, 90, 30);
        btn3.setBounds(30, 90, 90, 30);
        btn4.setBounds(140, 90, 90, 30);
        btn5.setBounds(40, 130, 90, 30);
        btn6.setBounds(150, 130, 90, 30);

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        JButton b = (JButton)o;
        String nome = b.getText();

        System.out.println("Clique do mouse acionado por " + nome + " da classe " + o.getClass());
    }
}
