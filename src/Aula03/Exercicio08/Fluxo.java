package Aula03.Exercicio08;

public class Fluxo {

    public void mensagemOpcaoInvalida(){
        System.out.println("Opção inválida");
    }

    public void pedeMarca(TipoVeiculo tipoVeiculo){
        if(tipoVeiculo == TipoVeiculo.CARRO){
            System.out.println("Insira a marca do Carro");
        } else if(tipoVeiculo == TipoVeiculo.MOTO) {
            System.out.println("Insira a marca da Moto");
        }
    }

    public void pedeModelo(TipoVeiculo tipoVeiculo){
        if(tipoVeiculo == TipoVeiculo.CARRO){
            System.out.println("Insira o modelo do Carro");
        } else if(tipoVeiculo == TipoVeiculo.MOTO) {
            System.out.println("Insira o modelo da Moto");
        }
    }

    public void pedeAno(TipoVeiculo tipoVeiculo){
        if(tipoVeiculo == TipoVeiculo.CARRO){
            System.out.println("Insira o ano do Carro");
        } else if(tipoVeiculo == TipoVeiculo.MOTO) {
            System.out.println("Insira o ano da Moto");
        }
    }

    public void mostraResultado(double valorDaViagem){
        System.out.println("==================================================");
        System.out.printf("O valor da viagem será de R$%.2f\n", valorDaViagem);
        System.out.println("==================================================");
    }

    public boolean verificaEntrada(String entrada){
        if(entrada.length() < 3){
            return false;

        }
        return true;
    }
}
