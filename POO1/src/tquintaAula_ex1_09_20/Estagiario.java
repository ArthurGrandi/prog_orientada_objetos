package tquintaAula_ex1_09_20;

class Estagiario extends Empregado{

// Atributos
private int descontos;

// Construtor
public Estagiario(int codigo, String nome, String email, double salario , int descontos){
    super(codigo,nome,email,salario);
    this.descontos = descontos;
}

// Métodos
public int getDescontos() {
    return descontos;
}

public void setDescontos(int descontos) {
    this.descontos = descontos;
}

@Override
public String toString() {
    return "estagiario [descontos=" + descontos + "]";
}
}
