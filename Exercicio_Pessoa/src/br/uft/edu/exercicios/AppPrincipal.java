package br.uft.edu.exercicios;

public class AppPrincipal {
	public static void main(String[] args) {
		PessoaFisica person = new PessoaFisica();
		person.setIdade(20);
		person.setNome("Tarciso");
		person.setCpf(012345);
		
		
		PessoaJuridica person2 = new PessoaJuridica();
		person2.setIdade(25);
		person2.setNome("Vasco da Gama");
		person2.setCnpj(123412);
		
		
		System.out.println("----------------------------");
		System.out.println("Para pessoa fisica: ");
		person.imprimeNome();
		person.imprimeIdade();
		person.imprimeDocumento();

		System.out.println("-----------------------------");
		System.out.println("Para pessoa juridica");
		person2.imprimeNome();
		person2.imprimeIdade();
		person2.imprimeDocumento();

	}
}