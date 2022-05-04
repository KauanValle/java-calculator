package com.calculadora;

import com.operacoes.Operacoes;

import java.util.Scanner;

public class Calculadora implements CalculadoraInterface{
    @Override
    public void opcoes() {
        Operacoes op = new Operacoes();
        Scanner s = new Scanner(System.in);
        System.out.println(
                        "Digite a opção da sua conta: \n\n"
                        + "1. Soma \n"
                        + "2. Subtracao \n"
                        + "3. Multiplicacao \n"
                        + "4. Divisao \n"
        );

        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                op.soma();
                break;
            case 2:
                op.subtracao();
                break;
            case 3:
                op.multiplicacao();
                break;
            case 4:
                op.divisao();
                break;
            default:
                System.out.println("Digite uma opção valida!");
        }
    }
}
