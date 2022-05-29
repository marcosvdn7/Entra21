package ListaExercicios7Arrays;
import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] vetorA = new int[10];
	
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nDivisores de " +vetorA[i]+ ".");
			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.print(j+ " ");
				}
			}
			System.out.println();
		}
		
		read.close();

	}

}
