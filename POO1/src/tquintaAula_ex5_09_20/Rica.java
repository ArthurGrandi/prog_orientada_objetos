package tquintaAula_ex5_09_20;

class Rica extends Pessoa{

    //Atributos
    private double dinheiro;

    //Construtor
    public Rica(double dinheiro){
        super("Luiza", 26);
        this.dinheiro=dinheiro;
    }

    //Método fazCompras
    public void fazCompras(){
        System.out.println("A madame " + getNome() + " está fazendo compras!");
    }

    //Getter e Setter
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

}
