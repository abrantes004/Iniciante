package atividade01;
import javax.swing.JOptionPane;
public class Questao10 {
    public static void main(String[] args) {
    String valor1 = JOptionPane.showInputDialog(null,"Digite o primeiro valor.");
    String valor2 = JOptionPane.showInputDialog(null,"Digite o segundo valor.");
    int a = Integer.parseInt(valor1);
    int b = Integer.parseInt(valor2);
        System.out.println("Soma = "+(a+b));
        System.out.println("Subtração = "+(a-b));
        System.out.println("Divisão = "+(a/b));
        System.out.println("Multiplicação = "+(a*b));

    }
    
}
