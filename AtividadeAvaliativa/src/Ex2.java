/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double somaSalario = 0.0;
		
		System.out.print("Digite a grade de funcionários: ");
		int grade = sc.nextInt();
		
		for(int i = 1; i <= grade; i++) {
			System.out.print("Digite o salário do " + i + "º funcionário: ");
			double salario = sc.nextDouble();
			
			somaSalario += salario;
		}
		System.out.printf("\nA média salárial dos funcionários: %.2f", somaSalario/grade);
		
		sc.close();
	}

}
