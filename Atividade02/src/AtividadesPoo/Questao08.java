//Faça um programa usando Linguagem Java, que calcule o reajuste do salário de um 
//funcionário. Para isso, o programa deverá ler o salário atual do funcionário e ler o 
//percentual de reajuste. Ao final imprimir o valor do novo salário.

package AtividadesPoo;
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (em porcentagem): ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        System.out.println("\nNovo salário após o reajuste: " + novoSalario);

        scanner.close();
    }
}




