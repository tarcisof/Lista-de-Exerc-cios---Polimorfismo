package br.uft.edu.exercicios;

public abstract class Pessoa {
	private String nome;
	private int idade;
	
	public abstract void imprimeNome();
	public abstract void imprimeIdade();
	public abstract void imprimeDocumento();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}