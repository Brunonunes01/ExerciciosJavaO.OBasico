/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio7;

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
        
        System.out.println("Digite o seu salario: ");
        double salario = ler.nextDouble();
        
        Avaliar avaliar = new Avaliar(salario);
        
        System.out.println(avaliar.calcularSalario());
    }
}
