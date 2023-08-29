//Faça um programa usando Linguagem Java, que leia o saldo de uma conta poupança e imprima o novo saldo, 
//considerando um reajuste de 2%. Pesquise como realizar esse cálculo.

package AtividadesPoo;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta poupança: ");
        double saldo = scanner.nextDouble();

        double novoSaldo = saldo * 1.02; // Aumento de 2%

        System.out.println("\nNovo saldo após o reajuste de 2%: " + novoSaldo);

        scanner.close();
    }
}



