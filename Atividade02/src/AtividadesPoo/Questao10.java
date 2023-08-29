//Faça um programa usando Linguagem Java, que calcule a quantidade de litros de 
//combustível consumidos em uma viagem, sabendo-se que o carro tem autonomia de 12 
//km por litro de combustível. O programa deverá ler o tempo decorrido na viagem e a 
//velocidade média e aplicar as fórmulas:
//D = T * V
//L = D/12
//Em que:
//• D = Distância percorrida em horas
//• T = Tempo decorrido
//• V = Velocidade média
//• L = Litros de combustível consumidos
//Ao final, o programa deverá imprimir a distância percorrida e a quantidade de litros 
//consumidos na viagem.

package AtividadesPoo;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo decorrido na viagem (em horas): ");
        double tempoHoras = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoHoras * velocidadeMedia;
        double litrosConsumidos = distancia / 18;

        System.out.println("\nDistância percorrida: " + distancia + " km");
        System.out.println("Litros de combustível consumidos: " + litrosConsumidos + " litros");

        scanner.close();
    }
}
