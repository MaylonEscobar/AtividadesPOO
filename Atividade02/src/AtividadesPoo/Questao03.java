//Faça um programa usando Linguagem Java, que imprima a média aritmética de três 
//números. Ao final, o programa deve imprimir os resultados dos cálculos.

package AtividadesPoo;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}





