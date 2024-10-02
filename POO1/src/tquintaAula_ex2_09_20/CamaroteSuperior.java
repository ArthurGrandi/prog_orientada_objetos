package tquintaAula_ex2_09_20;

// Classe CamaroteSuperior que herda de VIP
class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    @Override
    public double getValorVIP() {
        return super.getValorVIP(); // Aqui, se necessário, pode adicionar um valor adicional para o Camarote Superior
    }
}
