/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

/**
 *
 * @author Aluno
 */
public class ContaDAO {
    public String mostrarConta(ContaDTO contaDTO){
    return "Data Criacao: "+ contaDTO.getData_criacao() +
            "Saldo: "+ contaDTO.getSaldo()+
            "Numero: "+ contaDTO.getNumero();
    }
    
}
