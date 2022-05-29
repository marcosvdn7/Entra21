package Lista5ExtraCondicionais;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double indice;
		
		System.out.println("Informe o índice de poluição: ");
		indice = read.nextDouble();
		
		if (indice == 0 && indice <= 0.25) {
			System.out.println("ìndice de poluição dentro dos níveis aceitáveis.");
		} else if (indice >= 0.3 && indice  <= 0.39) {
			System.out.println("As indústrias do grupo 1 devem suspender as atividades até segunda ordem.");
		} else if (indice >= 0.4 && indice <= 0.49) {
			System.out.println("As indústrias do grupo 1 e 2 devem suspender as atividades até segunda ordem.");
		} else if (indice >= 0.5) {
			System.out.println("Todas as indústrias devem suspender as atividades até segunda ordem.");
		}
		
		read.close();

	}

}
