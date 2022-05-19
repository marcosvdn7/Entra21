package Lista6Loops;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		try (var read = new Scanner(System.in)) {
			double num, num2;
			int i = 0;
			System.out.println("Digite um número inteiro: ");
			num = read.nextDouble();
			System.out.println("Digite outro número inteiro: ");
			num2 = read.nextDouble();
			do {
				if(num % 1 != 0 || num2 % 1 != 0) {
					System.out.println("Os números digitados devem ser inteiros.");
					System.out.println("Digite um número inteiro: ");
					num = read.nextDouble();
					System.out.println("Digite outro número inteiro: ");
					num2 = read.nextDouble();
				}
			}while (num % 1 != 0 || num2 % 1 != 0);
			
			
			for (; num < num2; num++) {
				while (i < 1) {
					num += 1;
					i++;
				}
				System.out.println(num);
			}
			read.close();
		}
		}

	}


