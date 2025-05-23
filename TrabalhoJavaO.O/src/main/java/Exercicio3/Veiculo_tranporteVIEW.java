package Exercicio3;

import java.util.Scanner;

public class Veiculo_tranporteVIEW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        Caminhao_cegonhaDTO caminhao_cegonhaDTO = new Caminhao_cegonhaDTO();
        Caminhao_cegonhaCTR caminhao_cegonhaCTR = new Caminhao_cegonhaCTR();

        Caminhao_boiadeiroDTO caminhao_boiadeiroDTO = new Caminhao_boiadeiroDTO();
        Caminhao_boiadeiroCTR caminhao_boiadeiroCTR = new Caminhao_boiadeiroCTR();

        Caminhao_tanqueDTO caminhao_tanqueDTO = new Caminhao_tanqueDTO();
        Caminhao_tanqueCTR caminhao_tanqueCTR = new Caminhao_tanqueCTR();

        Caminhao_cacambaDTO caminhao_cacambaDTO = new Caminhao_cacambaDTO();
        Caminhao_cacambaCTR caminhao_cacambaCTR = new Caminhao_cacambaCTR();

        System.out.println("Digite sua opcao: 1-caminhao cegonha\n2-caminhao boiadeiro\n3- caminhao tanque\n4- caminhao caçamba\n");
        opc = scanner.nextInt();

        if (opc == 1) {
            System.out.println("Chassi: ");
            caminhao_cegonhaDTO.setChassi(scanner.nextInt());

            System.out.println("marca: ");
            caminhao_cegonhaDTO.setMarca(scanner.nextInt());

            System.out.println("modelo: ");
            caminhao_cegonhaDTO.setModelo(scanner.nextInt());

            System.out.println("potencia: ");
            caminhao_cegonhaDTO.setPotencia(scanner.nextInt());

            System.out.println("Quantidade Andares: : ");
            caminhao_cegonhaDTO.setQtd_andares(scanner.nextInt());

            System.out.println("Capacidade Carros: ");
            caminhao_cegonhaDTO.setCapacidade_carros(scanner.nextInt());

            System.out.println("Capacidade Tonelada: ");
            caminhao_cegonhaDTO.setCapacidade_tonelada(scanner.nextInt());
            
            System.out.println(caminhao_cegonhaCTR.mostrarDadosCaminhao_cegonha(caminhao_cegonhaDTO));

        } else if (opc == 2) {
            System.out.println("Chassi: ");
            caminhao_boiadeiroDTO.setChassi(scanner.nextInt());

            System.out.println("marca: ");
            caminhao_boiadeiroDTO.setMarca(scanner.nextInt());

            System.out.println("modelo: ");
            caminhao_boiadeiroDTO.setModelo(scanner.nextInt());

            System.out.println("potencia: ");
            caminhao_boiadeiroDTO.setPotencia(scanner.nextInt());

            System.out.println("Quantidade de andares: ");
            caminhao_boiadeiroDTO.setQtd_andares(scanner.nextInt());

            System.out.println("Quantidade divisorias: ");
            caminhao_boiadeiroDTO.setQtd_divisorias(scanner.nextInt());

            System.out.println("Capacidade de tonelada: ");
            caminhao_boiadeiroDTO.setCapacidade_tonelada(scanner.nextInt());

            System.out.println("Quantidade Semireboque: ");
            caminhao_boiadeiroDTO.setQtd_semireboque(scanner.nextInt());
            
             System.out.println(caminhao_boiadeiroCTR.mostrarDadosCaminhao_boiadeiro(caminhao_boiadeiroDTO));

        } else if (opc == 3) {
            System.out.println("Chassi: ");
            caminhao_tanqueDTO.setChassi(scanner.nextInt());

            System.out.println("marca: ");
            caminhao_tanqueDTO.setMarca(scanner.nextInt());

            System.out.println("modelo: ");
            caminhao_tanqueDTO.setModelo(scanner.nextInt());

            System.out.println("potencia: ");
            caminhao_tanqueDTO.setPotencia(scanner.nextInt());

            System.out.println("Capacidade de Litros: ");
            caminhao_tanqueDTO.setCapacidade_litro(scanner.nextInt());

            System.out.println("Quantidade divisorias: ");
            caminhao_tanqueDTO.setQtd_divisorias(scanner.nextInt());

            System.out.println("Litros divisorias: ");
            caminhao_tanqueDTO.setLitros_divisorias(scanner.nextInt());

            System.out.println("Quantidade semireboque: ");
            caminhao_tanqueDTO.setQtd_semireboque(scanner.nextInt());
            System.out.println(caminhao_tanqueCTR.mostrarDadosCaminhao_tanque(caminhao_tanqueDTO));

        } else if (opc == 4) {
            System.out.println("Chassi: ");
            caminhao_cacambaDTO.setChassi(scanner.nextInt());

            System.out.println("marca: ");
            caminhao_cacambaDTO.setMarca(scanner.nextInt());

            System.out.println("modelo: ");
            caminhao_cacambaDTO.setModelo(scanner.nextInt());

            System.out.println("potencia: ");
            caminhao_cacambaDTO.setPotencia(scanner.nextInt());

            System.out.println("Capacidade de tonelada: ");
            caminhao_cacambaDTO.setCapacidade_tonelada(scanner.nextInt());

            System.out.println("Quantidade semireboque: ");
            caminhao_cacambaDTO.setQtd_semireboque(scanner.nextInt());
            
            System.out.println(caminhao_cacambaCTR.mostrarDadosCaminhao_cacamba(caminhao_cacambaDTO));
        }
    }
}
