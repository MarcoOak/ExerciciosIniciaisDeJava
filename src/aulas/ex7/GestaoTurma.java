package aulas.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Random;

public class GestaoTurma {
    private JTabbedPane TabbedPane1;
    private JPanel jPaneAlterar;
    private JPanel jPaneNovo;
    private JPanel jPaneConsultar;
    private JPanel jPaneEliminar;
    private JTextField textFieldID;
    private JTextField textFieldMedia;
    private JTextField textFieldNNeg;
    private JButton gerirDisciplinasButton;
    private JButton guardarButton;
    private JTextArea textAreaNotas;
    private JButton adicionarNotaButton;
    private JTextField TextFieldNota;
    private JPanel PanelGestaoAlunos;
    private JButton NovoAlunoButton;
    private JTextField textFieldAltPesquisa;
    private JButton buttonAltPesquisar;
    private JTextField textFieldAltNome;
    private JTextField textFieldAltMedia;
    private JTextField textFieldAltNNegativas;
    private JTextArea textAreaAltNotas;
    private JButton alterarButton;
    private JTextArea textAreaConsultar;
    private JTextField textFieldNomeAlunoApagar;
    private JButton encontrarAlunoButton;
    private JTextField textFieldEliNome;
    private JTextField textFieldEliMedia;
    private JTextField textFieldEliNNeg;
    private JButton dadosParaApagarAlunoButton;
    private JTextArea textAreaDadosParaApagar;
    private JTextField textFieldDadosAluno;

    int nDscpl = 10;
    int[] notas = new int[nDscpl];
    short ap = 0;

    public static ArrayList<Aluno> turma = new ArrayList<Aluno>();
    public static Aluno al, alu;
    public void setVisible(boolean b)
    {
        JFrame frame = new JFrame("Gestao de Alunos");
        frame.setContentPane(new GestaoTurma().PanelGestaoAlunos);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public GestaoTurma() {
        gerirDisciplinasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                int nota = rnd.nextInt(21);
                int total = 0;
                Short nNeg = 0;
                textAreaNotas.setText("");
                for (int i = 0; i < nDscpl; i++) {
                    notas[i] = rnd.nextInt(21);
                    textAreaNotas.append(notas[i] + "\n");
                    total += notas[i];
                    if (notas[i] < 10)
                        nNeg++;
                }
                double media = total / nDscpl;
                textFieldMedia.setText(String.valueOf(media));
                textFieldNNeg.setText(String.valueOf(nNeg));

            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((textFieldID.getText() != "") && (textAreaNotas.getText() != "")) {
                    alu = new Aluno();
                    alu.Nome=textFieldID.getText();
                    alu.Notas=new int[notas.length];
                    System.arraycopy(notas,0,alu.Notas,0,notas.length);
                    turma.add(alu);
                    textFieldMedia.setText(String.valueOf(alu.Media()));
                    textFieldAltNNegativas.setText(String.valueOf(alu.NNegativas()));

                    JOptionPane.showMessageDialog(null, "Aluno guardado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incompletos:Introduza o nome e as notas pro favor!");

                }
            }
        });
        NovoAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldID.setText("");
                textAreaNotas.setText("");
                textAreaNotas.setText("");
                textFieldMedia.setText("");
                textFieldNNeg.setText("");
                TextFieldNota.setText("");
            }
        });
        buttonAltPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldAltPesquisa.getText();
                for (Aluno a : turma) {
                    if (a.GetNome().equals(nome)) {
                        textFieldAltNome.setText(a.GetNome());
                        textAreaAltNotas.setText("");
                        for (int nota : a.GetNotas())
                            textAreaAltNotas.append(nota + "\n");
                        textFieldAltMedia.setText(String.valueOf(a.Media()));
                        textFieldAltNNegativas.setText(String.valueOf(a.NNegativas()));
                        al=a;
                    }
                }
            }
        });
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                        al.SetNome(textFieldAltNome.getText());
                        String[] newStr=textAreaAltNotas.getText().split("\n");
                        int[] arNotas=new int[newStr.length];
                        try {
                            for (int i = 0; i < newStr.length; i++) {
                                arNotas[i] = Integer.parseInt(newStr[i]);
                                al.Notas = arNotas.clone();
                                textFieldAltMedia.setText(String.valueOf(al.Media()));
                                textFieldAltNNegativas.setText(String.valueOf(al.NNegativas()));
                            }
                            //a.SetNotas(notas);
                        }
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(null,"Erro :"+ex.getMessage() );
                        }

            }


        });



        encontrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome=textFieldNomeAlunoApagar.getText();
                for(Aluno a: turma)
                {
                    if(a.GetNome().equals(nome))
                    {
                        textFieldNomeAlunoApagar.setText(a.GetNome());
                        textFieldEliMedia.setText(String.valueOf(a.Media()));
                        textFieldEliNNeg.setText(String.valueOf(a.NNegativas()));
                        int res=JOptionPane.showConfirmDialog(null,"Tem a certeza que quer elimninar estes dados.");
                        if(res==0)
                        {
                            turma.remove(a);
                            JOptionPane.showMessageDialog(null,"Alunos removidos com sucesso");

                        }
                    }
                }

            }
        });
        dadosParaApagarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaDadosParaApagar.setText("");
                for(Aluno a:turma)
                    textAreaDadosParaApagar.append(a.toString()+"\n");
            }
        });
        textFieldDadosAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        TabbedPane1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                textAreaConsultar.setText("");
                for(Aluno a:turma)
                    textAreaConsultar.append(a.toString()+"\n");
            }
        });
    }
}

