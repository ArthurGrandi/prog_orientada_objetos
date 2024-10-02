package tquintaAula_ex4_09_20;

class Cachorro extends Animal{
    //Atributos
    private String latido;

    //Construtor
    public Cachorro(String nome, String raca, String latido){
        super(nome, raca);
        this.latido=latido;
    }

    //Metodo Latido
    public void late(){
        System.out.println("Au Au");
    }

    //Getter e Setter
    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

}
