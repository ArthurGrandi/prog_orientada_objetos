package segundaAula_ex5_08_30;

public class Tamagoshi {
    
    //Atributos
    private String nome;
    private double fome;
    private double saude;
    private int idade;

    //Construtores
    public Tamagoshi(String nome, double fome, double saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    //Métodos
    public String getNome() {
        return nome;
    }
    public void alterarNome(String nome) {
        this.nome = nome;
    }
    public double getFome() {
        return fome;
    }
    public void setFome(double fome) {
        System.out.println("Níveis de Fome: 0 = Faminto, 1 = Saciado, 2 = Satisfeito");
        this.fome = fome;
    }
    public double getSaude() {
        return saude;
    }
    public void setSaude(double saude) {
        System.out.println("Níveis de Saúde: 0 = Fraco, 1 = Saudavel, 2 = Forte");
        this.saude = saude;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String humor() {
        double calcHumor = (saude + fome) / 2;
        String humor;

        if (calcHumor == 3){
            humor = "Feliz";
        }
        else if (calcHumor >= 2 && calcHumor < 3){
            humor = "Normal";
        }
        else {
            humor = "triste";
        }

        return humor;
    }

    public void infos() {
        System.out.println("Nome do Tamagoshi " + this.nome);
        System.out.println("Fome do Tamagoshi " + this.fome);
        System.out.println("Saude do Tamagoshi " + this.saude);
        System.out.println("Idade do Tamagoshi " + this.idade);
        System.out.println("O humor dele está: " + humor());
    }

    @Override
    public String toString() {
        return "Tamagoshi [nome=" + nome + ", fome=" + fome + ", saude=" + saude + ", idade=" + idade + "]";
    }
}
