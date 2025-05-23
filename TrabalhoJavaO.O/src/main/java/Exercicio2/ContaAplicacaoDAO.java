/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaAplicacaoDAO {
    public String mostarContaAplicacao(ContaAplicacaoDTO contaAplicacaoDTO){
    return "\nValor minimo: " +contaAplicacaoDTO.getValor_minimo() +
            "\nTempo de aplicacao: " + contaAplicacaoDTO.getTempo_aplicado();
    }
}
