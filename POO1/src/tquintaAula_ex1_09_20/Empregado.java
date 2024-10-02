package tquintaAula_ex1_09_20;

public class Empregado {

// Atributos
private int codigo;
private String nome;
private String email;
private double salario;

// Construtor
public Empregado(int codigo, String nome, String email, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
}

    // Método de aumento salarial padrão para empregados
    public void aumento_salarial(double percentual){
        this.salario += this.salario * (percentual / 100);
    }

public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
    }
}
