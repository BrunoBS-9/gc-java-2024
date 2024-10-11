package BossMundo01;
import java.util.ArrayList;
import java.util.List;

class SistemaDeGestao {
    private List<Aventureiros> aventureiros;

    public SistemaDeGestao() {
        this.aventureiros = new ArrayList<>();
    }

    public void cadastrarAventureiro(String nome, int idade, String classe, double salarioBase) {
        Aventureiros aventureiro = new Aventureiros(nome, idade, classe, salarioBase);
        aventureiros.add(aventureiro);
        System.out.println("Aventureiro(a) " + nome + " cadastrado(a) com sucesso!");
    }

    public void atualizarAventureiro(String nome, String novoNome, Integer novaIdade, String novaClasse, Double novoSalario) {
        for (Aventureiros aventureiro : aventureiros) {
            if (aventureiro.getNome().equals(nome)) {
                if (novoNome != null) aventureiro.setNome(novoNome);
                if (novaIdade != null) aventureiro.setIdade(novaIdade);
                if (novaClasse != null) aventureiro.setClasse(novaClasse);
                if (novoSalario != null) aventureiro.setSalarioBase(novoSalario);
                System.out.println("Informações do aventureiro(a) " + nome + " atualizadas com sucesso!");
                return;
            }
        }
        System.out.println("Aventureiro(a) " + nome + " não encontrado(a).");
    }

    public void removerAventureiro(String nome) {
        aventureiros.removeIf(aventureiro -> aventureiro.getNome().equals(nome));
        System.out.println("Aventureiro(a) " + nome + " removido(a) com sucesso!");
    }

    public void listarAventureiros() {
        if (aventureiros.isEmpty()) {
            System.out.println("Nenhum aventureiro cadastrado.");
        } else {
            aventureiros.forEach(System.out::println);
        }
    }

    public void buscarAventureiroPorNome(String nome) {
        for (Aventureiros aventureiro : aventureiros) {
            if (aventureiro.getNome().equals(nome)) {
                System.out.println(aventureiros);
                return;
            }
        }
        System.out.println("Aventureiro(a) " + nome + " não encontrado(a).");
    }

    public void filtrarPorClasse(String classe) {
        List<Aventureiros> filtrados = aventureiros.stream()
                .filter(aventureiro -> aventureiro.getClasse().equals(classe))
                .toList();
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum aventureiro(a) da classe " + classe + " encontrado.");
        } else {
            filtrados.forEach(System.out::println);
        }
    }

    public void avaliarDesempenho(String nome, int nota) {
        for (Aventureiros aventureiro : aventureiros) {
            if (aventureiro.getNome().equals(nome)) {
                aventureiro.setDesempenho(nota);
                System.out.println("Desempenho do aventureiro(a) " + nome + " avaliado com sucesso!");
                return;
            }
        }
        System.out.println("Aventureiro(a) " + nome + " não encontrado(a).");
    }
}