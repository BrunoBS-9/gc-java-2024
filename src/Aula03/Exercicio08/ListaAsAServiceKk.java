package Aula03.Exercicio08;

import java.util.ArrayList;

public class ListaAsAServiceKk {
    ArrayList<Veiculo> veiculosLista = new ArrayList<>();

    public void adicionarVeiculoLista (Veiculo veiculo){
        veiculosLista.add(veiculo);
    }
    public ArrayList<Veiculo> getVeiculosLista() {
        return veiculosLista;
    }

    public int pegarTamanhoLista(){
        return veiculosLista.size();
    }


    public Veiculo procurarVeiculoNome(String nomeVeiculo){
        String procuraEncurtada = nomeVeiculo.substring(0, 3);

        for(Veiculo veiculo : veiculosLista){
            if(veiculo.getModelo().substring(0,3).equalsIgnoreCase(procuraEncurtada)){
                return veiculo;
            }
        }
        return null;
    }
}
