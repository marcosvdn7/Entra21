package ListaExtraLoops;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int qtdMercadorias = 0;
		double valorMercadoria, valorTotal = 0, mediaValor;
		
		System.out.println("Informe a quantidade de mercadorias: ");
		qtdMercadorias = read.nextInt();
		
		for (int i = 0; i < qtdMercadorias; i++) {
			System.out.println("Informe o valor da " +(i+1)+ "º mercadoria: ");
			valorMercadoria = read.nextInt();
			valorTotal += valorMercadoria;
		}
		mediaValor = valorTotal / qtdMercadorias;
		System.out.println("O valor total em estoque é de R$" +valorTotal);
		System.out.println("A media do valor dos produtos em estoque é de R$" +mediaValor);

		read.close();

	}

}
