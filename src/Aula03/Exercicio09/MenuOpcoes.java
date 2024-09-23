package Aula03.Exercicio09;

import java.time.LocalTime;
import java.util.Scanner;

public class MenuOpcoes {
    public void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int escolha;
        LocalTime localTime = LocalTime.now();
        ContaBancaria conta = new ContaBancaria("Helio", "042.076.270-14", "123123-12", "Bradesco", "Endereco123", 750, localTime);
        do {
            System.out.println("Olá, Seja Bem vindo: Primo rico!");
            System.out.println("");
            System.out.println("""
                                       ⧣₊˚﹒✦₊  ⧣₊˚★⸝⸝ ⧣₊˚﹒✦₊  ⧣₊˚" +
                                "    /) /)" +
                                "  (｡•ㅅ•｡)〝₎₎ BANCO CALDEIRÍSTICO IRADO! ✦₊ ˊ˗" +
                                ". .╭∪─∪────────── ✦ ⁺." +
                                ". .┊" + "============MENU=================" +
                                ". .┊" + "----1. Consultar Saldo-----------" +
                                ". .┊" + "----2. Fazer Saque---------------" +
                                ". .┊" + "----3. Efetuar Pix---------------" +
                                ". .┊" + "----4. Tranferência Bancária-----" +
                                ". .┊" + "----5. Informações Pessoais------" +
                                ". .┊" + "----6. SAIR----------------------" +
                                "   ╰─────────────  ✦ ⁺." +
                                "      ⧣₊˚﹒✦₊  ⧣₊˚ ★    ⸝⸝ ⧣₊˚﹒✦₊  ⧣₊˚""");//Giancarlo easter egg
            System.out.println("====BANCO CALDEIRÍSTICO IRADO====");
            System.out.println("============MENU=================");
            System.out.println("----1. Consultar Saldo-----------");
            System.out.println("----2. Fazer Saque---------------");
            System.out.println("----3. Efetuar Pix---------------");
            System.out.println("----4. Tranferência Bancária-----");
            System.out.println("----5. Informações Pessoais------");
            System.out.println("----6. SAIR----------------------");

            //TODO OPÇÃO DE FECHAR CONTA
            escolha = scan.nextInt();

            System.out.println("Você escolheu a opção" + escolha);
            switch (escolha) {

                case 1:


                case 2:


                case 3:


                case 4:


                case 5:


                case 6:


            }
        } while (escolha != 6) ;
    }
}

