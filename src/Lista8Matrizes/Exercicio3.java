package Lista8Matrizes;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		int[][] matrizM = new int[10][10];
		int maior5 = 0;
		int menor5 = 10;
		int maior7 = 0;
		int menor7 = 10;
		Random aleatorio = new Random();
		
		for (int i = 0; i < matrizM.length; i++) {
			System.out.println("\nLinha " +i);
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = aleatorio.nextInt(9);
				System.out.println("Coluna " +j+ ": " +matrizM[i][j]);
				if (i == 4 && matrizM[i][j] > maior5) {
					maior5 = matrizM[i][j];
				}
				if (i == 4 && matrizM[i][j] < menor5) {
					menor5 = matrizM[i][j];
				}
				if (j == 6 && matrizM[i][j] > maior7) {
					maior7 = matrizM[i][j];
				}
				if (j == 6 && matrizM[i][j] < menor7) {
					menor7 = matrizM[i][j];
				}
			}
		}
		
		System.out.println("\nO maior valor na linha 5 da matriz M é " +maior5+ ".");
		System.out.println("O menor valor na linha 5 da matriz M é " +menor5+ ".");
		System.out.println("\nO maior valor na coluna 7 da matriz M é " +maior7+ ".");
		System.out.println("O menor valor na coluna 7 da matriz M é " +menor7+ ".");

	}

}
