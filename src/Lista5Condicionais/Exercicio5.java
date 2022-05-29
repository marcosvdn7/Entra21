package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		int idade = read.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A.");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Infantil B.");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Juvenil A.");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvanil B.");
		} else if (idade > 18) {
			System.out.println("Adulto.");
		} else {
			System.out.println("Idade Inválida!");
		}
	
		read.close();

	}

}
