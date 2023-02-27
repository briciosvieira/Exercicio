package questoes;

public class Exercicio4Faturamento {
    public static void main(String[] args) {

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;


        double faturamentoTotal = SP + RJ + MG + ES + Outros;


        double percentualSP = SP / faturamentoTotal * 100;
        double percentualRJ = RJ / faturamentoTotal * 100;
        double percentualMG = MG / faturamentoTotal * 100;
        double percentualES = ES / faturamentoTotal * 100;
        double percentualOutros = Outros / faturamentoTotal * 100;


        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
    }
}
