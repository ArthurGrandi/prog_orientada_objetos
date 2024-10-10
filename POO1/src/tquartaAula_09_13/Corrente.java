package tquartaAula_09_13;

public class Corrente {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Corrente(int num, double sal) {
        this.numero = num;
        this.saldo = sal;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String clienteNome = (cliente != null) ? cliente.getNome() : "Sem Cliente";
        return "Conta: " + this.numero + " | Saldo: " + this.saldo + " | Cliente: " + clienteNome;
    }
}
