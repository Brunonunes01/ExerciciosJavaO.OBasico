/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author Bruno
 */
public class Prestacao {
    private double salario, valor;
    private String resposta;
    
    public Prestacao(double salario, double valor){
        this.salario = salario;
        this.valor = valor;
    }
    public String calcularPrestacao(){
        if(this.salario * 0.30 >= this.valor)
        this.resposta = "A Prestacao foi concedida no valor de "+this.valor;
        else
        this.resposta = "A Prestacao nao foi concedida no valor de "+this.valor;
        return this.resposta;
    }
}
