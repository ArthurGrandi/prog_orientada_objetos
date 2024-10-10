package tquartaAula_09_13;

import java.util.ArrayList;
import java.util.List;
import Cliente;

public class ListaCliente {
    private List<Cliente> clientes;

    public ListaCliente() {
        clientes = new ArrayList<Cliente>();
    }

    public void addClientes(Cliente cli) {
        clientes.add(cli);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void imprimeCliente() {
        for (Cliente cli : clientes) {
            System.out.println(cli);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cli : clientes) {
            sb.append(cli.toString()).append("\n");
        }
        return sb.toString();
    }
}
