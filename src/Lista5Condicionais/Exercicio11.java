package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1, num2, res;
		char operacao;
		
		System.out.println("Informe um n�mero: ");
		num1 = read.nextDouble();
		System.out.println("Informe outro n�mero: ");
		num2 = read.nextDouble();
		System.out.println("Informe a opera��o desejada: ");
		System.out.println("+ - Adi��o.");
		System.out.println("- - Subtra��o.");
		System.out.println("* - Multiplica��o.");
		System.out.println("/ - Divis�o.");
		operacao = read.next().charAt(0);
		
		switch(operacao) {
		case '+': res = num1 + num2;
		System.out.println("O resultado da soma entre esses dois n�meros � " +res);break;
		case '-': res = num1 - num2;
		System.out.println("O resultado da subtra��o entre esses dois n�meros � " +res);break;
		case '*': res = num1 / num2;
		System.out.println("O resultado da divis�o entre esses dois n�meros � " +res);break;
		case '/':res = num1 * num2;
		System.out.println("O resultado da subtra��o entre esses dois n�meros � " +res);break;
		default: System.out.println("Opera��o inv�lida");break;
		}
		
		read.close();

	}

}
