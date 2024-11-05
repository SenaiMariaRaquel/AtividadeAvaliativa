/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
//Desenvolvido por: Gabriel Fakelmann
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo;
		float maior = -9999, menor = 9999, altura;
		int num_mulheres = 0;
		double media_masc = 0, cont = 0, media_final;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite a altura: ");
			altura = sc.nextFloat();
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}

			sc.nextLine();
			System.out.println("Digite o sexo (Masculino ou Feminino): ");
			sexo = sc.nextLine();

			if (sexo.equalsIgnoreCase("Feminino")) {
				num_mulheres++;
			} else if (sexo.equalsIgnoreCase("Masculino")) {
				media_masc = media_masc + altura;
				cont++;
			}

		}
		media_final = media_masc / cont;
		System.out.println("Maior altura do grupo foi: " + maior);
		System.out.println("Menor altura do grupo foi: " + menor);
		System.out.printf("Media da altura dos homens foi de:%.2f%n ", media_final);
		System.out.printf("Numero de mulheres: " + num_mulheres);

		sc.close();

	}

}
