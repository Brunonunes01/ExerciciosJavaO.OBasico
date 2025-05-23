package Exercicio3;

public class Caminhao_cacambaCTR {

    Caminhao_cacambaDAO caminhao_cacambaDAO = new Caminhao_cacambaDAO();

    public String mostrarDadosCaminhao_cacamba(Caminhao_cacambaDTO caminhao_cacambaDTO) {
        return caminhao_cacambaDAO.mostrarDadosCaminhao_cacamba(caminhao_cacambaDTO);
    }
}
