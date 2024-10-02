package tquintaAula_ex2_09_20;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50);
        ingressoNormal.imprimeValor();
        ((Normal) ingressoNormal).imprimeTipo();

        VIP ingressoVIP = new VIP(100, 50);
        ingressoVIP.imprimeValor();
        System.out.println("Valor do Ingresso VIP: R$ " + ingressoVIP.getValorVIP());

        CamaroteInferior camaroteInferior = new CamaroteInferior(150, 30, "Primeira fila");
        camaroteInferior.imprimeLocalizacao();
        System.out.println("Valor do Camarote Inferior: R$ " + camaroteInferior.getValorVIP());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200, 50);
        System.out.println("Valor do Camarote Superior: R$ " + camaroteSuperior.getValorVIP());
    }
}
