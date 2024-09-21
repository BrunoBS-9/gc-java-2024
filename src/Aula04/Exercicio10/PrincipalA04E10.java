package Aula04.Exercicio10;

public class PrincipalA04E10 {
    /*
        Crie uma classe base chamada Veiculo que tenha os atributos
        marca, modelo e ano. Inclua um método chamado informacoes()
        que exibe esses detalhes. Em seguida, crie duas subclasses: Carro
        e Moto. A classe Carro deve ter um atributo adicional
        numeroDePortas, e a classe Moto deve ter um atributo
        tipoDeGuidao. Ambas as subclasses devem sobrescrever o
        método informacoes() para incluir os atributos adicionais. Deve
        devolver uma string com essas informações.
     */
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Fiat", "Argo", 2010);
        Carro novoCarro = new Carro("Fiat", "Mobi", 2021, 4);
        Moto novaMoto = new Moto("Yamaha", "XTZ 150", 2021, "Guidão dos Bons");

        System.out.println(veiculo.informacoes());
        System.out.println(novoCarro.informacoes());
        System.out.println(novaMoto.informacoes());
    }
}
