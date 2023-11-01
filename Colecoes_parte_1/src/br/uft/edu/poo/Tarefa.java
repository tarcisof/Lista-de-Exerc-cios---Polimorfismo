package br.uft.edu.poo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Tarefa {
	public static void main(String[] args) {
		System.out.println("Rodando o programa");
		tarefa();
	}


	public static void tarefa() {
		List<String> lista = new ArrayList<>();
		lista.add("Tarciso Filho");
		lista.add("Wosley Arruda");
		lista.add("Iago");
		lista.add("Daniel");
		
		Collections.sort(lista);
		System.out.println(lista);
	}
	
}