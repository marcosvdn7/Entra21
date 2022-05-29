package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
			System.out.println(vetorB[i]+ " ");
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = (float)vetorA[i] % 2;
			System.out.print((float)vetorC[i]+ " ");
		}
		
		read.close();

	}

}
