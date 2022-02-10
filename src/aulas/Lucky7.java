package aulas;


import javax.swing.*;
import java.util.Random;

public class Lucky7 {
    public static void main(String[] args)
    {

        int Reiniciar;
        JOptionPane.showMessageDialog(null,"1º Premio-Acertar 3 vezes ,2ºPremio-Acertar 2 vezes 7,3ºPremio-Acertar 1 vez 7,4ºPremio-Soma dos numeors dar 7.");

do {


    Random rnd = new Random();
    int num1 = rnd.nextInt(8);
    int num2 = rnd.nextInt(8);
    int num3 = rnd.nextInt(8);

    if (num1 == 7 && num2 == 7 && num3 == 7) {
        JOptionPane.showMessageDialog(null, "1ºPremio! " + num1 + " , " + num2 + " ," + num3 + " ");

    } else if ((num1 == 7 && num2 == 7) || (num2 == 7 && num3 == 7) || (num1 == 7 && num3 == 7)) {
        JOptionPane.showMessageDialog(null, "2º Premio! " + num1 + " , " + num2 + " ," + num3 + " ");
    } else if ((num1 == 7) || (num2 == 7) || (num3 == 7)) {
        JOptionPane.showMessageDialog(null, "3ºPremio " + num1 + " , " + num2 + " ," + num3 + " ");

    } else if (num1 + num2 + num3 == 7) {
        JOptionPane.showMessageDialog(null, "4ºPremio " + num1 + " , " + num2 + " ," + num3 + " ");
    } else {
        JOptionPane.showMessageDialog(null, "Sem Premio " + num1 + " , " + num2 + " ," + num3 + " ");
    }
    Reiniciar=JOptionPane.showConfirmDialog(null,"Quer Jogar Novamente ? b");
}while(Reiniciar== JOptionPane.YES_OPTION);
        System.exit(0);

    }

}
