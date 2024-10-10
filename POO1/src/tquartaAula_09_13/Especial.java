package tquartaAula_09_13;

public class Especial extends Corrente {
    private final int limite;

    public Especial(int num, double sal, int lim) {
        super(num, sal);
        this.limite = lim;
    }

    @Override
    public void debitar(double valor) {
        if (valor <= (super.getSaldo() + this.limite)) {
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}