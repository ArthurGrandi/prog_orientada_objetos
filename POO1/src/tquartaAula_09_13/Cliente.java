package tquartaAula_09_13;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Corrente> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<Corrente>(); 
    }

    public void addContas(Corrente conta) {
        conta.setCliente(this);  
        contas.add(conta);
    }

    public ArrayList<Corrente> getContas() {
        return contas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + " | CPF: " + this.cpf;
    }
}
