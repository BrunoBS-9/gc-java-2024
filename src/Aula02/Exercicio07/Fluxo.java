package Aula02.Exercicio07;
import java.util.Scanner;

public class Fluxo {
    public void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        int escolha;
        double nro1, nro2;
        do {
            System.out.println("CALCULADORA CALDEIRÍSTICA");
            System.out.println("-------MENU--------------");
            System.out.println("----1. Somar------------");
            System.out.println("----2. Subtrair---------");
            System.out.println("----3. Dividir----------");
            System.out.println("----4. Multiplicar------");
            System.out.println("----5. Potenciar--------");
            System.out.println("----6. Raiz Quadrada----");
            System.out.println("----7. SAIR-------------");

            escolha = scan.nextInt();

            System.out.println("Você escolheu a opção " + escolha);
            switch (escolha) {

                case 1:
                    System.out.println("----------SOMAR------------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextDouble();
                    // return somar(nro1, nro2); me explica isso dai meu kkkk
                    System.out.println("--------RESULTADO----------");
                    System.out.println(operacoes.somar(nro1, nro2));
                    break;

                case 2:
                    System.out.println("-------SUBTRAIR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextDouble();
                    System.out.println("--------RESULTADO----------");
                    System.out.println(operacoes.subtrair(nro1, nro2));
                    break;

                case 3:
                    System.out.println("-------DIVIDIR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextDouble();
                    System.out.println("--------RESULTADO----------");
                    if(nro2 == 0){
                        System.out.println("O divisor não pode ser 0.");
                        break;
                    } else{
                        System.out.println(operacoes.dividir(nro1, nro2));
                        break;
                    }

                case 4:
                    System.out.println("-------MULTIPLICAR---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextDouble();
                    System.out.println("--------RESULTADO----------");
                    System.out.println(operacoes.multiplicar(nro1, nro2));
                    break;

                case 5:
                    System.out.println("-------POTENCIAÇÃO---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:  ");
                    nro2 = scan.nextInt();
                    System.out.println("--------RESULTADO----------");
                    if(operacoes.testaMenorIgual0(nro2)){
                        break;
                    } else{
                        System.out.println(operacoes.potenciar(nro1, (int)nro2));
                        break;
                    }

                case 6:
                    System.out.println("-------Raiz Quadrada---------");
                    System.out.println("Informe o primeiro número: ");
                    nro1 = scan.nextDouble();
                    if(operacoes.testaMenorIgual0(nro1)){
                        break;
                    } else{
                        System.out.println("--------RESULTADO----------");
                        System.out.println(operacoes.radicar(nro1));
                        break;
                    }

                case 7:
                    System.out.println("Finalizando Calculadora...");
                    break;
                default:
                    System.out.println("Entrada inválida");
                    break;
            }

        }while (escolha != 7); //escolha != n
    }
}
