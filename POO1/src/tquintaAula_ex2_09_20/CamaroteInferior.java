package tquintaAula_ex2_09_20;

// Classe CamaroteInferior que herda de VIP
class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do Camarote Inferior: " + localizacao);
    }
}
