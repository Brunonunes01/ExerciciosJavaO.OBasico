/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio11;

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
        
        System.out.println("Digite o valor do seu carro: ");
        double valor = ler.nextDouble();
        System.out.println("Digite o ano do seu carro");
        int ano = ler.nextInt();
        
        AnoCarro anocarro = new AnoCarro(valor, ano);
        
        System.out.println("O valor do imposto é de "+anocarro.calcularAnoCarro()+ " reais");
    }
}
