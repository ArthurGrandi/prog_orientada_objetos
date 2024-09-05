package segundaAula_ex4_08_30;

public class Main {

    public static void main(String[] args){
    Televisão televisão = new Televisão(10, 98);

    System.out.println(televisão);

    televisão.setVolume(100);

    System.out.println(televisão.getVolume());
    }
}
