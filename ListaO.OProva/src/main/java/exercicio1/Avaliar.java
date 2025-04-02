/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author Bruno
 */
public class Avaliar {
    private double num;
    private String resposta;
    
    public Avaliar(double num){
        this.num = num;
    }
    
    public String calcularAvaliar(){
        if(this.num > 20)
            this.resposta = "Maior que 20";
        else 
            this.resposta = "Menor que 20";
        return this.resposta;
    }
    
}
