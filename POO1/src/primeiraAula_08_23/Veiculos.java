package primeiraAula_08_23;
public class Veiculos {
    private int passageiros;

    private int combustivel; 

    private int consumo; 

    public Veiculos(int pass, int comb, int cons){
        this.passageiros = pass;
        this.combustivel = comb;
        this.consumo = cons;
        }
       
        public int calcularConsumo(){
        return (this.combustivel*this.consumo);
        }
       
        public int getPassageiros(){
        return this.passageiros;
        }
}
