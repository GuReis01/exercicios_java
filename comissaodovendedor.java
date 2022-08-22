import javax.swing.JOptionPane;

public class comissaodovendedor {
    public static void main(String[] args) {
        double valor_peca, n_vendidas, result_vendas, comissao;
        valor_peca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: "));
        n_vendidas = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas pecas foram vendidas: "));
        result_vendas = valor_peca * n_vendidas;
        comissao = result_vendas * 0.05;
        JOptionPane.showMessageDialog(null, "A comissão do vendedor é de: " + comissao + " reais");
    }
}