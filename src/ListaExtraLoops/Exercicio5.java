package ListaExtraLoops;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int qtdMercadorias = 0;
		double valorMercadoria, valorTotal = 0, mediaValor;
		int opcao = 0;
		
		for (int i = 0; opcao != 2; i++) {
			System.out.println("Informe o valor da " +(i+1)+ "º mercadoria: ");
			valorMercadoria = read.nextInt();
			valorTotal += valorMercadoria;
			qtdMercadorias++;
			System.out.println("Deseja informar o valor de mais uma mercadoria?");
			System.out.println("1 - Sim.");
			System.out.println("2 = Não.");
			opcao = read.nextInt();
			if (opcao == 2) {
				break;
			}
		}
		mediaValor = valorTotal / qtdMercadorias;
		System.out.println("Você possui " +qtdMercadorias+ " em seu estoque.");
		System.out.println("O valor total em estoque é de R$" +valorTotal+ ".");
		System.out.println("A media do valor dos produtos em estoque é de R$" +mediaValor+ ".");

		read.close();

	}

}
