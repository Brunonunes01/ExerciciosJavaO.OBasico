/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author Bruno
 */
public class Financiamento {
    private double salario, valor;
    private String resposta;
    
    
    public Financiamento(double salario, double valor){
    this.salario = salario;
    this.valor = valor;
    }
    
    public String calcularFianciamento(){
    if(this.valor <= this.salario * 5)
        this.resposta = "Financiamento concedido";
    else 
        this.resposta = "Financiamento negado";
        
    return this.resposta;
        
    }
}
