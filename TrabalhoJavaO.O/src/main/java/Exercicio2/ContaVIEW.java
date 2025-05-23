/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ContaVIEW {
 
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        ContaAplicacaoDTO contaAplicacaoDTO = new ContaAplicacaoDTO();

        ContaAplicacaoCTR contaAplicacaoCTR = new ContaAplicacaoCTR();

        ContaPoupancaDTO contaPoupancaDTO = new ContaPoupancaDTO();

        ContaPoupancaCTR contaPoupancaCTR = new ContaPoupancaCTR();

        int op;

        System.out.println("Informe 1 para Conta Aplicacao ou 2 para Conta Poupanca: ");

        op = ler.nextInt();

        ler.nextLine();

        if(op == 1){

            System.out.println("Informe o valor minimo: ");

            contaAplicacaoDTO.setValor_minimo(ler.nextDouble());

            System.out.println("Informe o Tempo de Aplicacao: ");

            contaAplicacaoDTO.setTempo_aplicado(ler.nextInt());

            System.out.println(contaAplicacaoCTR.mostardadosContaAplicacao(contaAplicacaoDTO));

        }

        else{

         System.out.println("Informe o Rendimento do Dia: ");

         contaPoupancaDTO.setDia_rendimento(ler.nextInt());

         System.out.println(contaPoupancaCTR.mostardadosContaPoupanca(contaPoupancaDTO));

        }

    }

}
 