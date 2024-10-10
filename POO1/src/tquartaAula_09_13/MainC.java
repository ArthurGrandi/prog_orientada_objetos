package tquartaAula_09_13;

public class MainC {
    public static void main(String[] args) {
        ListaCliente lista = new ListaCliente();

        Cliente cli1 = new Cliente("Joice", "394.723.947-32");
        lista.addClientes(cli1);
        Cliente cli2 = new Cliente("João", "701.324.567-09");
        lista.addClientes(cli2);
        Cliente cli3 = new Cliente("Ivo", "435.456.324-45");
        lista.addClientes(cli3);
        Cliente cli4 = new Cliente("Ana", "730.043.786-05");
        lista.addClientes(cli4);
        Cliente cli5 = new Cliente("Carlos", "101.324.876-09");
        lista.addClientes(cli5);

        Corrente cc1 = new Corrente(1, 1000.0);
        cli1.addContas(cc1);
        Corrente cc2 = new Corrente(2, 2500);
        cli2.addContas(cc2);
        Poupanca cp1 = new Poupanca(3, 1000.0, 1000.0);
        cli2.addContas(cp1);
        Especial ce1 = new Especial(4, 1500.0, 3000);
        cli3.addContas(ce1);
        Investimento ci1 = new Investimento(5, 2000.0, 20, 10);
        cli3.addContas(ci1);
        Investimento ci2 = new Investimento(6, 5000.0, 20, 5);
        cli4.addContas(ci2);

        for (Cliente cli : lista.getClientes()) {
            System.out.println(cli.getNome() + ": " + cli.getContas());
        }
    }
}
