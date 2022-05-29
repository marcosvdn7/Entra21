package Lista5ExtraCondicionais;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Informe o ano: ");
		ano = read.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println(ano+ " é um ano bissexto.");
		} else {
			System.out.println("Não é um ano válido.");
		}
		
		read.close();

	}

}
