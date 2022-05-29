package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num1, num2, res;
		char operacao;
		int verificacao;
		
		System.out.println("Informe um número: ");
		num1 = read.nextDouble();
		System.out.println("Informe outro número: ");
		num2 = read.nextDouble();
		System.out.println("Informe a operação desejada (+ - Adição, - - Subtração, / - Divisão, * - Multiplicação): ");
		operacao = read.next().charAt(0);	
		
		if (operacao == '+') {
			res = num1 + num2;
			System.out.println("O resultado da soma entre esses dois números é " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado é negativo.");
			} else if (res >= 0){
				System.out.println("O resultado é positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado é par.");break;
			default: System.out.println("O resultado é ímpar.");break;
			}
			
		} else if (operacao == '-') {
			res = num1 - num2;
			System.out.println("O resultado da subtração entre esses dois números é " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado é negativo.");
			} else if (res >= 0){
				System.out.println("O resultado é positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado é par.");break;
			default: System.out.println("O resultado é ímpar.");break;
			}
			
		} else if (operacao == '/') {
			res = num1 / num2;
			System.out.println("O resultado da divisão entre esses dois números é " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado é negativo.");
			} else if (res >= 0){
				System.out.println("O resultado é positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado é par.");break;
			default: System.out.println("O resultado é ímpar.");break;
			}
			
		} else if (operacao == '*') {
			res = num1 * num2;
			System.out.println("O resultado da multiplicação entre esses dois números é " +res);
			verificacao = (int) (res % 2);
			if (res < 0) {
				System.out.println("O resultado é negativo.");
			} else if (res >= 0){
				System.out.println("O resultado é positivo.");
			}
			switch(verificacao) {
			case 0: System.out.println("O resultado é par.");break;
			default: System.out.println("O resultado é ímpar.");break;
			}
		} else {
			System.out.println("Operação inválida");
		}
		
		read.close();

	}

}
