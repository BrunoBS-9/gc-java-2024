package Aula02.Exercicio07;

public class Operacoes {

    public double somar(double nro1, double nro2){
        return nro1 + nro2;
    }

    public double subtrair(double nro1, double nro2){
        return nro1 - nro2;
    }

    public double dividir(double nro1, double nro2){
        try{
            if(nro2 == 0){
                throw new RuntimeException("Impossível dividir por zero.");
            }
        }catch(Exception e){
            System.out.println("Erro ao processar o cálculo, a mensagem do sistema é: "+ e.getMessage());
        }

        return nro1 / nro2;
    }

    public double multiplicar(double nro1, double nro2){
        return nro1 * nro2;
    }

    public double potenciar(double base, int expoente){
        try{
            if(base <= 0 || expoente <= 0){
                throw new RuntimeException("Nem a base quanto o expoente podem ser menor ou igual a zero.");
            }
        }catch (Exception e){
            System.out.println("Erro ao processar o cálculo, a mensagem do sistema é: "+ e.getMessage());
        }

        double resultado = 1;
        for(int i = 0; i < expoente; i++){
            resultado *= base;
        }
        return resultado;
    }

    public double radicar(double radicando){
        double resultado = 0;
        // Math.pow(radicando, 1.0 / 2);

        for (int i = 0; i < 1.0/2; i++){
            resultado = radicando * radicando;
        }
        return resultado;

    }

    public boolean testaMenorIgual0(double valor){
        try{
            if(valor <= 0){
                throw new RuntimeException("O número não pode ser menor ou igual a zero.");

            }
        }catch (Exception e){
            System.out.println("Erro ao processar o cálculo, a mensagem do sistema é: "+ e.getMessage());
            return true;
        }
        return false;
    }

}
