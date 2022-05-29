package Lista7ExerciciosVetores;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0, j = vetorA.length - 1; i < vetorA.length; i++, j--) {
			System.out.println("Informe o valor da posição " +i+ ": ");
			vetorA[i] = read.nextInt();
			vetorB[j] = vetorA[i];
		}
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		
		read.close();

	}

}
