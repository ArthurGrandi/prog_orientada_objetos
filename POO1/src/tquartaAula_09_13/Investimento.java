package tquartaAula_09_13;

import java.util.Calendar;

public class Investimento extends Corrente {
    private final int diainvestimento;
    private final int periodo;

    public Investimento(int num, double sal, int dinv, int per) {
        super(num, sal);
        this.diainvestimento = dinv;
        this.periodo = per;
    }

    public void atualizarSaldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia atual: " + dia);

        if (dia == (this.diainvestimento + periodo)) {
            super.setSaldo(super.getSaldo() * 1.20);
        } else {
            System.out.println("Ainda não é dia do investimento");
        }
    }
}
