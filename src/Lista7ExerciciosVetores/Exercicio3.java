package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i+ " do vetor A: ");
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Insira o valor da posição " +i+ " do vetor B: ");
			vetorB[i] = read.nextInt();
		}
		
		System.out.println("\nSoma: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.print(+vetorC[i]+ " ");
		}
		
		System.out.println("\nSubtração: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.print(vetorC[i]+ " ");
		}
		
		System.out.println("\nMultiplicação: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.print(vetorC[i]+ " ");
		}
		
		System.out.println("\nDivisão: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i] = (float)vetorA[i] / vetorB[i];
			System.out.print(vetorC[i]+ " ");
		}
		
		read.close();

	}

}
