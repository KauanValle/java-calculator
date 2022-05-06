package com.operacoes;

public class OperacoesBasicas extends OperacoesAbstract implements OperacoesInferface {
    public void iniciar(int opcao) {
        double nota1 = lerValores("Digite o valor 1");
        double nota2 = lerValores("Digite o valor 2");
        int opcaoCalc = 1;

        switch (opcao) {
            case 1:
                soma(nota1, nota2, opcaoCalc);
                break;
            case 2:
                subtracao(nota1, nota2, opcaoCalc);
                break;
            case 3:
                multiplicacao(nota1, nota2, opcaoCalc);
                break;
            case 4:
                divisao(nota1, nota2, opcaoCalc);
                break;
            default:
                System.out.println("Digite uma opção valida!");
        }
    }
}