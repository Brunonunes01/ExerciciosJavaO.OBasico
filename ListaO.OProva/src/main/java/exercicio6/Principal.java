/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio6;

import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        ClasseIdade voto = new ClasseIdade(idade);
        System.out.println(voto.calcularClasseIdade());
    }
}
