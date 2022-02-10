package aulas;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lucky7G {
    private JLabel Label1;
    private JButton buttonLucky7;
    private JLabel LabelPremio;
    private JPanel PainelLucky7;
    private JLabel Label2;
    private JLabel Label3;
    public  static  void main (String[] args)
    {
        JFrame frame=new JFrame("Lucky7G");
        frame.setContentPane(new Lucky7G().PainelLucky7);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public Lucky7G() {
        buttonLucky7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                int num1 = rnd.nextInt(8);
                int num2 = rnd.nextInt(8);
                int num3 = rnd.nextInt(8);
                Label1.setText(String.valueOf(num1));
                Label2.setText(String.valueOf(num2));
                Label3.setText(String.valueOf(num3));

                if (num1 == 7 && num2 == 7 && num3 == 7) {

                    LabelPremio.setText("1º Premio");

                } else if ((num1 == 7 && num2 == 7) || (num2 == 7 && num3 == 7) || (num1 == 7 && num3 == 7)) {
                    LabelPremio.setText("2º Premio");
                } else if ((num1 == 7) || (num2 == 7) || (num3 == 7)) {
                    LabelPremio.setText("3º Premio");
                } else if (num1 + num2 + num3 == 7) {
                    LabelPremio.setText("4º Premio");
                } else {
                    LabelPremio.setText("Sem Premio");
                }

            }
        });

    }
}
