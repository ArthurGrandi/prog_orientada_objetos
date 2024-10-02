package tquintaAula_ex4_09_20;

public class Main {
    public static void main(String[] args) {

        Gato Lorde = new Gato("Lorde", "Vira-Lata", "Miau");
        Cachorro Jimmy = new Cachorro("Jimmy", "Border Collie", "Au-Au");

        System.out.println();
        Lorde.mia();
        Jimmy.late();

        System.out.println();

        Lorde.caminha();
        Jimmy.caminha();
        System.out.println();

    }
}
