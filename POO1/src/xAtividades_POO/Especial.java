package xAtividades_POO;

public class Especial extends Corrente {
    private int limite;

    public Especial(int num, double sal, Clientes cli, int lim) {
        super(num, sal, cli);
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