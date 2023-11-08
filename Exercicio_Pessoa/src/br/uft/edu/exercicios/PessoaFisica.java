package br.uft.edu.exercicios;

public class PessoaFisica extends Pessoa{
	private int cpf;
	
	@Override
	public void imprimeNome() {
		System.out.println(this.getNome());
	}

	@Override
	public void imprimeIdade() {
		System.out.println(this.getIdade());
	}

	@Override
	public void imprimeDocumento() {
		System.out.println(this.getCpf());
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}