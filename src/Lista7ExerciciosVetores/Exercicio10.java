	package ListaExercicios7Arrays;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] resul = new double[nota1.length];
		int count = 1;
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Insira a primeira nota do " +(i + 1)+ "º aluno: ");
			nota1[i] = read.nextDouble();
			System.out.println("Insira a segunda nota do " +(i + 1)+ "º aluno: ");
			nota2[i] = read.nextDouble();
		}
		
		
		for (int i = 0; i < nota1.length; i++) {
			resul[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("A média do aluno " +count+ " é " +resul[i]+ ".");
			count++;
			if (resul[i] >= 7) {
				System.out.println("Aprovado.");
			} else {
				System.out.println("Reprovado.");
			}
		}
		
		read.close();

	}

}
