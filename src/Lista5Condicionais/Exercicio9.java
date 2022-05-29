package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int fruta;
		float preco, precoCaixa;
		
		System.out.println("Informe a fruta desejada (1 - Laranja, 2 - Limão e 3 - Morango).");
		fruta = read.nextInt();
		System.out.println("Informe o preço da fruta: ");
		preco = read.nextFloat();
		
		if (fruta == 1) {
			precoCaixa = preco*60;
			System.out.println("Uma caixa de laranja custa " +precoCaixa+ " reais.");
		} else if (fruta == 2) {
			precoCaixa = preco*80;
			System.out.println("Uma caixa de limão custa " +precoCaixa+ " reais.");
		} else if (fruta == 3) {
			precoCaixa = preco*20;
			System.out.println("Uma caixa de morango custa " +precoCaixa+ " reais.");
		} else {
			System.out.println("Insira uma fruta válida!");
		}
		
		read.close();

	}

}
