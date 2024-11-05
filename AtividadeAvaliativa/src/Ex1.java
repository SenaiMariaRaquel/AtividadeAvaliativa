/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorAltura = 0;
        double menorAltura = 0;
        double somaAlturaHomens = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.next(); // Lê o sexo como String

            // Inicializando a maior e menor altura com a altura da primeira pessoa
            if (i == 0) {
                maiorAltura = altura;
                menorAltura = altura;
            }

            // Encontrar a maior e a menor altura
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
            // Calcular soma de alturas e contar o número de homens e mulheres
            if (sexo.equals("M")) {
                somaAlturaHomens += altura;
                numeroHomens++;
            } else if (sexo.equals("F")) {
                numeroMulheres++;
            } else {
                System.out.println("Sexo inválido. Use apenas 'M' ou 'F'.");
                i--; // Decrementa para repetir a entrada dessa pessoa
            }
        }
        
        scanner.close();
        
        double mediaAlturaHomens = numeroHomens > 0 ? somaAlturaHomens / numeroHomens : 0;
        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);
    }
}


