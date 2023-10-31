package questao1;

public class Utilitarios {
	
	void duplica(Repositorio A, Repositorio B) {
		Pessoa a = A.primeiro();
		while (a != null) {
			B.guarda(a);
			a = A.proximo();
		}
	}
	
	void diferenca(Repositorio A, Repositorio B, Repositorio C) {
	    Pessoa itrA = A.primeiro();

	    for (; itrA != null; itrA = A.proximo()) {
	        Pessoa itrB = B.primeiro();
	        boolean presenteEmBFlag = false;

	        for (; itrB != null; itrB = B.proximo()) {
	            if (itrA.equals(itrB)) {
	                presenteEmBFlag = true;
	                break; 
	            }
	        }

	        if (!presenteEmBFlag) {
	            C.guarda(itrA);
	        }
	    }
	}
}

