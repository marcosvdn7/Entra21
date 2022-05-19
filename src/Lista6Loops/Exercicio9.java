//Verifica se o número digitado é primo.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		int i = 1;
		int count = 0;
		
		System.out.println("Digite um número inteiro positivo: ");
		num = read.nextDouble();
		
		do {
			if (num <= 0 || num % 1 != 0) {
				System.out.println("\nO número digitado deve ser um inteiro maior que 0.");
				System.out.println("Digite um novo número: ");
				num = read.nextDouble();
			}
		} while (num <= 0 || num % 1 != 0);
		
		do {
			if (num % i == 0) {
				count++;
			}
			i++;
		} while (i <= num);
		if (count > 2) {
			System.out.println((int)num+ " não é um número primo.");
		} else if (num == 1) {
			System.out.println((int)num+ " não é um número primo.");
		} else {
			System.out.println((int)num+ " é um número primo.");
		}
		read.close();
	} 
			
}
		



