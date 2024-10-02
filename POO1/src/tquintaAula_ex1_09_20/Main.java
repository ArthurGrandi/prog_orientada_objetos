package tquintaAula_ex1_09_20;

public class Main {

    public static void main(String[] args) {

        Empregado fulano = new Empregado(1, "Fulano", "fulano@email.com", 1412.32);
        Chefe robesval = new Chefe(4, "Robesval", "robesval@email.com", 20000, 1000);
        Estagiario cristiano = new Estagiario(5, "Cristiano", "cristiano@email.com", 1412.32, 200);

        System.out.println();
        System.out.println("O empregado Fulano recebe " + fulano.getSalario() + " por mês!");
        System.out.println("Robesval, chefe da empresa, recebe " + robesval.getSalario() + " por mês!");
        System.out.println("Cristiano, estagiário, recebe " + cristiano.getSalario() + " por mês!");

        System.out.println();
        System.out.println("x-- Aumentos Salariais --x");
        System.out.println();

        // Aplicando aumentos
        fulano.aumento_salarial(25);
        robesval.aumento_salarial(10);
        cristiano.aumento_salarial(10);

        // Exibindo salários após aumento
        System.out.println("O empregado Fulano agora recebe " + fulano.getSalario() + " por mês!");
        System.out.println("O chefe Robesval agora recebe " + robesval.getSalario() + " por mês!");
        System.out.println("O estagiário Cristiano agora recebe " + cristiano.getSalario() + " por mês!");
        System.out.println();
    }
}
