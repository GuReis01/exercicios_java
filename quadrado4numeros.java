import javax.swing.JOptionPane;

public class quadrado4numeros {

    public static void main(String[] args) {
        double n1, n2, n3, n4, soma;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um terceiro número: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um quarto número: "));

        soma = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);
        JOptionPane.showMessageDialog(null, "A soma do quadrado dos 4 números é: " + soma);
    }

}
