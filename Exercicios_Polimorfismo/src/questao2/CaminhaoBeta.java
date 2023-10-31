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
            System.out.println("Pluviômetro " + pluviometro.getTipo() + " inserido no Caminhão.");
        } else {
        	System.out.println("Não é possível inserir o mesmo tipo de pluviômetro no Caminhão.");
        }
     }
	
    public double getCargaAtual() {
        return cargaAtual;
    }
}
