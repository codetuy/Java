import javax.swing.*;


public class ex1 {


//LER DOIS NÚMEROS E FAZER A MÉDIA

        public static void main (String[] args) {

            double num1 ,num2 ,media ;

            num1= Double.parseDouble(JOptionPane.showInputDialog(null,"Introduz o primeiro número"));
            num2= Double.parseDouble(JOptionPane.showInputDialog(null,"Introduz o segundo número"));


            media = (num1 + num2 ) / 2 ;

            JOptionPane.showMessageDialog (null,"A média dos números é " + media);
        }
}
