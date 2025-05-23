/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class VacaCTR {
    VacaDAO vacaDAO = new VacaDAO();
    public String mostraDadosVaca(VacaDTO vacaDTO){
    return vacaDAO.mostrarVaca(vacaDTO);
    }
}
