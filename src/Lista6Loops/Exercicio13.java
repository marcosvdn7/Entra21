//Verifica qual o maior n�mero digitado pelo usu�rio.
package Lista6Loops;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double comparar = 0;
		boolean validacao = false;
		do {
			System.out.println("Informe um n�mero inteiro positivo(-1 para encerrar): ");
			double numero = read.nextDouble();
			do {
				if (numero % 1 != 0 || numero == 0 || numero < -1) {
					System.out.println("O n�mero digitado deve ser um inteiro.");
					System.out.println("Informe um n�mero inteiro positivo: ");
					numero = read.nextDouble();
					}
			} while (numero % 1 != 0 || numero == 0 || numero < -1);
			if (numero > comparar) {
				comparar = numero;
			} else if (numero == -1) {
				validacao = true;
			}
		} while (!validacao);
		
		System.out.println("O maior numero informado foi: " +(int)comparar);

		read.close();

	}

}
