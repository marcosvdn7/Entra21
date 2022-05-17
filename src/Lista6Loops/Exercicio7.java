package Lista6Loops;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		boolean validacao = false;
		int qtdNum = 0;
		
		
		do {
			System.out.println("Digite um número (0 para encerrar): ");
			num = read.nextDouble();
			if (num >= 100 && num <= 200) {
				qtdNum++;
			} else if (num == 0) {
				validacao = true;
				break;
			}
		}while(!validacao);
		
		System.out.println("A quantidade de numeros entre 100 e 200 digitadas foram " +qtdNum+ ".");
		

		read.close();

	}

}
