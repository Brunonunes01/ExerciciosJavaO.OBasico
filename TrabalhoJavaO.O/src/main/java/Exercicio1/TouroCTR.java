/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class TouroCTR {
        TouroDAO touroDAO = new TouroDAO();
    public String mostarDadosTouro(TouroDTO touroDTO){
        return touroDAO.mostrarTouro(touroDTO);
    }
}
