import javax.swing.JOptionPane;

public class antecessor {
    public static void main(String[] args) {
        double valor, subtracao;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        subtracao = valor - 1;
        JOptionPane.showMessageDialog(null, "O antecessor desse número é: " + subtracao);
    }
}
