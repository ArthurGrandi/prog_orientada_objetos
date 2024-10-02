package tquintaAula_ex2_09_20;

// Classe VIP que herda de Ingresso
class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return getValor() + valorAdicional;
    }
}
