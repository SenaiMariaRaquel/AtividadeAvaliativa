/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
		double SomadosSalarios = 0;
		
		System.out.println("Digite a grade de funcionários: ");
		int funcionarios = scanner.nextInt();
		
		for(int i = 0 ; i < funcionarios ; i++) {
			System.out.println("Digite um salário: ");
			double salario = scanner.nextDouble();	
            
			SomadosSalarios = SomadosSalarios + salario;
	        }
		System.out.println("Média salarial: " + SomadosSalarios / funcionarios);

	}

}
