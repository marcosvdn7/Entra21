package ListaExercicios7Arrays;
import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " +i+ " de A: ");
			vetorA[i] = read.nextInt();
			vetorC[i] = vetorA[i];
		}
		
		for (int i = vetorC.length / 2, j = 0; i < vetorC.length; i++, j++) {
			System.out.println("Informe o valor da posição " +j+ " de B: ");
			vetorB[j] = read.nextInt();
			vetorC[i] = vetorB[j];
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.print("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		
		System.out.print("\nVetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+ " ");
		}
		
		read.close();

	}

}
