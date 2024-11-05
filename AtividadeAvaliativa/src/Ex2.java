/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		double sala, media = 0;
		
		System.out.print("Digite a quantidade de funcionários: ");
		int fun = sca.nextInt();
		
		for(int i = 1; i <= fun; i++) {
			System.out.println("Digite o salário do "+i+"º funcionário: ");
			sala = sca.nextDouble();
			
			media = (sala+sala)/fun;
		}
		System.out.println("A media de salário é: "+media);
	}

}