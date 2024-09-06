package segundaAula_ex5_08_30;

public class Main {
    
    public static void main(String[] args){
     
    Tamagoshi armandinho = new Tamagoshi( "Armandinho", 3, 3, 1);

    System.out.println("Informações Iniciais:");
    armandinho.infos();

    armandinho.alterarNome("O Terror");
    armandinho.setFome(1);
    armandinho.setSaude(1);
    armandinho.setIdade(98);

    System.out.println("Informações Atuais:");
    armandinho.infos();

    }
}
