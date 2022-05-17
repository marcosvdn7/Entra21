package Lista6Loops;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num = 1;
		int produto = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um número inteiro positivo e para terminar um negativo ou zero: ");
			num = read.nextDouble();
			for (int i = 0 ; i < 1 ; i++) {
				if (num % 2 == 1 && produto == 0) {
					produto = 1;
				}
			}
			if (num % 2 == 1) {
				produto *= num;
			} else if (num % 1 != 0){
				System.out.println("Número digitado nao é um inteiro.");
			} else if (num % 2 == 0){
				soma += num;			
			} else {
				System.out.println("Programa encerrado.");
				break;
			}
			System.out.println("Soma dos números pares digitados: " +soma);
			System.out.println("Produto dos números ímpares digitados: " +produto);
		}while(num > 0);

		read.close();
	}

}
