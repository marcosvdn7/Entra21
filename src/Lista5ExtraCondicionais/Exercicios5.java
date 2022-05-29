package Lista5ExtraCondicionais;

import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double valorHora, horasTrabalhadas, salarioBruto, ir, fgts, inss, desconto, salarioLiquido;
		
		System.out.println("Informe o valor\\hora do funcionario: ");
		valorHora = read.nextDouble();
		System.out.println("Informe as  horas trabalhadas: ");
		horasTrabalhadas = read.nextDouble();
		salarioBruto = horasTrabalhadas * valorHora;
		
		
		if (salarioBruto <= 900) {
			inss = salarioBruto * 0.10;
			fgts = salarioBruto * 0.11;
			salarioLiquido = salarioBruto - inss;
			System.out.println("Salario Bruto     	: " +salarioBruto+ ".");
			System.out.println("(-) IR            	: Isento.");
			System.out.println("(-) INSS (10%)   	: " +inss+ ".");
			System.out.println("FGTS (11%)        	: " +fgts+ ".");
			System.out.println("Total de descontos	: " +inss+ ".");
			System.out.println("Salário Líquido   	: " +salarioLiquido+ ".");
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			inss = salarioBruto * 0.10;
			ir = salarioBruto * 0.05;
			fgts = salarioBruto * 0.11;
			desconto = (inss + ir);
			salarioLiquido = salarioBruto - (inss + ir);
			System.out.println("Salario Bruto     	: " +salarioBruto+ ".");
			System.out.println("(-) IR            	: " +ir+ ".");
			System.out.println("(-) INSS (10%)    	: " +inss+ ".");
			System.out.println("FGTS (11%)        	: " +fgts+ ".");
			System.out.println("Total de descontos	: " +desconto+ ".");
			System.out.println("Salário Líquido   	: " +salarioLiquido+ ".");
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			inss = salarioBruto * 0.10;
			ir = salarioBruto * 0.10;
			fgts = salarioBruto * 0.11;
			desconto = (inss + ir);
			salarioLiquido = salarioBruto - (inss + ir);
			System.out.println("Salario Bruto     	: " +salarioBruto+ ".");
			System.out.println("(-) IR            	: " +ir+ ".");
			System.out.println("(-) INSS (10%)    	: " +inss+ ".");
			System.out.println("FGTS (11%)        	: " +fgts+ ".");
			System.out.println("Total de descontos	: " +desconto+ ".");
			System.out.println("Salário Líquido   	: " +salarioLiquido+ ".");
		} else {
			inss = salarioBruto * 0.10;
			ir = salarioBruto * 0.20;
			fgts = salarioBruto * 0.11;
			desconto = (inss + ir);
			salarioLiquido = salarioBruto - (inss + ir);
			System.out.println("Salario Bruto     	: " +salarioBruto+ ".");
			System.out.println("(-) IR            	: " +ir+ ".");
			System.out.println("(-) INSS (10%)    	: " +inss+ ".");
			System.out.println("FGTS (11%)        	: " +fgts+ ".");
			System.out.println("Total de descontos	: " +desconto+ ".");
			System.out.println("Salário Líquido   	: " +salarioLiquido+ ".");
		}
		
		read.close();

	}

}
