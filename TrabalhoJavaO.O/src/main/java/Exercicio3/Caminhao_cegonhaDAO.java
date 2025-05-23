package Exercicio3;

public class Caminhao_cegonhaDAO extends Veiculo_transporteDAO {

    public String mostrarDadosCaminhao_cegonha(Caminhao_cegonhaDTO caminhao_cegonhaDTO) {

        return mostrarDadosVeiculo_transporte(caminhao_cegonhaDTO)
                + "\nQtd de andares: " + caminhao_cegonhaDTO.getQtd_andares()
                + "\nCapacidade carros: " + caminhao_cegonhaDTO.getCapacidade_carros()
                + "\nCapacidade tonelada: " + caminhao_cegonhaDTO.getCapacidade_tonelada();
    }
}
