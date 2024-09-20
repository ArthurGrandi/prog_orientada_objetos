package tquintaAula_ex1_09_20;

public class Main {

    public static void main(String[] args) {

    Empregado fulano = new Empregado(1, "fulano", "fulano@email.com", 1412.32);

    Empregado ciclano = new Empregado(2, "ciclano", "ciclano@email.com", 1412.32);

    Empregado beltrano = new Empregado(3, "beltrano", "beltrano@email.com", 1412.32);

    Chefe robesval = new Chefe(4, "robesval", "robesval@email.com", 20000, 1000);

    Estagiario cristiano = new Estagiario(5, "cristiano", "cristiano@email.com", 1412.32, 200);

    System.out.println("x-----------------------x");

    System.out.println("O empregado Fulano recebe " + fulano.getSalario() + " por mês!");

    System.out.println("O empregado Ciclano recebe " + ciclano.getSalario() + " por mês!");

    System.out.println("O empregado Beltrano recebe " + beltrano.getSalario() + " por mês!");

    System.out.println("Robesval, chefe da empresa recebe " + robesval.getSalario() + " por mês!");

    System.out.println("Cristiano, filho do chefe recebe " + cristiano.getSalario() + " por mês!");

    System.out.println("x-----------------------x");

        fulano.aumento_salarial_empregado(25);
        ciclano.aumento_salarial_empregado(20);
        beltrano.aumento_salarial_empregado(20);
        robesval.aumento_salarial_chefe(10);
        cristiano.aumento_salarial_estagiario(50);

    System.out.println("O empregado Fulano recebeu um aumento, seu salario agora é " + fulano.getSalario() + " reais por mês!");
    System.out.println("O empregado Ciclano recebeu um aumento, seu salario agora é " + ciclano.getSalario() + " reais por mês!");
    System.out.println("O empregado Beltrano recebeu um aumento, seu salario agora é " + beltrano.getSalario() + " reais por mês!");
    System.out.println("O chefe Robesval recebeu um aumento, seu salario agora é " + robesval.getSalario() + " reais por mês!");
    System.out.println("O filho do chefe Robesval recebeu um aumento, seu salario agora é " + cristiano.getSalario() + " reais por mês!");


    }

}
