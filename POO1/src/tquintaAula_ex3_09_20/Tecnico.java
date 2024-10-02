package tquintaAula_ex3_09_20;

// Classe Técnico que herda de Assistente
class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, String endereco, String telefone, String email, String matricula, double bonusSalarial) {
        super(nome, endereco, telefone, email, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }
}
