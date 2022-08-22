import javax.swing.JOptionPane;

public class arearetangulo {
    public static void main(String[] args) {
        double base, altura, resultado;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da base do triângulo em cm: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura do triângulo em cm: "));
        resultado = base * altura;
        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + resultado + " cm");
    }
}
