package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int codigo;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Insira o c�digo do produto: ");
		codigo = read.nextInt();
		
		if (codigo == 1) {
			System.out.println("Alimento nao-perec�vel.");
		} else if (codigo > 1 && codigo <= 4) {
			System.out.println("Alimento perec�vel.");
		} else if (codigo > 4 && codigo <= 6) {
			System.out.println("Vestu�rio.");
		} else if (codigo == 7) {
			System.out.println("Higiene pessoal.");
		} else if (codigo >= 8 && codigo <= 15) {
			System.out.println("Limpeza e utens�lios dom�sticos.");
		} else {
			System.out.println("C�digo inv�lido!");
		}
		read.close();

	}

}
