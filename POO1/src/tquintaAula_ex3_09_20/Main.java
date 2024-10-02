package tquintaAula_ex3_09_20;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Administrativo assistenteAdmin = new Administrativo("Maria", "Rua A", "1234-5678", "maria@email.com", "A001", "dia", 50.0);
        Tecnico assistenteTecnico = new Tecnico("João", "Rua B", "8765-4321", "joao@email.com", "T001", 200.0);

        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: " + assistenteAdmin.getNome());
        System.out.println("Matrícula: " + assistenteAdmin.getMatricula());

        System.out.println("\nAssistente Técnico:");
        System.out.println("Nome: " + assistenteTecnico.getNome());
        System.out.println("Matrícula: " + assistenteTecnico.getMatricula());
    }
}

