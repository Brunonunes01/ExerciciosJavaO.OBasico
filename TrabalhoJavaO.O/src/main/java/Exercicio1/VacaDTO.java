/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class VacaDTO extends AnimalDTO {
    private String mes_prenhez, mes_lactacao;
    private double qtd_leite;

    public String getMes_prenhez() {
        return mes_prenhez;
    }

    public void setMes_prenhez(String mes_prenhez) {
        this.mes_prenhez = mes_prenhez;
    }

    public String getMes_lactacao() {
        return mes_lactacao;
    }

    public void setMes_lactacao(String mes_lactacao) {
        this.mes_lactacao = mes_lactacao;
    }

    public double getQtd_leite() {
        return qtd_leite;
    }

    public void setQtd_leite(double qtd_leite) {
        this.qtd_leite = qtd_leite;
    }
}
