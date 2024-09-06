package segundaAula_ex3_08_30;

public class Main {
    public static void main(String[] args){

        Pessoa arthur = new Pessoa("Arthur", 23, 114.1, 1.75);

        Pessoa matheus = new Pessoa("Matheus", 14, 70, 1.75);

        System.out.println("x-----------------------x");

        System.out.println("Arthur esta indo na academia frequentemente, seu peso atual é: " + arthur.getEmagrecer() + " kg!");

        arthur.emagrecer();
        arthur.emagrecer();
        arthur.emagrecer();

        System.out.println("Arthur esta treinando a dois meses e ja emagreceu alguns quilos, seu peso atual é: " + arthur.getEmagrecer() + " kg!");

        System.out.println("x-----------------------x");

        System.out.println("Matheus esta quase de aniversario hoje ele tem " + matheus.getEvencelher() + " anos! e sua altura é " + matheus.getAltura() + " metros!");

        matheus.envelhecer();

        System.out.println("Chegou seu aniversário, agora ele tem: " + matheus.getEvencelher() + " anos!");

        System.out.println("Com seu aniversário matheus cresceu e agora ele tem: " + matheus.getAltura() + " metros!");

        System.out.println("x-----------------------x");
    }
}
