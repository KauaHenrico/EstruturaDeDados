import java.util.Objects;

// classe Aluno
public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    // construtor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // método toString para imprimir o objeto Aluno
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade &&
                Double.compare(aluno.nota, nota) == 0 &&
                Objects.equals(nome, aluno.nome);
    }

    // método hashCode para imprimir o objeto Aluno
    public int hashCode() {
        return Objects.hash(nome, idade, nota);
    }
}
