package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double saldoMedio, credito;
		
		System.out.println("Informe o saldo m�dio do cliente: ");
		saldoMedio = read.nextDouble();
		
		if (saldoMedio <= 200) {
			System.out.println("Voc� nao tem direito ao cr�dito especial.");
		} else if (saldoMedio > 200 && saldoMedio <= 400) {
			credito = saldoMedio * 0.2;
			System.out.println("O saldo m�dio foi de R$" +saldoMedio+ " e o valor de credito recebido foi de R$" +credito);
		} else if (saldoMedio > 400 && saldoMedio <= 600) {
			credito = saldoMedio * 0.3;
			System.out.println("O saldo m�dio foi de R$" +saldoMedio+ " e o valor de credito recebido foi de R$" +credito);
		} else if (saldoMedio > 600) {
			credito = saldoMedio * 0.4;
			System.out.println("O saldo m�dio foi de R$" +saldoMedio+ " e o valor de credito recebido foi de R$" +credito);
		}
		
		read.close();

	}

}
