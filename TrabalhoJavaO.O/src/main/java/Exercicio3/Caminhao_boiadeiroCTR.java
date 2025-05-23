package Exercicio3;

public class Caminhao_boiadeiroCTR {

    Caminhao_boiadeiroDAO caminhao_boiadeiroDAO = new Caminhao_boiadeiroDAO();

    public String mostrarDadosCaminhao_boiadeiro(Caminhao_boiadeiroDTO caminhao_boiadeiroDTO) {
        return caminhao_boiadeiroDAO.mostrarDadosCaminhao_boiadeiro(caminhao_boiadeiroDTO);
    }

}
