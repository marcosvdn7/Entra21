package Lista8Matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[][] matrizM = new int[3][3];
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Informe o valor localizado na linha " +i+ ", coluna " +j+ ": ");
				matrizM[i][j] = read.nextInt();
			}
		}
		
		for (int i = 0; i < matrizM.length; i++) {
			System.out.println("\nLinha " +i);
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Coluna " +j+ ": " +matrizM[i][j]);
				if (matrizM[i][j] % 2 == 0) {
					qtdPar++;
				} else {
					qtdImpar++;
				}
			}
		}
		
		System.out.println("\nExistem " +qtdPar+ " números pares nessa matriz.");
		System.out.println("Existem " +qtdImpar+ " números ímpares nessa matriz.");

		read.close();

	}

}
