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
		
		int cont_F = 0;
		double cont_altura = 0;
		double maior = 0;
		double menor = 9999;
		

		for (int i = 0; i <= 10; i++) 
		{
			System.out.println("Digite F para FEMININO ou M para MASCULINO: ");
			String sexo = scanner.nextLine();

			
			System.out.println("Digite sua altura: ");
			double altura = scanner.nextDouble();
			
			if(sexo.equals("F"))
			{
				cont_F++;
			}
			
			if(sexo.equals("M"))
			{
				
				
			}
			
			
			
			
		}
           System.out.println("Número de mulheres: " + cont_F + "\n" + "média de altura dos homens: " + "\n" + "Maior de altura: " + "Menor de altura: ");
			
	}

}
