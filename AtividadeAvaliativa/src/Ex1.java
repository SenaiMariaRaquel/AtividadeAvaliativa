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
		int cont_M = 0;
		double media = 0;
		double cont_Maior = 0;
		double cont_Menor = 0;
		double maior = 0;
		double menor = 1.50;

		
		for (int i = 1 ; i < 10 ; i++) {
			
			System.out.print("Digite seu Sexo, responda com M para Masculino e F para Feminino: ");
			String sexo = scanner.nextLine();
			
			System.out.print("Digite sua Altura: ");
			int altura = scanner.nextInt();
			
			if(altura > maior) {
				cont_Maior ++;
			}
			else if(altura < menor) {
				cont_Menor ++;
			}
			
			
			if (sexo == "F" && sexo == "f") {
				cont_F ++;
			}
			else if(sexo == "M") {
				cont_M ++;
				
			 media = (cont_M/altura)*cont_M;
			}
			
			
			
		}
		
		System.out.println("A quantidade de mulheres é : " + cont_F);
		System.out.println("A altura Media dos homens é: " + media);
		System.out.println("A maior altura é : " + cont_Maior);
		System.out.println("A maior altura é : " + cont_Menor);
		
	}
}