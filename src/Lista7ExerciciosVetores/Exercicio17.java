package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[] nomes = new String[5];
		int[] dvds = new int[nomes.length];
		int[] locacaoGratis = new int[nomes.length];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Insira o nome do cliente: ");
			nomes[i] = read.next();
			System.out.println("Insira a quantidade de dvds que " +nomes[i]+ " alugou: ");
			dvds[i] = read.nextInt();
			for (int j = 1; j <= dvds[i]; j++) {
				if (j % 10 == 0) {
					locacaoGratis[i]++;
				}
			}
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]+ " alugou " +dvds[i]+ " dvds, tendo direito a " +locacaoGratis[i]+ " locações grátis.");
		}
		
		read.close();

	}

}
