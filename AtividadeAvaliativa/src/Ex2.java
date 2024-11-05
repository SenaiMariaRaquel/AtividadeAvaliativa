/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeFuncionarios;
        double salario, somaSalarios = 0.0;

        System.out.print("Digite a quantidade de funcionários: ");
        quantidadeDeFuncionarios = scanner.nextInt();
   
        for (int i = 0; i < quantidadeDeFuncionarios; i++) {
            scanner.nextLine();
            
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salario = scanner.nextDouble();

            somaSalarios += salario;
 }
        
        double mediaSalarial = somaSalarios / quantidadeDeFuncionarios;

        System.out.println("\nMédia salarial dos funcionários: R$" + mediaSalarial);

        scanner.close(); 
    }
}


