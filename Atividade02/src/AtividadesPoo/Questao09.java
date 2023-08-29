package AtividadesPoo;
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus centígrados: ");
        double temperaturaC = scanner.nextDouble();

        double temperaturaF = ((9 * temperaturaC) + 160) / 5;

        System.out.println("\nA temperatura em Fahrenheit é: " + temperaturaF);

        scanner.close();
    }
}




