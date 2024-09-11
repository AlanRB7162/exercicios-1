package exercicios06092024noriega;
import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (num == 1 || num == 2){
            JOptionPane.showMessageDialog(null, num + " é primo.");
        } else {
            for (int i = 2; i <= num/2; i++){
                if (num % i == 0){
                    JOptionPane.showMessageDialog(null, num + " não é primo.");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, num + " é primo.");
                    break;
                }
            }
        }
    }
}