/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int contM = 0,contF = 0, maior = 0, menor = 999;
		int[]  h = new int[10];
		String gen;
		double mediaf = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o gênero da "+i+"º pessoa: ");
			gen = sca.nextLine();
			if(!gen.equalsIgnoreCase("M") && !gen.equalsIgnoreCase("F")) {
				System.out.println("Gênero inválido!");
				return;
			}
			else if(gen.equalsIgnoreCase("M")) {
						contM+=1;
					}
					else if(gen.equalsIgnoreCase("F")) {
						contF+=1;
			}
			
			
			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite a altura da "+i+"º pessoa: ");
			h[i] = sca.nextInt();
			
			int media = contM;
			
			if(h[i] <= menor) {
				menor = h[i];
			}
			if(h[i] >= maior) {
				maior = h[i];
			}
			
			mediaf = h[i]/media;
		}
		System.out.println("A maior pessoa é: "+maior+" a menor pessoa é: "+menor);
		System.out.println("A quantidade de mulheres é: "+contF);
		System.out.println("A média da altura dos homens é: "+mediaf);
		sca.close();
	}
	}
