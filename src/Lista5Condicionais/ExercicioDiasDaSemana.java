package Lista5Condicionais;

import java.util.Scanner;

public class ExercicioDiasDaSemana {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira um numero de 1 a 7: ");
		int diaSemana = read.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo.");break;
		case 2: System.out.println("Segunda.");break;
		case 3: System.out.println("Ter�a.");break;
		case 4: System.out.println("Quarta.");break;
		case 5: System.out.println("Quinta.");break;
		case 6: System.out.println("Sexta.");break;
		case 7: System.out.println("Sabado.");break;
		default: System.out.println("N�o � um n�mero v�lido.");break;
		}
		
		read.close();

	}

}
