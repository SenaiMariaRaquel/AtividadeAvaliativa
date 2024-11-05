/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorAltura = 0;
        double menorAltura = 0;
        double somaAlturaHomens = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            String sexo = scanner.next();

            if (i == 0) {
                maiorAltura = altura;
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
           
            if (sexo.equals("M")) {
                somaAlturaHomens += altura;
                numeroHomens++;
            } else if (sexo.equals("F")) {
                numeroMulheres++;
            } else {
                System.out.println("Sexo inválido. Use apenas 'M' ou 'F'.");
                i--;
            }
        }
        
        scanner.close();
        
        double mediaAlturaHomens = numeroHomens > 0 ? somaAlturaHomens / numeroHomens : 0;
        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numeroMulheres);
    }
}