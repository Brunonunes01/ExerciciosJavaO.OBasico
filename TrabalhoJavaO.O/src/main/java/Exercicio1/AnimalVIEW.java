/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AnimalVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner ler = new Scanner(System.in); 
    VacaDTO vacaDTO = new VacaDTO();
    VacaCTR vacaCRT = new VacaCTR();
    TouroDTO touroDTO = new TouroDTO();
    TouroCTR touroCRT = new TouroCTR();
    int op;
    System.out.print("Informe a OPCAO  1 - PARA VACA  E 2 PARA TOURO ");
    op = ler.nextInt();
    ler.nextLine();
    if(op == 1){
         System.out.print("INFORME O MES DE PRENHEZ:   ");
         vacaDTO.setMes_prenhez(ler.nextLine());
         System.out.print("INFORME O MES DE LACTACAO:   ");   
         vacaDTO.setMes_lactacao(ler.nextLine());
         System.out.print("INFORME A QUANTIDADE DE LITROS DE LEITE:   ");
         vacaDTO.setQtd_leite(ler.nextDouble());
        System.out.println(vacaCRT.mostraDadosVaca(vacaDTO));

    }
    else{
     System.out.print("INFORME O PESO DE DESMAMA:   ");
         touroDTO.setPeso_desmama(ler.nextDouble());
         System.out.print("INFORME O PESO COM 20 MESES: ");
         touroDTO.setPeso_20_meses(ler.nextDouble());
         System.out.print("INFORME O PESO COM 24 MESES: ");
         touroDTO.setPeso_24_meses(ler.nextDouble());
          System.out.print("INFORME O MES DE DESMAMA: ");
         touroDTO.setMes_desmama(ler.nextInt());
         System.out.println(touroCRT.mostarDadosTouro(touroDTO));
    
    }
    }
}
