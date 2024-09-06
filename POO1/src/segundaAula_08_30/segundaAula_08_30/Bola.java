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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

}