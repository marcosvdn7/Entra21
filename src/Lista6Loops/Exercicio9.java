package Lista6Loops;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		int i = 0;
		boolean validacao = false;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		num = read.nextDouble();
		
		do {
			if (num <= 1) {
				System.out.println("N�o � um n�mero primo.");
				break;
			}
			i++;
			double resultado = num % i;
			if
		}while(i == 9);
		
	
		read.close();
	}

}
