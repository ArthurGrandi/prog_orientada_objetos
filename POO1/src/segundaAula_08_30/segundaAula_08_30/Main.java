package segundaAula_08_30;

public class Main {
    public static void main(String[] args){

    Bola futebol = new Bola("Branca", "Couro", 68.5);

    System.out.println("Eu tenho uma bola de futebol ela é da cor " + futebol.mostraCor() + " eu amo ela");

    System.out.println("A bola caiu em um balde de tinta e mudou de cor, agora ela é " + futebol.trocaCor());
    }
}