package tquintaAula_ex3_09_20;

// Classe Administrativo que herda de Assistente
class Administrativo extends Assistente {
    private String turno; // "dia" ou "noite"
    private double adicionalNoturno;

    public Administrativo(String nome, String endereco, String telefone, String email, String matricula, String turno, double adicionalNoturno) {
        super(nome, endereco, telefone, email, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }
}
