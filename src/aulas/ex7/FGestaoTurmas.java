package aulas.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FGestaoTurmas {
    private JTextField textFieldDesignTurma;
    private JTextField textFieldNNalunos;
    private JTextField textFieldMedia;
    private JButton atribuirAlunosButton;
    private JTextArea textAreaDadosAlunos;
    private JTextField textFieldNAlunos3Neg;
    private JTextField textFieldNotaMax;
    private JButton guardarTurmaButton;
    private JPanel panelGestaoTurmas;

    public void setVisible(boolean b)
    {
        JFrame frame = new JFrame("Gestao de Turmas");
        frame.setContentPane(new FGestaoTurmas().panelGestaoTurmas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public FGestaoTurmas() {
        atribuirAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    for(Aluno a:GestaoTurma.turma) {
                        textAreaDadosAlunos.append(a.toString() + "\n");

                    }




                }


        });
        guardarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textFieldDesignTurma.getText()!=""&& textAreaDadosAlunos.getText()!=""){
                    Turma t =new Turma();

                    t.SetDesignaçao(textFieldDesignTurma.getText());
                    t.setAlunos(GestaoTurma.turma);
                    textFieldNNalunos.setText(String.valueOf(GestaoTurma.turma.size()));
                    textFieldMedia.setText(String.valueOf(t.MediaTurma()));
                    textFieldNAlunos3Neg.setText(String.valueOf(t.Mais3Negas()));
                    textFieldNotaMax.setText(String.valueOf(t.MediaMaisAlta()));

                }
            }
        });
    }
}
