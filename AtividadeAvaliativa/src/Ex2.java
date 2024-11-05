/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		double salario;
		int funcionarios; 
		double media;
		double soma = 0;
		
		System.out.println("Qual a grade de funcionários: ");
		funcionarios = scanner.nextInt();
		
		 for(int i=0; i<funcionarios; i++) {
		System.out.println("Informe o valor de seu salario: ");
		 salario = scanner.nextDouble();
		 
		soma+= salario;
		}
		 media= soma/funcionarios;
		  
		System.out.print("A media salarial é de: "+ media);
	}
	 
}
