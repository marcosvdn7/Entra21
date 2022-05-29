package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double valorProduto, valorFinal, desconto;
		float formaPag;
		
		System.out.println("Informe o valor do produto: ");
		valorProduto = read.nextFloat();
		System.out.println("Informe a forma de pagamente (1 - Dinheiro. 2 - Cheque).");
		formaPag = read.nextFloat();
		
		
		if (valorProduto >= 100 && formaPag == 1) {
			desconto = valorProduto*0.1;
			valorFinal = valorProduto - desconto;			
			System.out.println("O valor a ser pago é de " +valorFinal+ " reais.");
		} else if (valorProduto < 100 && formaPag == 2) { 
			System.out.println("O valor a ser pago é de " +valorProduto+ " reais.");
		} else if (valorProduto < 100 && formaPag == 1) {
			System.out.println("O valor a ser pago é de " +valorProduto+ " reais.");
		} else if (valorProduto >= 100 && formaPag == 2) {
			System.out.println("O valor a ser pago é de " +valorProduto+ " reais.");
		} else {
			System.out.println("Não é uma forma de pagamento válida!");
		}
		
		read.close();

	}

}
