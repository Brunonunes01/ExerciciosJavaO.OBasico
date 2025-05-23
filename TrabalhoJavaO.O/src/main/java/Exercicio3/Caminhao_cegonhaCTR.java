package Exercicio3;

public class Caminhao_cegonhaCTR {

    Caminhao_cegonhaDAO caminhao_cegonhaDAO = new Caminhao_cegonhaDAO();

    public String mostrarDadosCaminhao_cegonha(Caminhao_cegonhaDTO caminhao_cegonhaDTO) {
        return caminhao_cegonhaDAO.mostrarDadosCaminhao_cegonha(caminhao_cegonhaDTO);
    }
}
