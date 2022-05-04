package com.operacoes;

abstract class OperacoesAbstract {
    public double valSoma;
    public double valSubtracao;
    public double valMultiplicacao;
    public double valDivisao;
    public double nota1;
    public double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getValSoma() {
        return valSoma;
    }

    public void setValSoma(double valSoma) {
        this.valSoma = valSoma;
    }

    public double getValSubtracao() {
        return valSubtracao;
    }

    public void setValSubtracao(double valSubtracao) {
        this.valSubtracao = valSubtracao;
    }

    public double getValMultiplicacao() {
        return valMultiplicacao;
    }

    public void setValMultiplicacao(double valMultiplicacao) {
        this.valMultiplicacao = valMultiplicacao;
    }

    public double getValDivisao() {
        return valDivisao;
    }

    public void setValDivisao(double valDivisao) {
        this.valDivisao = valDivisao;
    }
}
