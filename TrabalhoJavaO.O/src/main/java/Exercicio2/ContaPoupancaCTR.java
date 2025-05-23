/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaPoupancaCTR {
    ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
    
    public String mostardadosContaPoupanca(ContaPoupancaDTO contaPoupancaDTO){
    return contaPoupancaDAO.mostrarContaPoupanca(contaPoupancaDTO);
    }
}
