/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio4;

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
        
        System.out.println("Digite seu salrio Bruto: ");
        double salario = ler.nextDouble();
        System.out.println("Digite o valor da prestacao: ");
        double valor = ler.nextDouble();
        
        Prestacao prestacao = new Prestacao(salario, valor);
        
        System.out.println(prestacao.calcularPrestacao());
        
    }
}
