package aulas.Marco.Futebol;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FClubes {
    private JTextField textFieldDesignação;
    private JButton buttonAtribuirJogadores;
    private JTextArea textAreaDadosJogadores;
    private JTextField textFieldNJogadores;
    private JTextField textFieldSalarioTotal;
    private JPanel JPanelClube;
    private JButton buttonGuardar;

    public FClubes() {
        buttonAtribuirJogadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(Jogador a:FJogadores.clube)
                    textAreaDadosJogadores.append(a.toString()+"\n");

        }
        });
        buttonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldDesignação.getText()!=""&& textAreaDadosJogadores.getText()!=""){
                    Clube c =new Clube();

                    c.setDesignação(textFieldDesignação.getText());
                    c.setJogadores(FJogadores.clube);
                    textFieldNJogadores.setText(String.valueOf(c.NTotalJogadores()));
                    textFieldSalarioTotal.setText(String.valueOf(c.SalarioAnualTotal()));

                }
            }
        });
    }

    public void setVisible(boolean b)
    {
        JFrame frame = new JFrame("Gestao de Turmas");
        frame.setContentPane(new FClubes().JPanelClube);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
