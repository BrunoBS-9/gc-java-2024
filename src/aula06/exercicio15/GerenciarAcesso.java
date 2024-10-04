package aula06.exercicio15;

public class GerenciarAcesso  {
    enum NivelAcesso {
        ADMIN, MODERADOR, USUARIO
    }
    public static void main(String[] args) {

        NivelAcesso bruno = NivelAcesso.ADMIN;

        switch (bruno) {
            case ADMIN -> System.out.println("O seu nivel de acesso é ADMIN, você tem acesso total ao sistema");
            case MODERADOR -> System.out.println("O seu nivel de acesso é MODERADOR, você tem acesso a todas as ferramentas de desenvolvimetno");
            case USUARIO -> System.out.println("O seu nivel de acesso é USUARIO, você tem acesso restrito as aplicações do sistema");
            default -> System.out.println("Digite o seu nivel de acesso de acordo com os padrões");
        }
    }
}
