package exercicios06092024noriega;
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int fat = 1;
        
        for(int i = 1; i <= numero; i++){
            fat = fat * i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fat);
    }
}
