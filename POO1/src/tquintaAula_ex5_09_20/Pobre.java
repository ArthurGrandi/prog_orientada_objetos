package tquintaAula_ex5_09_20;

class Pobre extends Pessoa{

    //Construtor
    public Pobre(){
        super("Marta", 49);
    }

    //Método trabalha
    public void trabalha(){
        System.out.println("A " + getNome() + " sai de casa todo dia as 06:00 e trabalha até as 18:00.");
    }
}
