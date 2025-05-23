/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class TouroDAO {
    public String mostrarTouro(TouroDTO touroDTO){
      return "Peso de desmama: " + touroDTO.getPeso_desmama() +
           "\nPeso 20 meses: " + touroDTO.getPeso_20_meses() + 
           "\npeso 24 meses: " + touroDTO.getPeso_24_meses() +
           "\nMes de desmama: " + touroDTO.getMes_desmama();
    }
}
