package Lista6Loops;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double numCarteira, numMultas, valorMultas, totalArrecadacao;
		double totalMultas = 0;
		boolean validacao = false;
		
		System.out.println("Insira o numero da carteira de motorista: ");
		numCarteira = read.nextDouble();
		System.out.println("Insira o numero de multas desse motorista: ");
		numMultas = read.nextDouble();
		
		for (int i = 0 ; i < numMultas ; i++) {
			System.out.println("Insira o valor da multa: ");
			valorMultas = read.nextDouble();
			totalMultas += valorMultas;
		}
		
		
		
		
		
		read.close();
		
	}

}
