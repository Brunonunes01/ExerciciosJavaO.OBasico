package Exercicio3;

public class Caminhao_tanqueDTO extends Veiculo_transporteDTO {

    private int capacidade_litro, qtd_divisorias, litros_divisorias, qtd_semireboque;

    public int getCapacidade_litro() {
        return capacidade_litro;
    }

    public void setCapacidade_litro(int capacidade_litro) {
        this.capacidade_litro = capacidade_litro;
    }

    public int getQtd_divisorias() {
        return qtd_divisorias;
    }

    public void setQtd_divisorias(int qtd_divisorias) {
        this.qtd_divisorias = qtd_divisorias;
    }

    public int getLitros_divisorias() {
        return litros_divisorias;
    }

    public void setLitros_divisorias(int litros_divisorias) {
        this.litros_divisorias = litros_divisorias;
    }

    public int getQtd_semireboque() {
        return qtd_semireboque;
    }

    public void setQtd_semireboque(int qtd_semireboque) {
        this.qtd_semireboque = qtd_semireboque;
    }

}
