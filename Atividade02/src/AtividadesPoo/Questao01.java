//Faça um programa usando Linguagem Java, que receba dois números inteiros 
//e ao final imprima a soma deles.

package AtividadesPoo;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}

