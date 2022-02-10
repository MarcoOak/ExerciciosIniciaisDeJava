package aulas.Marco.Futebol;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FLogin {
    private JTextField textFieldUser;
    private JPasswordField passwordField;
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel JPanelLogin;

    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Gestao dos Jogadores");
        frame.setContentPane(new FLogin().JPanelLogin);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FLogin() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtUser=textFieldUser.getText();
                String txtPass=String.valueOf(passwordField.getPassword());
                try
                {
                    Connection con=conecao.CreateConnection();
                    String sql="Select nome , cc , nomeUtilizador , password FROM funcionarios";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    boolean b =false;
                    while (rs.next())
                    {
                        String nome=rs.getString(1);
                        String nomeUtilizador=rs.getString("nomeUtilizador");
                        String cc=rs.getString("cc");
                        String pass=rs.getString("password");
                        //JOptionPane.showMessageDialog(null,nome+":"+nomeUtilizador+"."+cc+"."+pass);
                        System.out.printf("%s - %s -%s -%s",nome ,cc,nomeUtilizador,pass);
                        if(txtUser.equals(nomeUtilizador) &&txtPass.equals(pass))
                        {

                            new FPrincipal().setVisible(true);

                            b=true;
                        }
                    }
                    if(!b)
                    {
                        JOptionPane.showMessageDialog(null,"Erro! Login incorreto! Password/Username errados");

                    }
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,"Erro" +ex.getMessage());
                }
            }

        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
