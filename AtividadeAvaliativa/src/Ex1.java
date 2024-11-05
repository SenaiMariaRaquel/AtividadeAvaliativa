/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		float maior = -9999, menor = 9999, altura;
		double media_mas = 0, cont = 0;
		String sexo;
		int num_mulheres = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a altura da pessoa: ");
			altura = scanner.nextFloat();
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}

			scanner.nextLine();
			System.out.print("Digite a o sexo (Femino ou Masculino): ");
			sexo = scanner.nextLine();

			if (sexo.equalsIgnoreCase("Feminino")) {
				num_mulheres++;
			} else if (sexo.equalsIgnoreCase("Masculino")) {
				media_mas = media_mas + altura;
				cont++;

			}
		}
		System.out.print("\nMaior altura do grupo: " + maior);
		System.out.print("\nMenor altura do grupo: " + menor);

	}
}




	
