package ListaExtraLoops;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int a2 = 0;
		int b2 = 0;
		double resulA = 0;
		double resulB = 0;
		int menor = 0;
		
		System.out.println("Informe o valor de A: ");
		a = read.nextInt();
		System.out.println("Informe o valor de B: ");
		b = read.nextInt();
		if (a > b) {
			menor = b;
		} else if (b > a) {
			menor = a;
		} else {
			menor = a;
		}
			
		for (int i = 2, j = 2;i == 2 || i < menor; i++, j++) {
			resulA = a % i;
			resulB = b % j;
			if (resulA == 0 && resulA == resulB && j == i) {
				a2++;
				b2++;
			}
			System.out.println(i);
			System.out.println(a2);
			System.out.println(b2+ "\n");
		}
		
		if (a == b) {
			System.out.println(a+ " e " +b+ " não são primos entre si.");
		} else if (a2 > 0 && b2 > 0) {
			System.out.println(a+ " e " +b+ " não são primos entre si.");
		} else if (a2 == 0 && b2 == 0) {
			System.out.println(a+ " e " +b+ " são primos entre si.");
		}
		
		read.close();
	}

}
