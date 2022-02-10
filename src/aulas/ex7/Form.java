package aulas.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JPanel PanelPrincipal;
    private JButton gestãoDeAlunosButton;
    private JButton gestãoDeTurmaButton;

    public Form() {
        gestãoDeAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GestaoTurma().setVisible(true);


            }
        });

        gestãoDeTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoTurmas().setVisible(true);
            }
        });
    }
    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestao de Alunos e Turmas");
        frame.setContentPane(new Form().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
