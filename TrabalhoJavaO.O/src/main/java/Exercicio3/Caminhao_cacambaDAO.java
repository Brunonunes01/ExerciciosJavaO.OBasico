package Exercicio3;

public class Caminhao_cacambaDAO extends Veiculo_transporteDAO {

    public String mostrarDadosCaminhao_cacamba(Caminhao_cacambaDTO caminhao_cacambaDTO) {
        return mostrarDadosVeiculo_transporte(caminhao_cacambaDTO)
                + "capacidade tonelada: " + caminhao_cacambaDTO.getCapacidade_tonelada()
                + "qtd semireboque: " + caminhao_cacambaDTO.getQtd_semireboque();
    }
}
