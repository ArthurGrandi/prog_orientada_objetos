package tquartaAula_09_13;

public class Poupanca extends Corrente {
    private double saldominimo;

    public Poupanca(int num, double sal, double salmin) {
        super(num, sal); 
        this.saldominimo = salmin;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldominimo) {
                this.saldominimo = super.getSaldo(); 
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void atualizarSaldo() {
        super.setSaldo(super.getSaldo() + (this.saldominimo * 0.05));
        this.saldominimo = super.getSaldo();  
    }

    public double getSaldominimo() {
        return this.saldominimo;
    }
}
