package tquintaAula_ex1_09_20;

class Chefe extends Empregado {

// Atributos
private double beneficio;

    // Construtor
    public Chefe(int codigo, String nome, String email, double salario, double beneficio) {
        super(codigo, nome, email, salario);  // Chama o construtor da superclasse
        this.beneficio = beneficio;           // Inicializa o atributo beneficio
    }

    // Método de aumento salarial para chefe
    public void aumento_salarial(double percentual) {
        double novoSalario = getSalario() + (getSalario() * (percentual / 100)) + beneficio;
        setSalario(novoSalario);
    }

// Getters e Setters
public double getBeneficio() {
    return beneficio;
}

public void setBeneficio(double beneficio) {
    this.beneficio = beneficio;
}

@Override
public String toString() {
    return "chefe [beneficio=" + beneficio + "]";
}
}
