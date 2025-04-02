/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

/**
 *
 * @author Bruno
 */
public class ClasseIdade {
    private int idade;
    private String resposta;
    
    public ClasseIdade(int idade){
    this.idade = idade;
    }
    public String calcularClasseIdade(){
    if(this.idade < 16)
        this.resposta = "não votante";
    else if(this.idade >= 16 && this.idade < 18 || this.idade > 65)
        this.resposta = "eleitor facultativo";
    else
        this.resposta = "eleitor obrigatório";
    return this.resposta;
    }
    
}
