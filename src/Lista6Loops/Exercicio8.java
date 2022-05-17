package Lista6Loops;
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double limiteInf, limiteSup;
		double soma = 0;
		System.out.println("Digite o limite inferior: ");
		limiteInf = read.nextDouble();
		System.out.println("Digite o limite superior: ");
		limiteSup = read.nextDouble();
		
		for (double i = limiteInf ; i < limiteSup ; i++) {
			if (limiteInf > limiteSup) {
				System.out.println("O limite inferior deve ser menor que o limite superior.");
			} else if (i % 2 == 0) {
				System.out.print((int)i+ " ");
				soma += i;
			}
		}
		System.out.println("\nA soma dos números pares encontrados no intervalo entre os números digitados é " +soma+ ".");
		
		read.close();

	}

}
