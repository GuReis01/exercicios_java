import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        double idadeAnos, idadeMeses, idadeDias, soma;
        idadeAnos = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?: "));
        idadeMeses = Double
                .parseDouble(JOptionPane.showInputDialog("Você tem " + idadeAnos + " anos e quantos meses? "));
        idadeDias = Double.parseDouble(JOptionPane
                .showInputDialog("Você tem " + idadeAnos + " anos, " + idadeMeses + " meses e quantos dias? "));
        soma = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
        JOptionPane.showMessageDialog(null, "Sua idade exata em dias é: " + soma);
    }
}
