//Le a quantidade de CDs digitada pelo usuário e o valor de cada CD, e imprime o valor total da coleção
//e o valor médio dos CDs.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtdCds;
		double total = 0;
		double valorCd, valorMedio;
		
		System.out.println("Informe a quantidade de CDs em sua coleção: ");
		qtdCds = read.nextInt();
		
		for (int i = 0; i < qtdCds; i++) {
			System.out.println("Informe o valor do CD: ");
			valorCd = read.nextDouble();
			total += valorCd;
		}
		
		valorMedio = total / qtdCds;
		System.out.println("\nO valor total da sua coleção de CDs é R$" +total);
		System.out.println("O valor médio de cada CD em sua coleção é de R$" +valorMedio);
		
		read.close();

	}

}
