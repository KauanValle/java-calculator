package com.calculadora;

import java.util.Scanner;

public class Calculadora extends CalculadoraAbstract {
    public Scanner s = new Scanner(System.in);

    int opcaoCalc = 0;

    @Override
    public void iniciarCalc(){
        System.out.println(
                "Digite a opção de calculadora: \n\n"
                        + "1. Calculadora Normal \n"
                        + "2. Calculadora Cientifica \n"
        );

        try{
            opcaoCalc = s.nextInt();
        }catch(Exception e){
            System.out.println("\n\n ------------------------------ \n Digite uma das opções númericas! \n ------------------------------ \n");
        }

        opcoes(opcaoCalc);
    }
}
