/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio8;

/**
 *
 * @author Bruno
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu Salario: ");
        double salario = ler.nextDouble();
        System.out.println("Digite o valor do financiamento: ");
        double valor = ler.nextDouble();
        
        Financiamento financiamento = new Financiamento(salario,valor);
        
        System.out.println(financiamento.calcularFianciamento());
        System.out.println("Obrigado por nos consultar !");
    }
}
