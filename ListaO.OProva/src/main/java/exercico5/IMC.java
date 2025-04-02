/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercico5;

/**
 *
 * @author Bruno
 */
public class IMC {
    private double peso, altura,resultado;
    private String resposta;
    
    public IMC(double peso, double altura){
    this.peso = peso;
    this.altura = altura;
    }
    public String calcularIMC(){
    this.resultado = this.peso/(this.altura * this.altura);
    if(this.resultado < 20)
        this.resposta = "IMC abaixo de 20 Abaixo do peso";
    else if(this.resultado < 25)
        this.resposta = "IMC de 20 até 25 Peso Normal";
    else if (this.resultado < 30)
        this.resposta = "IMC de 25 até 30 Sobre Peso";
    else if(this.resultado < 40)
        this.resposta ="IMC de 30 até 40 Obeso";
    else
        this.resposta = "IMC de 40 e acima Obeso Mórbido";
    return this.resposta;
        
    }
}
