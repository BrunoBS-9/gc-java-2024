package Aula06.Exercicio15;

import java.util.Scanner;

public class PrincipalA06E15 {
    public static void main(String[] args) {
        var usuarioAtual = new Usuario();

        usuarioAtual.setNivelAcesso("adminstrador");
        usuarioAtual.exibeNivelAcesso();

        usuarioAtual.setNivelAcesso("moderador");
        usuarioAtual.exibeNivelAcesso();

        usuarioAtual.setNivelAcesso("usuario");
        usuarioAtual.exibeNivelAcesso();
    }
}
