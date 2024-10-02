package tquintaAula_ex5_09_20;

public class Pessoa{

    //Atributos
    public String nome;
    public int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos

    //Getters e Setters
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

@Override
public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
} 
}
