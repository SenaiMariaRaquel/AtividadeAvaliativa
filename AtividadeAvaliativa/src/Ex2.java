/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */
//Desenvolvido por: Gabriel Fakelmann
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double salario = 0, media = 0, media_final = 0;
		
		System.out.print("Há quantos funcionarios na empresa: ");
		int quant_funci = sc.nextInt();
		
		for(int i = 1; i <= quant_funci;i++) {
			System.out.print("Digite o salario do "+ (i)+ "° funcionário: ");
			salario = sc.nextDouble();
			if (salario > 0) {
				media = media + salario;
				cont++;
			}
			else {
				System.out.println("Dados Inválido");
				i--;
			}
				
			}
		media_final = media / cont;
		System.out.printf("A média salarial dos funcionários da empresa é R$:%.2f%n" , media_final );

		 sc.close();
	}

	}
