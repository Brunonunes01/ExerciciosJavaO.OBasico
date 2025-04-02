/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author Bruno
 */
public class Avaliar {
    private double a, b;
    private String resposta;
    
    public Avaliar(double a, double b){
    this.a = a;
    this.b = b;
    }
    public String calcularAvaliar(){
    if(this. a > this.b)
        this.resposta = "O numero "+this.a+ " e maior que "+this.b;
    else 
        this.resposta = "O numero "+this.b+ " e maior que "+this.a;
    return this.resposta;

    }
    
}
