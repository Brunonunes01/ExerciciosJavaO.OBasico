package Exercicio3;

public class Veiculo_transporteDAO {

    public String mostrarDadosVeiculo_transporte(Veiculo_transporteDTO veiculo_transporteDTO) {
        return "\nChassi: " + veiculo_transporteDTO.getChassi()
                + "\nMarca: " + veiculo_transporteDTO.getMarca()
                + "\nModele: " + veiculo_transporteDTO.getModelo()
                + "\nPotencia: " + veiculo_transporteDTO.getPotencia();
    }
}
