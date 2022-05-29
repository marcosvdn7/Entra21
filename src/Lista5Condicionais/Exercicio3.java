package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float altura;
		double pesoIdeal;
		char genero;
		
		System.out.println("Insira seu sexo(M - Masculino F - Feminino).");
		genero = read.next().charAt(0);
		System.out.println("Insira sua altura: ");
		altura = read.nextFloat();
		
		if (genero == 'M' || genero == 'm') {
			pesoIdeal = 72.7*altura - 58;
			System.out.println("Seu peso ideal é de " +pesoIdeal+ " Kg.");	
		} else if (genero == 'F' || genero == 'f') {
			pesoIdeal = 62.1*altura - 44.7;
			System.out.println("Seu peso ideal é de " +pesoIdeal+ " Kg.");
		} else {
			System.out.print(genero+ " não é um genero válido!");
		}
		
		read.close();

	}

}
