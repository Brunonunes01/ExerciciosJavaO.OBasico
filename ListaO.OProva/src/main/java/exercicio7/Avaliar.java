/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author Bruno
 */
public class Avaliar {
    private double salario, credito, juros;
    private String resposta;
    
    public Avaliar(double salario){
    this.salario = salario;
    }
    
    public String calcularSalario(){
    if(this.salario >= 0 && this.salario <= 500)
        this.resposta = "Nenhum credito";
    else if(this.salario > 500 && this.salario <= 1000){
    this.credito = this.salario * 0.30;
    this.juros = this.credito * 0.02;
    this.resposta = "O valor do Salario "+this.salario+" Valor do credito "+this.credito+" com o valor de juros "+this.juros;
    }
    else if(this.salario > 1000 && this.salario <= 3000){
    this.credito = this.salario * 0.40;
    this.juros = this.credito * 0.02;
    this.resposta = "O valor do Salario "+this.salario+" Valor do credito "+this.credito+" com o valor de juros "+this.juros;
    }
    else {
    this.credito = this.salario * 0.50;
    this.juros = this.credito * 0.02;
    this.resposta = "O valor do Salario "+this.salario+" Valor do credito "+this.credito+" com o valor de juros "+this.juros;
    }   
    return this.resposta;
    
    }
    
}
