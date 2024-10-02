package tquintaAula_ex2_09_20;

// Classe base Ingresso
class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }

    public double getValor() {
        return valor;
    }
}
