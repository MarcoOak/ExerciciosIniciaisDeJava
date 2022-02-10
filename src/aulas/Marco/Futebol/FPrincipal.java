package aulas.Marco.Futebol;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FPrincipal {
    private JButton clubeButton;
    private JPanel JPanelPrincipal;
    private JButton jogadoresButton;

    public FPrincipal() {
        jogadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FJogadores().setVisible(true);
            }
        });
        clubeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FClubes().setVisible(true);
            }
        });
    }

    public static void setVisible(boolean b)
    {
        JFrame frame=new JFrame("Gestao dos Jogadores");
        frame.setContentPane(new FPrincipal().JPanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}


