package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Informe o primeiro lado: ");
		lado1 = read.nextInt();
		System.out.println("Informe o segundo lado: ");
		lado2 = read.nextInt();
		System.out.println("Informe o terceiro lado: ");
		lado3 = read.nextInt();
		
		if (lado1 + lado2 < lado3) {
			System.out.println("N�o � um triangulo!!");
		} else if (lado1 + lado3 < lado2) {
			System.out.println("N�o � um triangulo!!");
		} else if (lado2 + lado3 < lado1) {
			System.out.println("N�o � um triangulo!!");
		} else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Esses n�meros formam um tri�ngulo equil�tero.");
		} else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Esses lados formam um triangulo is�sceles.");
		} else if (lado1 == lado3 && lado2 != lado1) {
			System.out.println("Esses lados formam um triangulo is�sceles.");
		} else if (lado2 == lado3 && lado2 != lado1) {
			System.out.println("Esses lados formam um triangulo is�sceles.");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Esses n�meros formam um triangulo escaleno.");
		} 
		
		read.close();

	}

}
