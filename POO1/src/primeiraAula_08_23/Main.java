package primeiraAula_08_23;

public class Main {
    public static void main(String[] args) throws Exception {
        Veiculos minivan = new Veiculos(7,80,9);

        Veiculos sportcar = new Veiculos(2,9,35);

        System.out.print("Minivan pode transportar " + minivan.getPassageiros() + " passageiros ");

        System.out.println("com uma autonomia de " + minivan.calcularConsumo() + " quilômetros");

        System.out.print("Carro esporte pode transportar " + sportcar.getPassageiros() + " passageiros ");

        System.out.println("com uma autonomia de " + sportcar.calcularConsumo() + " quilômetros");
    }
}