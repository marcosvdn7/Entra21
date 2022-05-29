package Lista7ExerciciosVetores;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " +i);
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] <= 0) {
				vetorA[i] = 0;
				continue;
			}
			System.out.println(vetorA[i]+ " ");
		}
		
		read.close();

	}

}
