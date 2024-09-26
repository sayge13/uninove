package org.example;

public class Exercicio04 {

    double sp = 67836.43;
    double rj = 36678.66;
    double mg =29229.88;
    double es = 27165.48;
    double outros = 19849.53;
    double totalMensal = sp + rj + mg + es + outros;

    double[] porcentagemFaturamento = {sp,rj,mg,es,outros};
    int[] porcetagemInt = new int[porcentagemFaturamento.length];

    public int[] calFaturamento(){
        for (int i =0; i < porcentagemFaturamento.length; i++) {

            porcentagemFaturamento[i] = (porcentagemFaturamento[i] / totalMensal) * 100;
            porcetagemInt[i] = (int) porcentagemFaturamento[i];
        }
        return porcetagemInt;
    }
}
