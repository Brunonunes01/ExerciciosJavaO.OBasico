package Exercicio3;

public class Caminhao_tanqueDAO extends Veiculo_transporteDAO {

    public String mostrarDadosCaminhao_tanque(Caminhao_tanqueDTO caminhao_tanqueDTO) {
        return mostrarDadosVeiculo_transporte(caminhao_tanqueDTO)
                + "\nCapacidade litro: " + caminhao_tanqueDTO.getCapacidade_litro()
                + "\nqtd divisorias: " + caminhao_tanqueDTO.getQtd_divisorias()
                + "\nlitros divisorias: " + caminhao_tanqueDTO.getLitros_divisorias()
                + "\nqtd semireboque: " + caminhao_tanqueDTO.getQtd_semireboque();
    }
}
