package Lista7ExerciciosVetores;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		double media;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posi��o " +i);
			vetorA[i] = read.nextInt();
			soma += vetorA[i];
		}
		
		media = (double)soma / vetorA.length;
		System.out.println("A m�dia aritmetica dos valores do vetor A � " +media);
		
		read.close();

	}

}
