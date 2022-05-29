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
			System.out.println("Não é um triangulo!!");
		} else if (lado1 + lado3 < lado2) {
			System.out.println("Não é um triangulo!!");
		} else if (lado2 + lado3 < lado1) {
			System.out.println("Não é um triangulo!!");
		} else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Esses números formam um triângulo equilátero.");
		} else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Esses lados formam um triangulo isósceles.");
		} else if (lado1 == lado3 && lado2 != lado1) {
			System.out.println("Esses lados formam um triangulo isósceles.");
		} else if (lado2 == lado3 && lado2 != lado1) {
			System.out.println("Esses lados formam um triangulo isósceles.");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Esses números formam um triangulo escaleno.");
		} 
		
		read.close();

	}

}
