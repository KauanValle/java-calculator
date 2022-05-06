package com.calculadora;

import com.operacoes.OperacoesBasicas;
import com.operacoes.OperacoesCientificas;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class CalculadoraAbstract implements CalculadoraInterface{
    public Scanner s = new Scanner(System.in);

    @Override
    public void opcoes(int opcaoCalc) {
        OperacoesBasicas opBasicas = new OperacoesBasicas();
        OperacoesCientificas opCientifica = new OperacoesCientificas();

        int opcao = 0;
        boolean calcCientifica = false;

        if(opcaoCalc == 1){
            System.out.println(
                    "Digite a opção da sua conta: \n\n"
                            + "1. Soma \n"
                            + "2. Subtracao \n"
                            + "3. Multiplicacao \n"
                            + "4. Divisao \n"
            );
        }

        if(opcaoCalc == 2){
            System.out.println(
                    "Digite a opção da sua conta: \n\n"
                            + "1. Elevação (numero e quanto quer elevar) \n"
            );

            calcCientifica = true;
        }

        try{
            opcao = s.nextInt();

            if(calcCientifica){
                opCientifica.iniciar(opcao);
            }else{
                opBasicas.iniciar(opcao);
            }
        }catch(InputMismatchException e){
            System.out.println("\n\n ------------------------------ \n Digite uma das opções númericas! \n ------------------------------ \n");
            opcoes(opcaoCalc);
        }
    }
}
