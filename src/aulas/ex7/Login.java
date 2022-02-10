package aulas.ex7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private JButton entrarButton;
    private JTextField textFieldUser;
    private JButton cancelButton;
    private JPanel PanelLogin;
    private JPasswordField passwordField;

    public Login() {
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String txtUser=textFieldUser.getText();
                String txtPass=String.valueOf(passwordField.getPassword());
                try
                {
                    Connection con=coneccao.CreateConnection();
                    String sql="Select nome, username, password FROM user";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    boolean b =false;
                    while (rs.next())
                    {
                        String nome=rs.getString(1);
                        String user=rs.getString("username");
                        String pass=rs.getString("password");
                        System.out.printf("%s - %s -%s",nome , user,pass);
                        JOptionPane.showMessageDialog(null,nome+":"+user+"."+pass);
                        if(txtUser.equals(user) &&txtPass.equals(pass))
                        {
                            new Form().setVisible(true);
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
    }

    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Gestao de Alunos");
        frame.setContentPane(new Login().PanelLogin);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }}
