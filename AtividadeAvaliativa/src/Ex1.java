/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		double maioraltura = 0.0;
		double menoraltura = 9999;
		double somah = 0.0;
		double somam = 0.0;
		int numhomens = 0;
		int nummulheres = 0;
		double altura;
		char sexo;
		double media = 0;

		for (int i = 1; i <= 2; i++) {
			System.out.println("Digite a altura da pessoa " + i + ":");
			altura = Scanner.nextDouble();

			System.out.println("Digite o sexo da pessoa:" + i + ":");
			sexo = Scanner.next().charAt(0);

			if (altura > maioraltura) {
				maioraltura = altura;
			}else if (altura < menoraltura) {
				menoraltura = altura;
			}
			
				if (sexo == 'M'|| sexo == 'm') {
					somah += altura;
					numhomens++;
				}

				else if (sexo == 'F'|| sexo == 'F') {
					nummulheres++;
				}

				media = somah / numhomens;

			}

		
		System.out.println("Maior altura: " + maioraltura);
		System.out.println("Menor altura: " + menoraltura);
		System.out.println("Media altura dos homens: " + media);
		System.out.println("Numero de mulheres: " + nummulheres);
	}

}
