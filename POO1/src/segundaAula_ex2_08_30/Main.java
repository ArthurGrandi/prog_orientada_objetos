package segundaAula_ex2_08_30;

public class Main {
    public static void main(String[] args){
        
        Quadrado arthur = new Quadrado(5);

        System.out.println("Os lados do meu quadrado tem " + arthur.retornarValorLado() + " cm!");

        System.out.println("Meu quadrado comeu muito e aumentou agora ele tem " + arthur.mudarValorLado() + " cm de lado!");

        System.out.println("O quadrado foi na nutricionista e ela mediu a área do quadrado. Ela descobriu que ele tem " + arthur.calcularArea() + " cm de área!");
    }
}
