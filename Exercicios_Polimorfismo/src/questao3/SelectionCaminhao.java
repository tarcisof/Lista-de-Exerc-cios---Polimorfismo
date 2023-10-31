package questao3;

import java.util.ArrayList;
import java.util.List;

public class SelectionCaminhao extends Controle {
    public void caminhaoApto() {
       
        int maiorCapacidade = 0;
        String tipoDoMaior = null;
        List<String> tiposDoMaior = new ArrayList<>();

        System.out.println("Tipo do caminhão: ");
        String tipoCaminhao = leString();

        while (!tipoCaminhao.equals("Fim")) {
            int capacidadeTotal = 0;
            List<String> tipos = new ArrayList<>();

            System.out.println("Número de pluviômetros: ");
            int numPluv = leInteiro();

            for (int i = 0; i < numPluv; i++) {
                System.out.println("Tipo dos pluviômetros: ");
                String tipoPluviometro = leString();
                tipos.add(tipoPluviometro);

                if (tipoPluviometro.equals("Tipo1")) {
                    capacidadeTotal += 1000;
                } else {
                    capacidadeTotal += 2000;
                }
            }

            if (capacidadeTotal > maiorCapacidade) {
                maiorCapacidade = capacidadeTotal;
                tipoDoMaior = tipoCaminhao;
                tiposDoMaior = new ArrayList<>(tipos);
            }

            System.out.println("----------------------------------------------");
            System.out.println("\nTipo do caminhão: ");
            tipoCaminhao = leString();
        }

        System.out.println("\t\nCAMINHÃO MAIS APTO");
        System.out.println("Tipo do maior caminhão: " + tipoDoMaior);
        System.out.println("Lista dos pluviômetros: " + tiposDoMaior);
    }

    public static void main(String[] args) {
        SelectionCaminhao algum = new SelectionCaminhao();
        algum.caminhaoApto();
    }
}
