import javax.swing.JOptionPane;

public class diasdevida {
    public static void main(String[] args) {
        double idade, resultado;
        idade = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?: "));
        resultado = idade * 365;
        JOptionPane.showMessageDialog(null, "Você tem " + resultado + " dias de vida!");
    }
}
