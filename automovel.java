/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de
um carro, calcular e escrever o custo final ao consumidor.*/

import java.util.Scanner;

public class automovel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorfabrica, percvendedor, percimposto, valorfinal;
        System.out.printf("Digite o valor de fábrica do carro : \n");
        valorfabrica = ler.nextDouble();
        percvendedor = (28 * valorfabrica) / 100;
        percimposto = (45 * valorfabrica) / 100;
        valorfinal = valorfabrica + percvendedor + percimposto;
        System.out.printf("o valor final do carro é = R$ %.2f\n", valorfinal);
        System.out.printf("o valor dos impostos é = R$ %.2f\n", percimposto);
        System.out.printf("o valor do distribuidor é = R$ %.2f\n", percvendedor);
    }
}
