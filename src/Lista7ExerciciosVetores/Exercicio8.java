package Lista7ExerciciosVetores;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaInf15 = 0;
		int igual15 = 0;
		int sup15 = 0;
		int somaSup15 = 0;
		double mediaSup15;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}	
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				somaInf15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] > 15){
				sup15++;
				somaSup15 += vetorA[i];
			}
		}
		
		mediaSup15 = (double)somaSup15 / sup15;
		System.out.println("Soma dos valores inferiores a 15: " +somaInf15);
		System.out.println("Valores iguais a 15: " +igual15);
		System.out.println("Media dos valores superiores a 15: " +mediaSup15);
		
		read.close();

	}

}
