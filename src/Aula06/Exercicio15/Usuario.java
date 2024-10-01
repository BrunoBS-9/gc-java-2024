package Aula06.Exercicio15;

public class Usuario {
    private NivelAcesso acessoPessoa;

    public void setNivelAcesso(String acesso){
        if(acesso.toUpperCase().contains("ADM")){
            this.acessoPessoa = NivelAcesso.ADMIN;
        } else if (acesso.toUpperCase().contains("MOD")){
            this.acessoPessoa = NivelAcesso.MODERADOR;
        } else if (acesso.toUpperCase().contains("USU")){
            this.acessoPessoa = NivelAcesso.USUARIO;
        } else{
            System.out.println("Erro ao setar acesso");
        }
    }

    public void exibeNivelAcesso(){
        System.out.println("Seu nível de acesso é: ");
        switch (acessoPessoa) {
            case ADMIN -> System.out.println("<Admin> O administrador pode acessar todos os recursos");
            case MODERADOR -> System.out.println("<Moderador> O moderador pode alterar alguns recursos");
            case USUARIO -> System.out.println("<Usuario> Seja bem vindo a este programa <InsiraSeuNomeAqui>");
            default -> System.out.println("Entrada inserida inválida");
        }
    }
}
