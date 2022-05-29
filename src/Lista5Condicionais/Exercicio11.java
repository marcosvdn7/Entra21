package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1, num2, res;
		char operacao;
		
		System.out.println("Informe um número: ");
		num1 = read.nextDouble();
		System.out.println("Informe outro número: ");
		num2 = read.nextDouble();
		System.out.println("Informe a operação desejada: ");
		System.out.println("+ - Adição.");
		System.out.println("- - Subtração.");
		System.out.println("* - Multiplicação.");
		System.out.println("/ - Divisão.");
		operacao = read.next().charAt(0);
		
		switch(operacao) {
		case '+': res = num1 + num2;
		System.out.println("O resultado da soma entre esses dois números é " +res);break;
		case '-': res = num1 - num2;
		System.out.println("O resultado da subtração entre esses dois números é " +res);break;
		case '*': res = num1 / num2;
		System.out.println("O resultado da divisão entre esses dois números é " +res);break;
		case '/':res = num1 * num2;
		System.out.println("O resultado da subtração entre esses dois números é " +res);break;
		default: System.out.println("Operação inválida");break;
		}
		
		read.close();

	}

}
