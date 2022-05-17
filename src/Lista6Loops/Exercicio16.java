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
		
		System.out.println("Informe seu salário: ");
		double salario = read.nextDouble();
		while (salario <= 0) {
			System.out.println("O salario informado deve ser maior que 0.");
			System.out.println("Informe novamente o salário: ");
			salario = read.nextInt();
		}
		
		System.out.println("Informe seu gênero: ");
		System.out.println("M - Masculino.");
		System.out.println("F - Feminino.");
		char genero = read.next().charAt(0);
		while (genero != 'M' && genero != 'm' && genero != 'F' && genero != 'f') {
			System.out.println("Genero não valido! Escolha uma das opçoes disponíveis: ");
			genero = read.next().charAt(0);
		}
		
		System.out.println("Informe seu estado civil: ");
		System.out.println("S - Solteiro(a).");
		System.out.println("C - Casado(a).");
		System.out.println("V - Viúvo(a).");
		System.out.println("D - Divorciado(a).");
		char estadoCivil = read.next().charAt(0);
		char estadoCivil2 = Character.toUpperCase(estadoCivil);
		while (estadoCivil2 != 'S' && estadoCivil2 != 'C' &&
				estadoCivil2 != 'V' && estadoCivil2 != 'D') {
			System.out.println("Estado civil Inválido! Escolha uma das opções fornecidas.");
			estadoCivil = read.next().charAt(0);
			estadoCivil2 = Character.toUpperCase(estadoCivil);
		}
				
		System.out.println("Nome do usuário: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Salário: " +salario);
		System.out.println("Sexo: " +genero);
		System.out.println("Estado Civil: " +estadoCivil2);
		
		read.close();

	}

}
