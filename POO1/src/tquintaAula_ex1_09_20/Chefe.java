package tquintaAula_ex1_09_20;

class Chefe extends Empregado {

// Atributos
private double beneficio;

// Construtor
public Chefe(int codigo, String nome, String email, double salario , double beneficio){
    super(codigo,nome,email,salario);
    this.beneficio = beneficio;
}

// Métodos
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
