//Faça um programa usando Linguagem Java, que leia a base e a altura de um retângulo 
//e imprima o perímetro (base + altura) e a área (base * altura).
//
package AtividadesPoo;
import java.util.Scanner;

public class Questao07 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("\nPerímetro do retângulo: " + perimetro);
        System.out.println("Área do retângulo: " + area);

        scanner.close();
    }
}





