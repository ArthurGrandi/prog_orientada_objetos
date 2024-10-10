package xAtividades_POO;

public class Poupanca extends Corrente {

    private double saldominimo;

    public Poupanca(int num, double sal, Clientes cli, double salmin) {
        super(num, sal, cli);
        this.saldominimo = salmin;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldominimo)
                this.saldominimo = super.getSaldo();
        } else
            System.out.println("Saldo Insuficiente");
    }

    public void atualizarSaldo() {
        super.setSaldo((super.getSaldo() + (this.saldominimo * 0.05)));
        this.saldominimo = super.getSaldo();

    }

    public double getSaldominimo() {
        return this.saldominimo;
    }
}