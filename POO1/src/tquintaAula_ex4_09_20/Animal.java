package tquintaAula_ex4_09_20;

public class Animal {
    //Atributos
    private String nome;
    private String raca;

    // Construtor
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    //Método Caminha
    public void caminha() {
        System.out.println("O animal " +getNome() + " está caminhando!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", raca=" + raca + "]";
    }
}
