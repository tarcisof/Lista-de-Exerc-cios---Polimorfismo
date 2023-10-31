package questao1;

public interface Repositorio {

	void guarda(Pessoa nova);
	
	Pessoa recupera(String CPF);
	
	Pessoa primeiro();
	
	Pessoa proximo();

}
