package com.operacoes;

import java.io.IOException;

public interface OperacoesInferface {
    public void iniciar(int opcao);
    public void soma(double val1, double val2, int opcaoCalc);
    public void subtracao(double val1, double val2, int opcaoCalc);
    public void multiplicacao(double val1, double val2, int opcaoCalc);
    public void divisao(double val1, double val2, int opcaoCalc);
    public void repetir(int opcaoCalc);
    public double lerValores(String mensagem);
    public void elevacao(double val1, double val2, int opcaoCalc);
}
