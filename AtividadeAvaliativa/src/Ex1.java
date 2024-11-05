/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 *//*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 *///em java

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       
        int n = 10;
        
    
        double[] alturas = new double[n];
        String[] sexos = new String[n];
        
        
        Scanner scanner = new Scanner(System.in);
        

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
            alturas[i] = scanner.nextDouble();
            
            System.out.print("Digite o sexo da " + (i + 1) + "ª pessoa (M/F): ");
            sexos[i] = scanner.next();
        }

      
        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

      
        double somaHomens = 0;
        int contHomens = 0;

        for (int i = 0; i < n; i++) {
            if (sexos[i].equalsIgnoreCase("M")) {
                somaHomens += alturas[i];
                contHomens++;
            }
        }
        double mediaHomens = contHomens > 0 ? somaHomens / contHomens : 0;

        // c) Contar o número de mulheres
        int numMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i].equalsIgnoreCase("F")) {
                numMulheres++;
            }
        }
        scanner.close();
        
        System.out.println("\nResultados:");
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaHomens);
        System.out.println("Número de mulheres: " + numMulheres);

        
    }
}
