package atividade02;
import javax.swing.JOptionPane;
public class Questao02 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog(null,"Digite o 1º valor?");
        String num2 = JOptionPane.showInputDialog(null,"Digite o 2º valor?");
        String num3 = JOptionPane.showInputDialog(null,"Digite o 3º valor?");
        int um = Integer.parseInt(num1);
        int dois = Integer.parseInt(num2);
        int tres = Integer.parseInt(num3);
        if(um>dois && dois>tres){
            System.out.println(um);
            System.out.println(dois);        
            System.out.println(tres);
            
        }
          if(um>tres && tres>dois){
            System.out.println(um);
            System.out.println(tres);        
            System.out.println(dois);     
            
        }
            if(dois>um && um>tres){
            System.out.println(dois);
            System.out.println(um);        
            System.out.println(tres);
                        
        }
        if(dois>tres && tres>um){
            System.out.println(dois);
            System.out.println(tres);        
            System.out.println(um);
            
        }
          if(tres>um && um>dois){
            System.out.println(tres);
            System.out.println(um);        
            System.out.println(dois);     
            
        }
            if(tres>dois && dois>um){
            System.out.println(tres);
            System.out.println(dois);        
            System.out.println(um);    
    }
    
}}
    
