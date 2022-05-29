package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double numero = read.nextDouble();
		if (numero > 0) {
			System.out.println("O número informado é positivo.");
		} else if (numero == 0) {
			System.out.println("0 é um número neutro.");
		} else {
			System.out.println("O número informado é negativo.");
		}
		read.close();

	}

}
