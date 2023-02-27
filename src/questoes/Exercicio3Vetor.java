package questoes;

import java.util.Arrays;

public class Exercicio3Vetor {
    public static void main(String[] args) {
        double[] faturamentoDiario = {100.0, 150.0, 80.0, 120.0, 90.0, 130.0, 70.0};


        double menorValor = Arrays.stream(faturamentoDiario).min().orElse(0.0);
        System.out.println("Menor valor de faturamento diário: R$" + menorValor);

        double maiorValor = Arrays.stream(faturamentoDiario).max().orElse(0.0);
        System.out.println("Maior valor de faturamento diário: R$" + maiorValor);

        double mediaMensal = Arrays.stream(faturamentoDiario).average().orElse(0.0);
        long diasAcimaDaMedia = Arrays.stream(faturamentoDiario)
                .filter(valor -> valor > mediaMensal)
                .count();
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
