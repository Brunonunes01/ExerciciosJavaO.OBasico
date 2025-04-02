/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Bruno
 */
public class N {
    private double num;
    private String resposta;
    
    public N(double num){
    this.num = num;
    }
    public String calcularN(){
        if(this.num >= 0)
            this.resposta = "O numero "+this.num+" e positivo";
        else 
            this.resposta = "O numero "+this.num+" e negativo";
        return this.resposta;
    }
}
