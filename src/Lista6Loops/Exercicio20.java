package Lista6Loops;
import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		try (var read = new Scanner(System.in)) {
			int num, num2;
			int soma = 0;
			int i = 0;
			System.out.println("Digite um número inteiro: ");
			num = read.nextInt();
			System.out.println("Digite outro número inteiro: ");
			num2 = read.nextInt();
			
			
			for (; num < num2; num++) {
				while (i < 1) {
					num += 1;
					i++;
				}
				System.out.println(num);
				soma += num;
			}
			System.out.println(soma);
			read.close();
		}

	}

}
