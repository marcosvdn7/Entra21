package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		double numero = read.nextDouble();
		if (numero > 0) {
			System.out.println("O n�mero informado � positivo.");
		} else if (numero == 0) {
			System.out.println("0 � um n�mero neutro.");
		} else {
			System.out.println("O n�mero informado � negativo.");
		}
		read.close();

	}

}
