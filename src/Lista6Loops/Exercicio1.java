//Verifica se o número é impar ou par, se for par soma os números, se for ímpar multiplica.

package Lista6Loops;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num = 1;
		int produto = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um número inteiro positivo: ");
			System.out.println("Para terminar o programa, digite 0 ou um número negativo: ");
			num = read.nextDouble();
			for (int i = 0 ; i < 1 ; i++) {
				if (num % 2 == 1 && produto == 0) {
					produto = 1;
				}
			}
			if (num % 2 == 1) {
				produto *= num;
			} else if (num % 1 != 0){
				System.out.println("Número digitado nao é um inteiro.\n");
			} else if (num % 2 == 0){
				soma += num;			
			} else if (num <= 0){
				System.out.println("Programa encerrado.");
				break;
			}
			System.out.println("Soma dos números pares digitados: " +soma);
			System.out.println("Produto dos números ímpares digitados: " +produto+ "\n");
		}while(num > 0);

		read.close();
	}

}
