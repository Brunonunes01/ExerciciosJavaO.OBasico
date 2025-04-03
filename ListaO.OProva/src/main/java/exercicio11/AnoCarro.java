/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio11;

/**
 *
 * @author Bruno
 */
public class AnoCarro {
    private double valor, imposto;
    private int ano;
    
    
    public AnoCarro(double valor , int ano){
    this.valor = valor;
    this.ano = ano;
    }
    
    public double calcularAnoCarro(){
    if(this.ano < 1990)
        this.imposto = this.valor * 0.01;
    else 
        this.imposto = this.valor * 0.015;
    return this.imposto;
    }
}
