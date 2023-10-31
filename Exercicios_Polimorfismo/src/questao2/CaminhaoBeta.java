package questao2;

import java.util.ArrayList;
import java.util.List;

public class CaminhaoBeta extends Caminhao{
	private double cargaAtual;
	private List<Pluviometro> pluviometrosNoCaminhao;

	public CaminhaoBeta(int quantidade, double cargaAtual) {
		super(quantidade);
		this.cargaAtual = 0.0;
		this.pluviometrosNoCaminhao = new ArrayList<>();
	}
	
	@Override
    public void inserePluviometro(Pluviometro pluviometro) {
		if (!pluviometrosNoCaminhao.contains(pluviometro)) {
			cargaAtual += pluviometro.getPeso();
            pluviometrosNoCaminhao.add(pluviometro);
            System.out.println("Pluvi�metro " + pluviometro.getTipo() + " inserido no Caminh�o.");
        } else {
        	System.out.println("N�o � poss�vel inserir o mesmo tipo de pluvi�metro no Caminh�o.");
        }
     }
	
    public double getCargaAtual() {
        return cargaAtual;
    }
}
