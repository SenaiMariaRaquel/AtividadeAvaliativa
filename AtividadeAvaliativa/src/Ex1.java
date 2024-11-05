/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) 
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double[] altura = new double[10];
        String[] sexo = new String[10];

        double maior_altura = 0;
        double menor_altura = 0;
        int quantidadeFeminino = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite sua altura: ");
            altura[i] = input.nextDouble();

            System.out.print("Digite seu sexo (M/F): ");
            sexo[i] = input.next();

            if (altura[i] > maior_altura) {
            	maior_altura = altura[i];
            }
            if (altura[i] < menor_altura) {
            	menor_altura = altura[i];
            }

            if (sexo[i].equalsIgnoreCase("F")) {
                quantidadeFeminino++;
            }
        }
        
        double media_altura = altura[0] / 10;

        System.out.println("Maior altura: " + maior_altura);
        System.out.println("Menor altura: " + menor_altura);
        System.out.println("Media altura: " + media_altura);
        System.out.println("Quantidade de pessoas do sexo feminino: " + quantidadeFeminino);
        
        input.close();
    }
}
