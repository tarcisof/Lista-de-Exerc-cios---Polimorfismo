package questao2;

public class Pluviometro {
	protected String tipo;
	private int peso;
	private int capacidade; 

	
	public Pluviometro (String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
}
