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

// Métodos
public double aumento_salarial_empregado(double percentual){
    setSalario((salario * (percentual / 100)) + salario);
    return salario;
}
public double aumento_salarial_chefe(double percentual){
    setSalario((salario * (percentual / 100)) + salario + beneficio);
    return salario;
}
public double aumento_salarial_estagiario(double percentual){
    setSalario((salario * (percentual / 100)) + salario - descontos);
    return salario;
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
