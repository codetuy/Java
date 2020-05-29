import javax.swing.*;

public class exercicio3 {

//LER TRÊS NUMEROS INTEIROS E VERIFICAR QUAL O MAIOR OU SE SÃO IGUAIS

    public static void main (String[] args) {

        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduz o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduz o segundo número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduz o terceiro número"));


        if (num1 == num2)
            if (num2 == num3)
                if (num3 == num1)
                    JOptionPane.showMessageDialog(null, "Os número são iguais");

        if (num1 == num2 )
            if (num1 != num3)
                JOptionPane.showMessageDialog(null, +num1 + " e " +num2+ " sao iguais");

        if (num2 == num3 )
            if (num1 != num2)
                JOptionPane.showMessageDialog(null, +num2 + " e " +num3+ " sao iguais");

        


        if (num1 > num2)
            if (num1 > num3)
                JOptionPane.showMessageDialog(null, "O maior número é " +num1);

        if (num2 > num1)
            if (num2 > num3)
                JOptionPane.showMessageDialog(null, "O maior número é " +num2);

        if (num3 > num1)
            if (num3 > num2)
                JOptionPane.showMessageDialog(null, "O maior número é " +num3);




    }
}
