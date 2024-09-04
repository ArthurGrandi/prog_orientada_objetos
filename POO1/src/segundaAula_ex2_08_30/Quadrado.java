package segundaAula_ex2_08_30;

public class Quadrado {
    
    //Atributos
    private int tamanhoLado;

    // Construtor
    public Quadrado(int tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }

    //Métodos
    public int mudarValorLado(){
        return(this.tamanhoLado = 10);
    }

    public int retornarValorLado(){
        return(this.tamanhoLado);
    }

    public int calcularArea(){
        return(this.tamanhoLado*tamanhoLado);
    }
}
