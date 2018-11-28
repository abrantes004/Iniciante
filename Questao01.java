package atividade02;
import javax.swing.JOptionPane;
public class Questao01 {
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog(null,"Qual a idade do aluno?");
        int id = Integer.parseInt(idade);
        if(id == 11) {
            System.out.println("Série adequada é a 6a série");
        } 
        else if(id == 13) {
            System.out.println("Série adequada é a 8a série");
        }
        else if(id == 14) {
            System.out.println("Série adequada é a 1a do Ensino Médio");
        }
        else if(id == 15) {
            System.out.println("Série adequada é a 2a do Ensino Médio");
        }
        else if(id == 17) {
            System.out.println("Série adequada é a 3a do Ensino Médio");
        }
    

    }
    
}
