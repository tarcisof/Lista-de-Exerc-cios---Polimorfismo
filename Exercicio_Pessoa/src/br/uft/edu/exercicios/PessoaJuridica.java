package br.uft.edu.exercicios;

public class PessoaJuridica extends Pessoa{
	private int cnpj;
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
		System.out.println(this.getCnpj());
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}