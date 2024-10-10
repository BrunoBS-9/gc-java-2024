package Aula06.Exercicio19;

public class StringSplinter {
    public String[] dividirString(char divisor, String texto){
        String[] textoDividido = new String[2];
        int indexDivisor = 0;
        String nomeAluno = "";
        String numero = "";
        String textoNovo = removeEspacos(texto);

        for(int i = 0; i < textoNovo.length(); i ++){

            if(textoNovo.charAt(i) == divisor){
                indexDivisor = i;
                break;
            }
            nomeAluno += textoNovo.charAt(i);
        }
        System.out.println(nomeAluno);
        for (int i = indexDivisor+1; i < textoNovo.length(); i++){
            numero += textoNovo.charAt(i);
        }
        System.out.println(numero);
        textoDividido[0] = nomeAluno;
        textoDividido[1] = numero;
        return textoDividido;
    }

    public String removeEspacos(String texto){
        String novaString = "";
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) != ' '){
                novaString += texto.charAt(i);
            }
        }
        return novaString;
    }
}
