package tquintaAula_ex1_09_20;

class Estagiario extends Empregado {

    // Atributos
    private double descontos;

    // Construtor
    public Estagiario(int codigo, String nome, String email, double salario, double descontos) {
        super(codigo, nome, email, salario);  // Chama o construtor da superclasse
        this.descontos = descontos;           // Inicializa o atributo descontos
    }

    // Método de aumento salarial para estagiário
    public void aumento_salarial(double percentual) {
        double novoSalario = getSalario() + (getSalario() * (percentual / 100)) - descontos;
        setSalario(novoSalario);
    }

    // Getters e Setters
    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    @Override
    public String toString() {
        return "Estagiario [descontos=" + descontos + ", salario=" + getSalario() + "]";
    }
}
