package segundaAula_08_30;

public class Bola {

    // Atributos
    private String cor; 
    private String material;
    private double circunferencia;

    // Construtor
    public Bola(String cor, String material, double circunferencia){
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }

    // Métodos
    public String trocaCor() {
        return (this.cor = "Vermelha");
    }

    public String mostraCor() {
        return this.cor;
    }
}