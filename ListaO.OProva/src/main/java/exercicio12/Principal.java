/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio12;

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
        Scanner  ler = new Scanner(System.in);
        
        System.out.println("Digite seu salario: ");
        double salario = ler.nextDouble();
        System.out.println("Digite seu id : ");
        int id = ler.nextInt();
        
        Aumento aumento = new Aumento(salario, id);
        
        System.out.println(aumento.calcularAumento());
        
    }
}
