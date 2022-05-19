//Verifica o número da CNH de um motorista, o número de multas que ela possui e o valor de cada multa.
//Soma o o valor total de multas nela e imprime esse valor, junto com o número da CNH.
//Da a opção para o usuario de informar outras CNH, também pedindo a quantidade de multas e o valor de cada uma.
//Ao final do algoritmo, mostra o valor total arrecadado em multas pelo Detran, bem como o número e a quantidade
//de multas da CNH com o maior numero de multas registrada.

package Lista6Loops;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int cnh = 0;
		int cnhMaior = 0;
		int numMultas;
		int maiorNumMultas = 0;
		double valorMultas = 0;
		double totalArrecadado = 0;;
		double totalMultas = 0;
		int j = 0;
		int opcao;
		
		do {
			j = 0;
			totalMultas = 0;
			System.out.println("Informe o número da cnh: ");
			cnh = read.nextInt();
			System.out.println("Informe o número de multas nessa cnh: ");
			numMultas = read.nextInt();
			if (numMultas > maiorNumMultas) {
				maiorNumMultas = numMultas;
				cnhMaior = cnh;
			}
			do {
				System.out.println("Informe o valor das multas: ");
				valorMultas = read.nextDouble();
				totalMultas += valorMultas;
				totalArrecadado += valorMultas;
				j++;
			}while (j < numMultas);
			System.out.println("O valor da dívida da cnh " +cnh+ " é de R$" +totalMultas+ ".");
			System.out.println("\nDeseja informar outra cnh?");
			System.out.println("1 - Sim.");
			System.out.println("2 - Não.");
			opcao = read.nextInt();
			if (opcao > 2) {
				System.out.println("Opção inválida! Escolha uma das opções abaixo.");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
			}
		}while (opcao == 1);
		
		System.out.println("O valor total arrecadado pelo Detran em multas é de R$" +totalArrecadado+ ".");
		System.out.println("A cnh " +cnhMaior+ " possui o maior número de multas, com um total de " +maiorNumMultas+ ".");
		
		read.close();
		
	}

}
