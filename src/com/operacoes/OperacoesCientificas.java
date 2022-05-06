package com.operacoes;

public class OperacoesCientificas extends OperacoesAbstract{

    public void iniciar(int opcao) {
        double nota1 = lerValores("Digite o valor 1");
        double nota2 = lerValores("Digite o valor 2");
        int opcaoCalc = 2;

        switch (opcao) {
            case 1:
                elevacao(nota1, nota2, opcaoCalc);
                break;
            default:
                System.out.println("Digite uma opção valida!");
        }
    }

}
