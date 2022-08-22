import javax.swing.JOptionPane;

public class dolartoreal {
    public static void main(String[] args) {
        double cotacaodolar, valordolar, valor_real;
        cotacaodolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar: "));
        valordolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólar: "));
        valor_real = cotacaodolar * valordolar;
        JOptionPane.showMessageDialog(null, "O valor em reais é: " + valor_real);
    }
}
