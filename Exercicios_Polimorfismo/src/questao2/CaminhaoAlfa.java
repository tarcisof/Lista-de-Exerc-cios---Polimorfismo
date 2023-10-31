package questao2;

public class CaminhaoAlfa extends Caminhao{
	
	private double cargaMax;
	private double cargaAtual;

	public CaminhaoAlfa(int quantidade, double cargaMax, double cargaAtual) {
		super(quantidade);
		// TODO Auto-generated constructor stub
		this.cargaMax = 5.0;
		this.cargaAtual = 0.0;
	}
	@Override
	public void inserePluviometro(Pluviometro pluviometro) {
		if (cargaAtual + pluviometro.getPeso() <= cargaMax) {
			cargaAtual += pluviometro.getPeso();
			System.out.println("Pluvi�metro " + pluviometro.getTipo() + " inserido no caminh�o.");
		}else {
			System.out.println("N�o � poss�vel inserir o pluviometro no caminhao");
		}
	}
	
}
