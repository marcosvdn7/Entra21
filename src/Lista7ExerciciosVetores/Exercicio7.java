package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int par = 0;
		int impar = 0;
		int percentPar = 0;
		int percentImpar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posi��o " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		percentPar = (par * 100) / vetorA.length;
		percentImpar = (impar * 100) / vetorA.length;
		
		System.out.println(percentImpar+ "% dos valores no vetor A sao �mpares.");
		System.out.println(percentPar+ "% dos valores no vetor A s�o pares.");
		
		read.close();

	}

}
