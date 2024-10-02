package tquintaAula_ex5_09_20;

class Miseravel extends Pessoa{

    //Construtor
    public Miseravel(){
        super("João", 62);
    }

    //Método mendiga
    public void mendiga(){
        System.out.println("O " + getNome() + " mora na rua, e depende da ajuda dos outros para comer.");
    }
}
