/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaAplicacaoDTO  extends ContaDTO{
    private double valor_minimo;
    private int tempo_aplicado;

    public double getValor_minimo() {
        return valor_minimo;
    }

    public void setValor_minimo(double valor_minimo) {
        this.valor_minimo = valor_minimo;
    }

    public int getTempo_aplicado() {
        return tempo_aplicado;
    }

    public void setTempo_aplicado(int tempo_aplicado) {
        this.tempo_aplicado = tempo_aplicado;
    }
    
}
