package com.furb.poo.exercicios.lista09.questao01.model;

/**
 * 
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > (getSaldo() + limiteCredito)) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        setSaldo(getSaldo() - valor);
    }
    

    
    
    
    
}
