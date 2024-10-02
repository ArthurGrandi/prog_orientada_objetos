package tquintaAula_ex5_09_20;

public class Main {
    public static void main(String[] args) {

        Rica Luiza = new Rica(100000);
        Pobre Marta = new Pobre();
        Miseravel Joao = new Miseravel();

        System.out.println();
        Luiza.fazCompras();
        System.out.println();
        Marta.trabalha();
        System.out.println();
        Joao.mendiga();
        System.out.println();
    }
}
