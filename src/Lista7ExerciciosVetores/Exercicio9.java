package Lista7ExerciciosVetores;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int qtdSup35 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				qtdSup35++;
			}
		}
		System.out.println("A quantidade de pessoas com idade acima de 35 anos é " +qtdSup35+ ".");
		
		read.close();

	}

}
