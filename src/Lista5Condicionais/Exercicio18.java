package Lista5Condicionais;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Insira uma letra: ");
		letra = read.next().charAt(0);
		
		switch(letra) {
		case 'A': System.out.println("Essa letra é uma vogal.");break;
		case 'E': System.out.println("Essa letra é uma vogal.");break;
		case 'I': System.out.println("Essa letra é uma vogal.");break;
		case 'O': System.out.println("Essa letra é uma vogal.");break;
		case 'U': System.out.println("Essa letra é uma vogal.");break;
		case 'a': System.out.println("Essa letra é uma vogal.");break;
		case 'e': System.out.println("Essa letra é uma vogal.");break;
		case 'i': System.out.println("Essa letra é uma vogal.");break;
		case 'o': System.out.println("Essa letra é uma vogal.");break;
		case 'u': System.out.println("Essa letra é uma vogal.");break;
		default: System.out.println("Essa letra é uma consoante.");break;
		}
		
		read.close();

	}

}
