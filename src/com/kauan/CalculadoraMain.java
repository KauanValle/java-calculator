package com.kauan;

import com.calculadora.Calculadora;
import com.operacoes.Operacoes;

/** Ao executar a calculadora, o programa deverá perguntar qual operação
    aritmética o usuário quer realizar, entre elas: adição (+), subtração (-),
    divisão (/) ou multiplicação (*);
    2. Após a seleção da opção o programa deverá solicitar os números da
    operação. No caso de divisão, caso o usuário digite zero(0) no divisor
    deverá ser informado que não é permitido divisão por zero;
    3. Ao concluir o cálculo, o programa deverá mostrar o resultado e logo após
    perguntar se o usuário quer continuar calculando. Em caso afirmativo o
    programa deverá apresentar novamente as opções do item 1 ou encerrar.
**/

public class CalculadoraMain extends Operacoes {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.opcoes();

    }
}
