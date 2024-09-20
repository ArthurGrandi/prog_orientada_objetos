package tquartaAula_09_13;

public class Corrente {

    private int numero;
    private double saldo;
    private String cliente;

    public Corrente(int num, double sal, String cli) {
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}