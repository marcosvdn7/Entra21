//Le a quantidade de CDs digitada pelo usu�rio e o valor de cada CD, e imprime o valor total da cole��o
//e o valor m�dio dos CDs.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtdCds;
		double total = 0;
		double valorCd, valorMedio;
		
		System.out.println("Informe a quantidade de CDs em sua cole��o: ");
		qtdCds = read.nextInt();
		
		for (int i = 0; i < qtdCds; i++) {
			System.out.println("Informe o valor do CD: ");
			valorCd = read.nextDouble();
			total += valorCd;
		}
		
		valorMedio = total / qtdCds;
		System.out.println("\nO valor total da sua cole��o de CDs � R$" +total);
		System.out.println("O valor m�dio de cada CD em sua cole��o � de R$" +valorMedio);
		
		read.close();

	}

}
