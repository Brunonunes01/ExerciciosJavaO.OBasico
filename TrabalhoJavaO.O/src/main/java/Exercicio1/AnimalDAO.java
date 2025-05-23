/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class AnimalDAO {
    
    public String mostrarAnimal(AnimalDTO animalDTO){
    return "Codigo: " + animalDTO.getCodigo() +
            "\n Raça: "+ animalDTO.getRaca() +
            "\n Peso: "+ animalDTO.getPeso() +
            "\n Codigo do pai: "+ animalDTO.getCodigo_pai() +
            "\n Codigo da Mae: "+ animalDTO.getCodigo_mae();
    }
}
