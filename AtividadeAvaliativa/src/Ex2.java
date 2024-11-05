/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite a grade de funcionarios: ");
	        int gradeFuncionarios = scanner.nextInt();


	        double[] salarios = new double[gradeFuncionarios];
	        double somaSalarios = 0.0;
	        
	        
	        for (int i = 0; i < gradeFuncionarios; i++) {
	            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
	            salarios[i] = scanner.nextDouble();
	            somaSalarios += salarios[i];
	        }   
	        
	        

	        double mediaSalarial = somaSalarios / gradeFuncionarios;
	     
	        System.out.printf("A média salarial da empresa é: %.2f\n", mediaSalarial);
	        
	        
	        scanner.close();
	}


}
