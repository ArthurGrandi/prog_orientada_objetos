package segundaAula_ex6_08_30;

public class POSTO {

    public enum TipoComb {
        COMUM(6.15),
        ADITIVADA(7.80),
        PODIUM(10.0);

        private double valorLitro;

        TipoComb(double valorLitro) {
            this.valorLitro = valorLitro;
        }

        public double getValorLitro() {
            return valorLitro;
        }

        public void setValorLitro(double valorLitro) {
            this.valorLitro = valorLitro;
        }
    }

    private TipoComb combustivel;
    private double quantiComb;

    // Construtor
    public POSTO(TipoComb combustivel, double quantiComb) {
        this.combustivel = combustivel;
        this.quantiComb = quantiComb;
    }

    public TipoComb getCombustivel() {
        return combustivel;
    }

    public double getQuantiComb() {
        return quantiComb;
    }

    public void setCombustivel(TipoComb combustivel) {
        this.combustivel = combustivel;
    }

    public void setQuantiComb(double quantiComb) {
        this.quantiComb = quantiComb;
    }

    public void abastValor(double dinheiro) {
        double litros = dinheiro / this.combustivel.getValorLitro();

        if (litros > this.quantiComb) {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
            litros = this.quantiComb;
        }

        this.quantiComb -= litros;
        System.out.println("Foi abastecido " + litros + " litros de gasolina " + combustivel + ".");
    }

    public double abastecerPorLitro(double litros) {
        if (litros > this.quantiComb) {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
            return 0;
        }

        double valorTotal = this.combustivel.getValorLitro() * litros;
        this.quantiComb -= litros;
        System.out.println("Valor a ser pago: R$ " + valorTotal);
        return valorTotal;
    }

    public void alterarValor(double novoValor) {
        this.combustivel.setValorLitro(novoValor);
        System.out.println("Valor do litro alterado para R$ " + novoValor);
    }

    public void alterarComb(TipoComb novoCombustivel) {
        this.combustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarCombNaBomb(double novaQuantidade) {
        this.quantiComb = novaQuantidade;
        System.out.println("Quantidade de combustível na bomba alterada para: " + novaQuantidade + " litros");
    }
}