/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

/**
 *
 * @author Bruno
 */
public class Maior10 {
    private double a,b,c, cont;
    
    public Maior10(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    public int calcularMaior10(){
    if(this.a > 10) cont++;
    if(this.b > 10) cont++;
    if(this.c > 10) cont++;
    return (int) this.cont;
    
    }
    
}
