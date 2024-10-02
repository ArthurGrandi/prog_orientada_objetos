package tquintaAula_ex4_09_20;

class Gato extends Animal{

    //Atributos
    private String miado;

    //Construtor
    public Gato(String nome, String raca, String miado){
        super(nome, raca);
        this.miado=miado;
    }

    //Metodo Miado
    public void mia(){
        System.out.println("Miau");
    }

    //Getter e Setter
    public String getMiado() {
        return miado;
    }

    public void setMiado(String miado) {
        this.miado = miado;
    }

}
