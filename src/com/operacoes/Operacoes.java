package com.operacoes;

import com.calculadora.Calculadora;

import java.util.Scanner;

public class Operacoes extends OperacoesAbstract implements OperacoesInferface {
    public Scanner s = new Scanner(System.in);
    public Calculadora calc = new Calculadora();

    @Override
    public void soma() {
        this.notas();
        this.setValSoma(this.getNota1() + this.getNota2());

        System.out.println("Valor da soma: " + this.getValSoma());
        this.repetir();
    }

    @Override
    public void subtracao() {
        this.notas();
        this.setValSubtracao(this.getNota1() - this.getNota2());

        System.out.println("Valor da subtracao: " + this.getValSubtracao());
        this.repetir();
    }

    @Override
    public void multiplicacao() {
        this.notas();

        this.setValMultiplicacao(this.getNota1() * this.getNota2());

        System.out.println("Valor da multiplicacao: " + this.getValMultiplicacao());
        this.repetir();
    }

    @Override
    public void divisao() {
        this.notas();
        if(this.getNota1() == 0 || this.getNota2() == 0){
            System.out.println("\n ------------------------------ \n Digite um valor diferente de 0! \n ------------------------------ \n");
            divisao();
        }else{
            this.setValDivisao(this.getNota1() / this.getNota2());
            System.out.println("Valor da divisao: " + this.getValDivisao());
            this.repetir();
        }
    }

    @Override
    public void notas(){
        System.out.println("Digite a nota 1");
        this.setNota1(s.nextDouble());
        System.out.println("Digite a nota 2");
        this.setNota2(s.nextDouble());
    }

    @Override
    public void repetir(){
        System.out.println("Deseja sair da calculadora? 1 para sim e 2 para não!");
        int result = s.nextInt();

        switch (result){
            case 1:
                System.out.println("Obrigado por usar a calculadora!");
                break;
            case 2:
                calc.opcoes();
                break;
            default:
                System.out.println("Digite uma opção valida!");
        }
    }
}
