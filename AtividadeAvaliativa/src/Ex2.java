/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
        
		double salario;
		int funcionarios;
		double media;
		double soma = 0.0;
		
	 System.out.println("informe a grade de funcionario:");
	 funcionarios = Scanner.nextInt();
	 
     for(int i = 0; i <funcionarios;i++){ 
    	 System.out.println("informe o salario dos funcionarios:");
    	 salario = Scanner.nextInt();
    	 soma += salario;
     }
      media= soma/funcionarios;
      
 	 System.out.println("A media salario salarial dos funcionarios é R$" + media);

	}

}
