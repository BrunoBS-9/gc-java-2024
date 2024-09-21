package Aula03.Exercicio09.Verificadores;

public class VerificadorDeCpf {

    public boolean verificadorDeCpf(String cpf){
        // retira e testa se o cpf inserido tem 11 caracteres e retira - e .
        String cpfLimpo = cpfCleaner(cpf);

        // primeiroVerificador e segundoVerificador vao ser os dois numeros após o "-" do cpf
        int multiplicadores = 10, soma = 0;
        int primeiroVerificador = cpfLimpo.charAt(9) - '0', segundoVerificador = cpfLimpo.charAt(10) - '0';

        if (cpfLimpo == null || cpfLimpo.matches("(\\d)\\1{10}")) {
            return false;
        }

        // verifica o cpf de 0 até o index 8, multiplicando por 10, 9, 8... e guarda resultado em "soma"
        for(int i = 0; i <= 9; i++){
            int numeroDaVezCpf = cpfLimpo.charAt(i) - '0';
            soma += numeroDaVezCpf * multiplicadores ;

            System.out.println("NumeroDaVezDoCpf: "+ numeroDaVezCpf + ", Multiplicador " + multiplicadores + ", Soma: "+soma);
            multiplicadores--;
        }

        System.out.println(primeiroVerificador);
        System.out.println(segundoVerificador);

        // Se o resultado for 10, troca para 0
        int finalPrimeiroVerificador = (soma * 10) % 11;
        if (finalPrimeiroVerificador == 10) {
            finalPrimeiroVerificador = 0;
        }

        // verifica soma se é igual * 10 % 11 é igual ao primeiroVerificador
        if(finalPrimeiroVerificador == primeiroVerificador) {
            soma = 0;
            multiplicadores = 11;
            for (int i = 0; i <= 10; i++) {
                // Esse -'0' transforma o representante ascii em numero normal
                int numeroDaVezCpf = cpfLimpo.charAt(i) - '0';
                soma += numeroDaVezCpf * multiplicadores;

                multiplicadores--;
            }
            System.out.println(soma);

            int finalSegundoVerificador = (soma * 10) % 11;
            if (finalSegundoVerificador == 10) {
                finalSegundoVerificador = 0;
            }
            if(finalSegundoVerificador == segundoVerificador){
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    // Retira pontos e hifens da string cpf e retorna string
    public String cpfCleaner(String cpf){
        String cleanedCpf = cpf.replace("-","").replace(".","");

        if(cleanedCpf.length() == 11){
            return cleanedCpf;
        }
        return null;
    }
}
