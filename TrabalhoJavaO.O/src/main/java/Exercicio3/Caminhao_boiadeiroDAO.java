package Exercicio3;

public class Caminhao_boiadeiroDAO extends Veiculo_transporteDAO {

    public String mostrarDadosCaminhao_boiadeiro(Caminhao_boiadeiroDTO caminhao_boiadeiroDTO) {
        return mostrarDadosVeiculo_transporte(caminhao_boiadeiroDTO)
                + "\nqtd andares: " + caminhao_boiadeiroDTO.getQtd_andares()
                + "\nqtd divisorias: " + caminhao_boiadeiroDTO.getQtd_divisorias()
                + "\ncapacidade toneladas: " + caminhao_boiadeiroDTO.getCapacidade_tonelada()
                + "\nqtd semireboque: " + caminhao_boiadeiroDTO.getQtd_semireboque();
    }
}
