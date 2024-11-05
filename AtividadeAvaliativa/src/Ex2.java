/*Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 *///em java
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Digite o número de funcionários da empresa: ");
        int numFuncionarios = scanner.nextInt();
        
       
        double somaSalarios = 0;
        
       
        for (int i = 1; i <= numFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + i + ": ");
            double salario = scanner.nextDouble();
            somaSalarios += salario; 
        }
        
       
        double mediaSalarial = somaSalarios / numFuncionarios;
        
    
        System.out.printf("A média salarial da empresa é: %.2f\n", mediaSalarial);
        
   
        scanner.close();
    }
}
