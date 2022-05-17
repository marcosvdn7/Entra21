package Lista6Loops;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = read.nextLine();
		
		System.out.println("Informe sua idade: ");
		int idade = read.nextInt();
		while (idade < 0 || idade > 100) {
			System.out.println("A idade informada deve ser entre 0 e 100.");
			System.out.println("Insira novamente sua idade: ");
			idade = read.nextInt();		
		}
		
		System.out.println("Informe seu sal�rio: ");
		double salario = read.nextDouble();
		while (salario <= 0) {
			System.out.println("O salario informado deve ser maior que 0.");
			System.out.println("Informe novamente o sal�rio: ");
			salario = read.nextInt();
		}
		
		System.out.println("Informe seu g�nero: ");
		System.out.println("M - Masculino.");
		System.out.println("F - Feminino.");
		char genero = read.next().charAt(0);
		while (genero != 'M' && genero != 'm' && genero != 'F' && genero != 'f') {
			System.out.println("Genero n�o valido! Escolha uma das op�oes dispon�veis: ");
			genero = read.next().charAt(0);
		}
		
		System.out.println("Informe seu estado civil: ");
		System.out.println("S - Solteiro(a).");
		System.out.println("C - Casado(a).");
		System.out.println("V - Vi�vo(a).");
		System.out.println("D - Divorciado(a).");
		char estadoCivil = read.next().charAt(0);
		char estadoCivil2 = Character.toUpperCase(estadoCivil);
		while (estadoCivil2 != 'S' && estadoCivil2 != 'C' &&
				estadoCivil2 != 'V' && estadoCivil2 != 'D') {
			System.out.println("Estado civil Inv�lido! Escolha uma das op��es fornecidas.");
			estadoCivil = read.next().charAt(0);
			estadoCivil2 = Character.toUpperCase(estadoCivil);
		}
				
		System.out.println("Nome do usu�rio: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Sal�rio: " +salario);
		System.out.println("Sexo: " +genero);
		System.out.println("Estado Civil: " +estadoCivil2);
		
		read.close();

	}

}
