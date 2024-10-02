package tquintaAula_ex2_09_20;

// Classe Normal que herda de Ingresso
class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso Normal");
    }
}
