/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio12;

/**
 *
 * @author Bruno
 */
public class Aumento {
    private double salario, aumento, resultado;
    private int id;
    private String resposta;
    
    public Aumento(double salario, int id){
    this.salario = salario; 
    this.id = id;
    }
    
    public String calcularAumento(){
    if(this.id == 101){
    this.aumento = this.salario * 0.1;
    this.resultado = this.salario + this.aumento;
    this.resposta = "O salario antigo e de : "+this.salario+ " salario atual : "+this.resultado+ " a diferença é de : "+this.aumento;
    }
    else if(this.id == 102){
    this.aumento = this.salario * 0.2;
    this.resultado = this.salario + this.aumento;
    this.resposta = "O salario antigo e de : "+this.salario+ " salario atual : "+this.resultado+ " a diferença é de : "+this.aumento;
    }
    else if(this.id == 103){
    this.aumento = this.salario * 0.3;
    this.resultado = this.salario + this.aumento;
    this.resposta = "O salario antigo e de : "+this.salario+ " salario atual : "+this.resultado+ " a diferença é de : "+this.aumento;
    }
    else{
    this.aumento = this.salario * 0.4;
    this.resultado = this.salario + this.aumento;
    this.resposta = "O salario antigo e de : "+this.salario+ " salario atual : "+this.resultado+ " a diferença é de : "+this.aumento;
    }
    
    return this.resposta;
    }
    
}
