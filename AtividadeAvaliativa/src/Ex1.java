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
    
    double altura;
    String sexo; 
    double maior;
    double media_M;
   double media_F;
   
    for(int i=0; i>10; i++) {
    	System.out.print("Informe sua altura: ");
    	altura = scanner.nextDouble();
    	System.out.print("Informe seu sexto (M e F):");
    	 sexo = scanner.nextLine();
    if  (altura> i) {
    	altura ++ ;
    }
    
    System.out.print("A maior altura de 10 pessoas é:"+ altura++);
  

    }     
    }
    }
