package ex4;

import javax.swing.*;

public class Ex4 {
    
    //LER NUMERO DO MES E ESCREVER O NUMERO DE DIAS DESSE MES
    
    
    public static void main(String[] args) {
        
        int num ; 
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do mês"));
        
        switch (num) {
            
            case 1 : JOptionPane.showMessageDialog(null, "Janeiro tem 31");
            break;
            
            case 2 : JOptionPane.showMessageDialog(null, "Fevereiro tem 29");
            break;
            
            case 3 : JOptionPane.showMessageDialog(null, "Março tem 31");
            break;
            
            case 4 : JOptionPane.showMessageDialog(null, "Abril tem 30");
            break;
            
            case 5 : JOptionPane.showMessageDialog(null, "Maio tem 31");
            break;
            
            case 6 : JOptionPane.showMessageDialog(null, "Junho tem 30");
            break;
            
            case 7 : JOptionPane.showMessageDialog(null, "Julho tem 31");
            break;
            
            case 8 : JOptionPane.showMessageDialog(null, "Agosto tem 30");
            break;
            
            case 9 : JOptionPane.showMessageDialog(null, "Setembro tem 31");
            break;
            
            case 10 : JOptionPane.showMessageDialog(null, "Outubro tem 30");
            break;
            
            case 11 : JOptionPane.showMessageDialog(null, "Novembro tem 31");
            break;
            
            case 12 : JOptionPane.showMessageDialog(null, "Dezembro tem 30");
            break;
            
            default : JOptionPane.showMessageDialog(null, "Mês Inválido");
            break;
           
        }
    }
    
}
