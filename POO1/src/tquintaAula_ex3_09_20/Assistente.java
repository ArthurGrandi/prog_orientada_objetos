package tquintaAula_ex3_09_20;

// Classe Assistente que herda de Funcionário
class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, String endereco, String telefone, String email, String matricula) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
