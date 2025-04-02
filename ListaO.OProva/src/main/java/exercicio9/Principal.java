/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite os valores de a , b e c: ");
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        
        Maior10 maior = new Maior10(a,b,c);
        
        System.out.println("O total de  numeros maior que 10 é "+maior.calcularMaior10());
    }
}
