package questao3;
import java.util.Scanner;

public abstract class Controle {
    private static Scanner scanner = new Scanner(System.in);

    public static String leString() {
        String entrada = scanner.nextLine();
        return entrada;
    }

    public static int leInteiro() {
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
