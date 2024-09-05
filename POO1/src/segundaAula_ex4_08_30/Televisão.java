package segundaAula_ex4_08_30;

public class Televisão {

	// Atributos
    private int canal, volume;

	// Construtores
	public Televisão(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public Televisão() {
		
	}

	// Métodos
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		if(volume == 0){
			System.out.println("Não é possivel diminuir o volume abaixo de 0!");
		}

		if (volume == 99){
			System.out.println("Não é possivel aumentar o volume acima de 99!");
		}
	}

	@Override
	public String toString() {
		return "Televisão [canal=" + canal + ", volume=" + volume + "]";
	}
}
