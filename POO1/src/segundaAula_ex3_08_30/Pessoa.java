package segundaAula_ex3_08_30;

public class Pessoa {

    //Atributos
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    //Contrutor
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos

    public void envelhecer(){
        this.idade += 1;
        if (idade < 21 ){
            altura += 0.05;
        }
    }

    public int getEvencelher(){
        return (this.idade);
    }

    public void emagrecer(){
        this.peso -= 1;
    }

    public double getEmagrecer(){
        return (this.peso);
    }
    
    public void engordar(){
        this.peso += 1;
    }

    public double getEngordar(){
        return (this.peso);
    }

    public double getAltura(){
        return (this.altura);
    }
}
