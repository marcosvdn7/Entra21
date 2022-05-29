package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int carne, cartao;
		double peso,valor, valorTotal, desconto,valorDesconto;
		
		System.out.println("Escolha a carne (1 - Filé Duplo, 2 - Alcatra, 3 - Picanha).");
		carne = read.nextInt();
		System.out.println("Quantos quilos você vai comprar.");
		peso = read.nextFloat();
		System.out.println("Pagamento será feito no cartão? 1 - Sim 2 - Não.");
		cartao = read.nextInt();
		
		if (carne == 1 && peso < 5 && cartao == 1) {
			valor = 4.9;
			valorTotal = 4.9 * peso;
			desconto = (valorTotal * 0.05);
			valorDesconto = valorTotal - desconto;
			System.out.println("Você escolheu " +peso+ "kg de filé duplo.");
			System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");			
			} else if (carne == 1 && peso > 5 && cartao == 2) {
				valor = 5.8;
				valorTotal = peso * 5.8;
				System.out.println("Você escolheu " +peso+ "kg de filé duplo.");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
			} else if (carne == 1 && peso > 5 && cartao == 1) {
				valor = 5.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Você escolheu " +peso+ "kg de filé duplo.");
				System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");
			} else if (carne == 1 && peso < 5 && cartao == 2) {
				valor = 4.9;
				valorTotal = valor * peso;
				System.out.println("Você escolheu " +peso+ "kg de filé duplo.");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
			
			
			} else if (carne == 2 && peso < 5 && cartao == 1) {
				valor = 5.9;
				valorTotal = valor * peso;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Você escolheu " +peso+ "kg de alcatra.");
				System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");			
			} else if (carne == 2 && peso > 5 && cartao == 2) {
				valor = 6.8;
				valorTotal = peso * valor;
				System.out.println("Você escolheu " +peso+ "kg de alcatra.");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
			} else if (carne == 2 && peso > 5 && cartao == 1) {
				valor = 6.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Você escolheu " +peso+ "kg de alcatra.");
				System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");
			} else if (carne == 2 && peso < 5 && cartao == 2) {
				valor = 5.9;
				valorTotal = valor * peso;
				System.out.println("Você escolheu " +peso+ "kg de alcatra.");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
			
		    
		    
		    } else if (carne == 3 && peso < 5 && cartao == 1) {
				valor = 6.9;
				valorTotal = valor * peso;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Você escolheu " +peso+ "kg de picanha>");
				System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");	
				
			} else if (carne == 3 && peso > 5 && cartao == 2) {
				valor = 7.8;
				valorTotal = peso * valor;
				System.out.println("Você escolheu " +peso+ "kg de picanha>");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
			} else if (carne == 3 && peso > 5 && cartao == 1) {
				valor = 7.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Você escolheu " +peso+ "kg de picanha>");
				System.out.println("Você recebeu um desconto de " +desconto+ " reais. O valor total pago será de " +valorDesconto+ " reais.");
			} else if (carne == 3 && peso < 5 && cartao == 2) {
				valor = 6.9;
				valorTotal = valor * peso;
				System.out.println("Você escolheu " +peso+ "kg de picanha>");
				System.out.println("O valor total pago será de " +valorTotal+ " reais.");
		
				}
			
		
			 read.close();

	}

}
