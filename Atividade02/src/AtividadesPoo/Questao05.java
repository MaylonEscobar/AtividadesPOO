//Faça um programa usando Linguagem Java, que leia o nome o endereço e o telefone 
//de um cliente e ao final, imprima esses dados.

package AtividadesPoo;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        System.out.println("\nDados do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);

        scanner.close();
        
    }
}




