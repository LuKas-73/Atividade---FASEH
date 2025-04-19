package Lista3;

public class Medico {
    private String nome;
    private int idade;

    public Medico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Médico: " + nome + " | Idade: " + idade;
    }
}
