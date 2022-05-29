package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] vetorA = new int[10];
		int comparar;
		int count = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0, j = vetorA.length - 1; i < vetorA.length / 2; i++, j--) {
			comparar = vetorA[i] - vetorA[j];
			count++;
			if (comparar != 0) {
				System.out.println("O vetor A não é um palíndromo.");
				break;
			}
		}
		if (count == vetorA.length / 2) {
			System.out.println("O vetor A é um palíndromo.");
		}
		
		read.close();

	}

}
