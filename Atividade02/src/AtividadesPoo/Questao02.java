//Faça um programa usando Linguagem Java, que peça ao usuário 
//que digite dois números e mostre o produto deles.

package AtividadesPoo;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double produto = numero1 * numero2;
        System.out.println("O produto dos números é: " + produto);

        scanner.close();
    }
}




