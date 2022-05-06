package com.operacoes;

import com.calculadora.Calculadora;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class OperacoesAbstract implements OperacoesInferface {
    public Scanner s = new Scanner(System.in);
    public Calculadora calc = new Calculadora();

    @Override
    public void soma(double val1, double val2, int opcaoCalc) {
        double resultado = val1 + val2;
        System.out.println("Valor da soma: " + resultado);
        this.repetir(opcaoCalc);
    }

    @Override
    public void subtracao(double val1, double val2, int opcaoCalc) {
        double resultado = val1 - val2;
        System.out.println("Valor da subtracao: " + resultado);
        this.repetir(opcaoCalc);
    }

    @Override
    public void multiplicacao(double val1, double val2, int opcaoCalc) {
        double resultado = val1 * val2;

        System.out.println("Valor da multiplicacao: " + resultado);
        this.repetir(opcaoCalc);
    }

    @Override
    public void divisao(double val1, double val2, int opcaoCalc) {
        if (val1 == 0 || val2 == 0) {
            System.out.println("\n ------------------------------ \n Digite um valor diferente de 0! \n ------------------------------ \n");
        } else {
            double resultado = val1 / val2;
            System.out.println("Valor da divisao: " + resultado);
            this.repetir(opcaoCalc);
        }
    }

    public void elevacao(double val1, double val2, int opcaoCalc){
        double valor = val1;
        
        for(int i = 1; i < val2; i++){
            valor = valor * val1;
        }

        System.out.println("Seu número elevado a " + val2 + " ficou: " + valor);
        this.repetir(opcaoCalc);
    }

    public double lerValores(String mensagem) {
        double leitor = 0;
        boolean isNumeroValido = true;

        while (isNumeroValido) {
            try {
                System.out.println(mensagem);
                leitor = Double.parseDouble(s.nextLine());
                isNumeroValido = false;
            } catch (Exception e) {
                System.out.println("Você digitou uma letra, digite um número!");
            }
        }
        return leitor;
    }

    @Override
    public void repetir(int opcaoCalc) {
        System.out.println("Deseja sair da calculadora? 1 para sim e 2 para não!");
        int result = s.nextInt();

        switch (result) {
            case 1:
                System.out.println("Obrigado por usar a calculadora!");
                break;
            case 2:
                calc.opcoes(opcaoCalc);
                break;
            default:
                System.out.println("Digite uma opção valida!");
        }
    }
}
