package bossMundo01;

class Aventureiros {
    private String nome;
    private int idade;
    private String classe;
    private double salarioBase;
    private Integer desempenho;  // Avaliação de desempenho (1 a 5)


    //atributos de Aventureiro
    public Aventureiros(String nome, int idade, String classe, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;
        this.salarioBase = salarioBase;
        this.desempenho = null;  // Desempenho ainda não avaliado
    }

    //Seters e geters
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setClasse(String classe) { this.classe = classe; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public void setDesempenho(int desempenho) {
        if (desempenho < 1 || desempenho > 5) {
            System.out.println("Nota de desempenho inválida! Deve ser entre 1 e 5.");
        } else {
            this.desempenho = desempenho;
        }
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getClasse() { return classe; }
    public double getSalarioBase() { return salarioBase; }
    public Integer getDesempenho() { return desempenho; }


    @Override
    public String toString() {
        String desempenhoStr = (desempenho != null) ? "Desempenho: " + desempenho : "Desempenho: Não avaliado";
        return "Nome: " + nome + ", Idade: " + idade + ", Classe: " + classe + ", Salário Base: " + salarioBase + ", " + desempenhoStr;
    }
}
