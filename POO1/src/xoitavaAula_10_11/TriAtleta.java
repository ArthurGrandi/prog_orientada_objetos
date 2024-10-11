package xoitavaAula_10_11;

public class TriAtleta extends Pessoa implements Atleta, Ciclista, Corredor, Nadador{
    public TriAtleta(String nom, String end){
    super(nom, end);
    }
    @Override
    public void pedalar() {
    System.out.println(this.getNome() + " está pedalando");
    }
    @Override
    public void correr() {
    System.out.println(this.getNome() + " está correndo");
    }
    @Override
    public void aquecer() {
    System.out.println(this.getNome() + " está aquecendo");
    }
    @Override
    public void nadar() {
    System.out.println(this.getNome() + " está nadando");
    }
    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getEndereco());
    }
    
    }
