/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio3;

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
      
      System.out.println("Digite dois Numeros: ");
      double a = ler.nextDouble();
      double b = ler.nextDouble();
      
      Avaliar avaliar = new Avaliar(a, b);
      
      System.out.println(avaliar.calcularAvaliar());
    }
}
