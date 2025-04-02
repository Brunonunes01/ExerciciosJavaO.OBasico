/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercico5;

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
        
        System.out.println("Digite seu Peso em Kg: ");
        double peso = ler.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();
        IMC imc = new IMC(peso, altura);
        
        System.out.println(imc.calcularIMC());
        
        
    }
}
