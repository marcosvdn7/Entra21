package Lista5ExtraCondicionais;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double indice;
		
		System.out.println("Informe o �ndice de polui��o: ");
		indice = read.nextDouble();
		
		if (indice == 0 && indice <= 0.25) {
			System.out.println("�ndice de polui��o dentro dos n�veis aceit�veis.");
		} else if (indice >= 0.3 && indice  <= 0.39) {
			System.out.println("As ind�strias do grupo 1 devem suspender as atividades at� segunda ordem.");
		} else if (indice >= 0.4 && indice <= 0.49) {
			System.out.println("As ind�strias do grupo 1 e 2 devem suspender as atividades at� segunda ordem.");
		} else if (indice >= 0.5) {
			System.out.println("Todas as ind�strias devem suspender as atividades at� segunda ordem.");
		}
		
		read.close();

	}

}
