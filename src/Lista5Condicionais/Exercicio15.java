package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int carne, cartao;
		double peso,valor, valorTotal, desconto,valorDesconto;
		
		System.out.println("Escolha a carne (1 - Fil� Duplo, 2 - Alcatra, 3 - Picanha).");
		carne = read.nextInt();
		System.out.println("Quantos quilos voc� vai comprar.");
		peso = read.nextFloat();
		System.out.println("Pagamento ser� feito no cart�o? 1 - Sim 2 - N�o.");
		cartao = read.nextInt();
		
		if (carne == 1 && peso < 5 && cartao == 1) {
			valor = 4.9;
			valorTotal = 4.9 * peso;
			desconto = (valorTotal * 0.05);
			valorDesconto = valorTotal - desconto;
			System.out.println("Voc� escolheu " +peso+ "kg de fil� duplo.");
			System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");			
			} else if (carne == 1 && peso > 5 && cartao == 2) {
				valor = 5.8;
				valorTotal = peso * 5.8;
				System.out.println("Voc� escolheu " +peso+ "kg de fil� duplo.");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
			} else if (carne == 1 && peso > 5 && cartao == 1) {
				valor = 5.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Voc� escolheu " +peso+ "kg de fil� duplo.");
				System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");
			} else if (carne == 1 && peso < 5 && cartao == 2) {
				valor = 4.9;
				valorTotal = valor * peso;
				System.out.println("Voc� escolheu " +peso+ "kg de fil� duplo.");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
			
			
			} else if (carne == 2 && peso < 5 && cartao == 1) {
				valor = 5.9;
				valorTotal = valor * peso;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Voc� escolheu " +peso+ "kg de alcatra.");
				System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");			
			} else if (carne == 2 && peso > 5 && cartao == 2) {
				valor = 6.8;
				valorTotal = peso * valor;
				System.out.println("Voc� escolheu " +peso+ "kg de alcatra.");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
			} else if (carne == 2 && peso > 5 && cartao == 1) {
				valor = 6.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Voc� escolheu " +peso+ "kg de alcatra.");
				System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");
			} else if (carne == 2 && peso < 5 && cartao == 2) {
				valor = 5.9;
				valorTotal = valor * peso;
				System.out.println("Voc� escolheu " +peso+ "kg de alcatra.");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
			
		    
		    
		    } else if (carne == 3 && peso < 5 && cartao == 1) {
				valor = 6.9;
				valorTotal = valor * peso;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Voc� escolheu " +peso+ "kg de picanha>");
				System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");	
				
			} else if (carne == 3 && peso > 5 && cartao == 2) {
				valor = 7.8;
				valorTotal = peso * valor;
				System.out.println("Voc� escolheu " +peso+ "kg de picanha>");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
			} else if (carne == 3 && peso > 5 && cartao == 1) {
				valor = 7.8;
				valorTotal = peso * valor;
				desconto = (valorTotal * 0.05);
				valorDesconto = valorTotal - desconto;
				System.out.println("Voc� escolheu " +peso+ "kg de picanha>");
				System.out.println("Voc� recebeu um desconto de " +desconto+ " reais. O valor total pago ser� de " +valorDesconto+ " reais.");
			} else if (carne == 3 && peso < 5 && cartao == 2) {
				valor = 6.9;
				valorTotal = valor * peso;
				System.out.println("Voc� escolheu " +peso+ "kg de picanha>");
				System.out.println("O valor total pago ser� de " +valorTotal+ " reais.");
		
				}
			
		
			 read.close();

	}

}
