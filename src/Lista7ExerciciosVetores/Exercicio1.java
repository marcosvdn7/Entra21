package ListaExercicios7Arrays;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor do indice " +i+ " do vetor A: ");
			vetorA[i] = read.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
			System.out.println(vetorB[i]);
		}
		
		read.close();
	}

}
