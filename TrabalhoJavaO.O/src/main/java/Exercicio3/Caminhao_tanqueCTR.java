package Exercicio3;

public class Caminhao_tanqueCTR {

    Caminhao_tanqueDAO caminhao_tanqueDAO = new Caminhao_tanqueDAO();

    public String mostrarDadosCaminhao_tanque(Caminhao_tanqueDTO caminhao_tanqueDTO) {
        return caminhao_tanqueDAO.mostrarDadosCaminhao_tanque(caminhao_tanqueDTO);
    }
}
