/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;
public class Ex2 {

	
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);

				double salarios, media = 0, media_final = 0;
				int cont = 0;

				System.out.print("Quantos funcionários há na empresa: ");
				int quant_fun = sc.nextInt();

				System.out.println();
				for (int i = 1; i <= quant_fun; i++) {
					System.out.print("Digite o salário do funcionário " + i + ": ");
					salarios = sc.nextDouble();
					if (salarios > 0) {
						media = media + salarios;
						cont++;
					} else {
						System.out.println("Dados inválidos.");
						i--;
					}
				}
				media_final = media / cont;
				System.out.printf("A média salarial da empresa é de: R$%.2f", media_final);


			}

		}



	


