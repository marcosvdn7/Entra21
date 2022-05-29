package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num1, num2, res;
		char operacao;
		int verificacao;
		
		System.out.println("Informe um n�mero: ");
		num1 = read.nextDouble();
		System.out.println("Informe outro n�mero: ");
		num2 = read.nextDouble();
		System.out.println("Informe a opera��o desejada (+ - Adi��o, - - Subtra��o, / - Divis�o, * - Multiplica��o): ");
		operacao = read.next().charAt(0);	
		
		if (operacao == '+') {
			res = num1 + num2;
			System.out.println("O resultado da soma entre esses dois n�meros � " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado � negativo.");
			} else if (res >= 0){
				System.out.println("O resultado � positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado � par.");break;
			default: System.out.println("O resultado � �mpar.");break;
			}
			
		} else if (operacao == '-') {
			res = num1 - num2;
			System.out.println("O resultado da subtra��o entre esses dois n�meros � " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado � negativo.");
			} else if (res >= 0){
				System.out.println("O resultado � positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado � par.");break;
			default: System.out.println("O resultado � �mpar.");break;
			}
			
		} else if (operacao == '/') {
			res = num1 / num2;
			System.out.println("O resultado da divis�o entre esses dois n�meros � " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado � negativo.");
			} else if (res >= 0){
				System.out.println("O resultado � positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado � par.");break;
			default: System.out.println("O resultado � �mpar.");break;
			}
			
		} else if (operacao == '*') {
			res = num1 * num2;
			System.out.println("O resultado da multiplica��o entre esses dois n�meros � " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado � negativo.");
			} else if (res >= 0){
				System.out.println("O resultado � positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado � par.");break;
			default: System.out.println("O resultado � �mpar.");break;
			}
		} else {
			System.out.println("Opera��o inv�lida");
		}
		
		read.close();

	}

}
