package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Informe um n�mero inteiro positivo: ");
		Scanner read = new Scanner(System.in);
		int numero = read.nextInt();
		float res = numero % 2;
		
		if (res == 0) {
			System.out.println("O numero informado � par.");
		} else {
			System.out.println("O numero informado � �mpar.");
		}
		
		read.close();

	}

}
