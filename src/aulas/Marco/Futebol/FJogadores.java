package aulas.Marco.Futebol;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class FJogadores {
    private JTabbedPane TabbedPane1;
    private JPanel jPaneNovo;
    private JTextField textFieldPeso;
    private JTextField textFieldNome;
    private JTextField TextFieldNCamisola;
    private JTextField textFieldIdade;
    private JButton guardarButton;
    private JButton NovoJogadorButton;
    private JPanel jPaneAlterar;
    private JTextField textFieldAltPesquisa;
    private JButton buttonAltPesquisar;
    private JTextField textFieldAltNome;
    private JTextField textFieldAltIdade;
    private JTextField textFieldAltPeso;
    private JButton alterarButton;
    private JPanel jPaneConsultar;
    private JTextArea textAreaConsultar;
    private JTextField textFieldDadosAluno;
    private JPanel jPaneEliminar;

    private JButton encontrarJogadorButton;
    private JTextField textFieldEliNome;
    private JTextField textFieldEliSalario;
    private JTextField textFieldEliPosição;
    private JButton dadosParaApagarJogadorButton;
    private JTextArea textAreaDadosParaApagar;
    private JTextField textFieldAltura;
    private JTextField textFieldPosiçao;
    private JTextField textFieldRenumeração;
    private JTextField textFieldMorada;
    private JTextArea textAreaSalarioAnual;
    private JTextArea textAreaMassaCorporal;
    private JPanel JPanelJogador;
    private JTextField textFieldaltAltura;
    private JTextField textFieldaltNncamisola;
    private JFormattedTextField textfieldlatmorada;
    private JTextField textFieldaltposição;
    private JTextField textFieldaltrenumeração;
    private JTextField textFieldEliIdade;
    private JTextField textFieldNomeJogadoraApagar;


    public static ArrayList<Jogador> clube = new ArrayList<Jogador>();
    public static Jogador jg, jgd;
    public void setVisible(boolean b)
    {
        JFrame frame = new JFrame("Gestao de Alunos");
        frame.setContentPane(new FJogadores().JPanelJogador);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public FJogadores() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldNome.getText() != "") {
                    jgd = new Jogador();


                    jgd.Nome=textFieldNome.getText();
                     jgd.Idade=Integer.parseInt(textFieldIdade.getText());
                    jgd.Morada=textFieldMorada.getText();
                    jgd.Peso=Integer.parseInt(textFieldPeso.getText());
                    jgd.Altura=Integer.parseInt(textFieldAltura.getText());
                    jgd.NCamisola=Integer.parseInt(TextFieldNCamisola.getText());
                    jgd.Posição=textFieldPosiçao.getText();
                    jgd.Renumeração=Integer.parseInt(textFieldRenumeração.getText());
                    textAreaSalarioAnual.setText(String.valueOf(jgd.SalarioAnual()));
                    textAreaMassaCorporal.setText(String.valueOf(jgd.MassaCorporal()));


                    clube.add(jgd);


                    JOptionPane.showMessageDialog(null, "Jogador guardado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incompletos:Introduza o nome e a idade por favor!");

                }
            }
        });

        NovoJogadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   textAreaSalarioAnual.setText("");
                   textAreaMassaCorporal.setText("");
                   textFieldRenumeração.setText("");
                   textFieldAltura.setText("");
                   textFieldPeso.setText("");
                   textFieldIdade.setText("");
                   textFieldNome.setText("");
                   textFieldPosiçao.setText("");
                   TextFieldNCamisola.setText("");
                   textFieldMorada.setText("");



            }
        });

        TabbedPane1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                textAreaConsultar.setText("");
                for(Jogador a:clube)
                    textAreaConsultar.append(a.toString()+"\n");
            }
        });

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try {

                    jgd.Nome=textFieldAltNome.getText();
                    jgd.Idade=Integer.parseInt(textFieldAltIdade.getText());
                    jgd.Morada=textfieldlatmorada.getText();
                    jgd.Peso=Integer.parseInt(textFieldAltPeso.getText());
                    jgd.Altura=Integer.parseInt(textFieldaltAltura.getText());
                    jgd.NCamisola=Integer.parseInt(textFieldaltNncamisola.getText());
                    jgd.Posição=textFieldaltposição.getText();
                    jgd.Renumeração=Integer.parseInt(textFieldaltrenumeração.getText());




                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Erro :"+ex.getMessage() );
                }

            }
        });

        buttonAltPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldAltPesquisa.getText();
                for (Jogador jgd : clube) {
                    if (jgd.getNome().equals(nome)) {
                        textFieldAltNome.setText(jgd.getNome());
                        textFieldaltAltura.setText(String.valueOf(jgd.Altura));
                        textFieldaltNncamisola.setText(String.valueOf(jgd.NCamisola));
                        textfieldlatmorada.setText(jgd.Morada);
                        textFieldaltposição.setText(jgd.Posição);
                        textFieldaltrenumeração.setText(String.valueOf(jgd.Renumeração));
                        textFieldAltIdade.setText(String.valueOf(jgd.Idade));
                        textFieldAltPeso.setText(String.valueOf(jgd.Peso));
                        break;
                    }
                }
            }
        });
        encontrarJogadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNomeJogadoraApagar.getText();
                for (Jogador a : clube) {
                    if (a.getNome().equals(nome)) {
                        textFieldEliNome.setText(a.getNome());
                        textFieldEliIdade.setText(String.valueOf(a.Idade));
                        textFieldEliSalario.setText(String.valueOf(a.Renumeração));
                       textFieldEliPosição.setText(a.getPosição());

                        int res=JOptionPane.showConfirmDialog(null,"Tem a certeza que quer elimninar estes dados.");
                        if(res==0)
                        {
                            clube.remove(a);
                            JOptionPane.showMessageDialog(null,"Jogador/Jogadores removidos com sucesso");

                        }


                    }
                }
            }
        });
        dadosParaApagarJogadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textAreaDadosParaApagar.setText("");
                for(Jogador a:clube)
                    textAreaDadosParaApagar.append(a.toString()+"\n");
            }
        });
    }
}
