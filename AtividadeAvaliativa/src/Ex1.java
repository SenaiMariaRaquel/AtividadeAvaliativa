/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double maior = 0.0, menor = 99999, mediaM = 0.0, menorA = 0.0, maiorA = 0.0;
		
		int quantF = 0, quantM = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print("Informe o sexo da pessoa, M para masculino ou F para feminino: ");
			String sexo = sc.next();
			
			
			System.out.print("Informe a altura da pessoa: ");
			double altura = sc.nextDouble();
			
			if(altura < menor) {
				menor = altura;
			}
			if(altura > maior) {
				maior = altura;
			}	
			
			if(sexo.equalsIgnoreCase("M")) {
				mediaM += altura;
				quantM++;
			}
			if(sexo.equalsIgnoreCase("F")) {
				quantF++;
			}
		}
		System.out.println("A maior altura do grupo é " + maior + "\nA maior altura do grupo é " + menor);
		System.out.printf("Média de altura dos homens: %.2f", mediaM/quantM);
		System.out.println("\nQuantidade de mulheres: " + quantF);

		sc.close();
	}

}
