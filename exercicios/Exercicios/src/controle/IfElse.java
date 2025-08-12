package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite o número");
        
        int number = Integer.parseInt(valor);

        if (number % 2 == 0) {
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
    }
}
