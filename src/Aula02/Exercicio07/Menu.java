package Aula02.Exercicio07;
import java.util.Scanner;

public class Menu {
    public static void menu(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int nro1, nro2;
        do {
            System.out.println("CALCULADORA CALDEIRÍSTICA");
            System.out.println("-------MENU--------------");
            System.out.println("----1. Somar------------");
            System.out.println("----2. Subtrair---------");
            System.out.println("----3. Dividir----------");
            System.out.println("----4. Multiplicar------");
            System.out.println("----5. Potenciar--------");
            System.out.println("----6. Radicar----------");
            System.out.println("----n. SAIR-------------");

            escolha = scan.next().charAt(0);

            System.out.println("Você escolheu a opção" + escolha);
            switch (escolha) {

                case 1:
                    System.out.println("----------SOMAR------------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    // return somar(nro1, nro2); me explica isso dai meu kkkk
                    System.out.println("--------RESULTADO----------");
                    break;

                case 2:
                    System.out.println("-------SUBTRAIR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    break;

                case 3:
                    System.out.println("-------DIVIDIR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    break;

                case 4:
                    System.out.println("-------MULTIPLICAR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    break;

                case 5:
                    System.out.println("-------POTENCIAR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    break;

                case 6:
                    System.out.println("-------RADICAR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextInt();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    break;

                case 'n':
                    escolha = 7;
                    break;

            }

        }while (escolha != 7); //escolha != n
    }
}
