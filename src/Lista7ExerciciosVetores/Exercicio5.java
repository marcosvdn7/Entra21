package Lista7ExerciciosVetores;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		System.out.println("A soma dos múltiplos de 5 presente no vetor A é " +soma+ ".");
		
		read.close();

	}

}
