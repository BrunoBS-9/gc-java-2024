package Aula05.Exercicio14;

import java.util.ArrayList;

public class PrincipalA05E14 {
    public static void main(String[] args) {
        ArrayList <Veiculo> veiculos = new ArrayList<>();

        Moto moto1 = new Moto("Yamaha", "MT-07", 2021, 689);
        Moto moto2 = new Moto("Honda", "CB 500F", 2019, 471);

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4);
        Carro carro2 = new Carro("Honda", "Civic", 2018, 4);

        Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", 2020, 40);
        Caminhao caminhao2 = new Caminhao("Scania", "R 450", 2019, 35);

        veiculos.add(moto1);
        veiculos.add(moto2);
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(caminhao1);
        veiculos.add(caminhao2);

        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo.coletarDetalhes());
        }
    }
}
