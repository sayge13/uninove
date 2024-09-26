package org.example;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Caminho para o arquivo JSON
        String caminhoArquivo = "C:/programing/projeto_seletivo/Exercicios/src/main/java/org/example/faturamento.json";

        // Instancia o serviço de faturamento
        Exercicio03 service = new Exercicio03();

        // Carrega os dados do JSON
        JSONArray faturamentoMensal = service.carregarFaturamentoJSON(caminhoArquivo);

        if (faturamentoMensal == null) {
            System.out.println("Erro ao carregar o arquivo JSON.");
            return;
        }

        // Lista para armazenar os dias com faturamento (ignorar dias com faturamento 0)
        List<Double> diasComFaturamento = new ArrayList<>();

        // Preenche a lista com os valores de faturamento válidos (não zero)
        for (int i = 0; i < faturamentoMensal.length(); i++) {
            JSONObject dia = faturamentoMensal.getJSONObject(i);
            double valor = dia.getDouble("valor");
            if (valor > 0) {
                diasComFaturamento.add(valor);
            }
        }

        // Calcula o menor e o maior faturamento
        double menorFaturamento = service.calcularMenorFaturamento(diasComFaturamento);
        double maiorFaturamento = service.calcularMaiorFaturamento(diasComFaturamento);
        double mediaFaturamento = service.calcularMediaFaturamento(diasComFaturamento);

        // Conta o número de dias em que o faturamento foi superior à média
        int diasAcimaDaMedia = service.contarDiasAcimaDaMedia(diasComFaturamento, mediaFaturamento);

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia);
/*
        // Exercício 01 - Exemplo de Soma
        Exercicio01 ex1 = new Exercicio01();
        System.out.println("Resultado do Calculo (Exercicio 01): " + ex1.somar());


        // Exercicio 02 - Fibonacci
        Exercicio02 ex2 = new Exercicio02();
        GerenciadorDeEntrada gerenciador = new GerenciadorDeEntrada();

        System.out.println("Digite um número para verificar na sequência de Fibonacci:");

        int num = gerenciador.entradaInt();  // Pegando o número inserido pelo usuário
        boolean pertence = ex2.fibonacci(num);  // Verificando se pertence à sequência

        System.out.println("O número pertence à sequência Fibonacci? " + pertence);

        // Exercício 04 - Processar faturamentos
        Exercicio04 ex4 = new Exercicio04();
        System.out.println("Faturamento processado (Exercicio 04): " + Arrays.toString(ex4.calFaturamento()));

        // Exercício 05 - Inversor de nome
        Exercicio05 ex5 = new Exercicio05();
        System.out.println("Digite o nome a ser invertido:");
        System.out.println("Nome invertido: " + ex5.nomeInverso(gerenciador));

        // Fechar o scanner
        gerenciador.fecharScanner();
        */

    }
}
