/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class VacaDAO {
    public String mostrarVaca(VacaDTO vacaDTO){
        return "Mes de Encherto: " + vacaDTO.getMes_prenhez()+
                "\nMes de Lactacao: " + vacaDTO.getMes_lactacao() +
                "\nQuantidade de leite: " + vacaDTO.getQtd_leite();
        
    
}
}
