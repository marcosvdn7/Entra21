package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int codigo;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Insira o código do produto: ");
		codigo = read.nextInt();
		
		if (codigo == 1) {
			System.out.println("Alimento nao-perecível.");
		} else if (codigo > 1 && codigo <= 4) {
			System.out.println("Alimento perecível.");
		} else if (codigo > 4 && codigo <= 6) {
			System.out.println("Vestuário.");
		} else if (codigo == 7) {
			System.out.println("Higiene pessoal.");
		} else if (codigo >= 8 && codigo <= 15) {
			System.out.println("Limpeza e utensílios domésticos.");
		} else {
			System.out.println("Código inválido!");
		}
		read.close();

	}

}
