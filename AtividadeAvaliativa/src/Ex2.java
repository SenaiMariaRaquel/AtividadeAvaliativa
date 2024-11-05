/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Informe a grade de funcionários: ");
		int grade_func = input.nextInt();
		double salarios = 0;
		
		for(int i = 1; i <= grade_func; i++) {
		System.out.println("Informe os salários: ");
		salarios += input.nextDouble();
		
			}
		double media_salarial = salarios / grade_func ;
		System.out.println("Media salárial: " + media_salarial);
		
		input.close();
	}

}