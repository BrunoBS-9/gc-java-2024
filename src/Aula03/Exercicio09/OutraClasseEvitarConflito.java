package Aula03.Exercicio09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OutraClasseEvitarConflito {
    public void transferencia(ContaBancaria destino, double valor){
        if(verificaEstaAberto()){
            // TODO destino.deposito(valor);
        }

    }

    public boolean verificaEstaAberto(){
        LocalTime horaAbertura = LocalTime.of(8, 0,0);
        LocalTime horaFechamento = LocalTime.of(19,0,0);
        LocalDate dataAtual = LocalDate.now();
        LocalTime horarioAtual = LocalTime.now();

        // Obtém o dia da semana da data atual
        DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();

        if(diaDaSemana != DayOfWeek.SATURDAY && diaDaSemana != DayOfWeek.SUNDAY){
            if(horarioAtual.isAfter(horaAbertura) && horarioAtual.isBefore(horaFechamento)){
                return true;
            }
        }

        return false;
    }

    public void verificarSaldo(){
        // TODO System.out.println("Seu saldo é: " + saldo);
    }

    public void verificarHorario(){
        LocalTime horarioAtual = LocalTime.now();

        System.out.println("Agora são: "+ horarioAtual.getHour() + ":"+ horarioAtual.getMinute());
    }

    public void verificarInformacoes(){
        String nome = "", cpf = "", identificadorConta = "", nomeDoBanco = "", endereco = "";
        double saldo = 0;
        System.out.println("===================================");
        System.out.printf("""
                Dados da Conta de %s
                CPF: %s
                Identificador de Conta: %s
                Nome Do Banco: %s
                Endereco: %s
                Saldo na Conta: %.2f
                
                """, nome, cpf, identificadorConta, nomeDoBanco, endereco, saldo);
        System.out.println("===================================");
    }
}
