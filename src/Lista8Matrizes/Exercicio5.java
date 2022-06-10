package Lista8Matrizes;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[][][] calendario = new String[12][31][8];
		int opcao = 0;
		boolean validacao = false;
		
		for (int i = 0; i < calendario.length; i++) {
			for (int j = 0; j < calendario[i].length; j++) {
				for (int k = 0; k < calendario[i][j].length; k++) {
					calendario[i][j][k] = "";
				}
			}
		}
		
		for (int i = 0, j = 0, k = 0; validacao == false;) {
			System.out.println("Você possui agendamento nos seguintes dias: ");
			System.out.println("------------------");
			for (int mes = 0; mes < calendario.length; mes++) {
				boolean imprimirMes = true;
				for (int dia = 0; dia < calendario[mes].length; dia++) {
					for (int hora = 0; hora < calendario[mes][dia].length; hora++) {
					if (calendario[mes][dia][hora] != "") {
						if (imprimirMes == true) {
							System.out.println("       M�s " +(mes + 1));
							System.out.println("------------------");
							imprimirMes = false;
						}
						System.out.println("Dia " +(dia + 1)+ " - " +(hora == 0 ? (hora + 1)+ " hora" :(hora + 1)+ " horas"));
						System.out.println(calendario[mes][dia][hora]+ ".");
						System.out.println("------------------");
						}
					}
				}
			}
			System.out.println("Entre com o mês que deseja alterar(1 - 12): ");
			i = read.nextInt();
			while (i > 12 || i < 1) {
				System.out.println("Entre com um mês válido: ");
				i = read.nextInt();
			}
			i--;
			System.out.println("Entre com o dia que deseja alterar(1 - 31): ");
			j = read.nextInt();
			while (j > 31 || j < 1) {
				System.out.println("Entre com um dia válido: ");
				j = read.nextInt();
			}
			j--;
			System.out.println("Entre com a hora que deseja alterar(1 - 8): ");
			k = read.nextInt();
			while (k > 8 || k < 1) {
				System.out.println("Entre com uma hora válida: ");
				k = read.nextInt();
			}
			k--;
			if (calendario[i][j][k].equals("")) {
				System.out.println("Você nao possui nenhum compromisso marcado para esse dia, deseja adicionar?");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("Informe o compromisso agendado: ");
					calendario[i][j][k] = read.nextLine();
					calendario[i][j][k] = read.nextLine();
				}
				System.out.println("\nDeseja consultar outra data?");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
				switch(opcao) {
				case 1: continue;
				case 2: 
					System.out.println("Você possui agendamento nos seguintes dias: ");
					System.out.println("------------------");
					for (int mes = 0; mes < calendario.length; mes++) {
						boolean imprimirMes = true;
						for (int dia = 0; dia < calendario[mes].length; dia++) {
							for (int hora = 0; hora < calendario[mes][dia].length; hora++) {
							if (calendario[mes][dia][hora] != "") {
								if (imprimirMes == true) {
									System.out.println("       M�s " +(mes + 1));
									System.out.println("------------------");
									imprimirMes = false;
								}
								System.out.println("Dia " +(dia + 1)+ " - " +(hora == 0 ? (hora + 1)+ " hora" :(hora + 1)+ " horas"));
								System.out.println(calendario[mes][dia][hora]+ ".");
								System.out.println("------------------");
								}
							}
						}
					}
					validacao = true;
				}
			} else {
				System.out.println("\nVocê Possui um compromisso agendado para essa data: ");
				System.out.println("------------------");
				System.out.println(calendario[i][j][k]);
				System.out.println("------------------");
				System.out.println("\nDeseja alterar o compromisso?");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("\nInsira o novo compromisso: ");
					calendario[i][j][k] = read.nextLine();
					calendario[i][j][k] = read.nextLine();
				}
				System.out.println("\nDeseja consultar outra data?");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
				switch(opcao) {
				case 1: continue;
				case 2: 
					System.out.println("Você possui agendamento nos seguintes dias: ");
					System.out.println("------------------");
					for (int mes = 0; mes < calendario.length; mes++) {
						boolean imprimirMes = true;
						for (int dia = 0; dia < calendario[mes].length; dia++) {
							for (int hora = 0; hora < calendario[mes][dia].length; hora++) {
							if (calendario[mes][dia][hora] != "") {
								if (imprimirMes == true) {
									System.out.println("       M�s " +(mes + 1));
									System.out.println("------------------");
									imprimirMes = false;
								}
								System.out.println("Dia " +(dia + 1)+ " - " +(hora == 0 ? (hora + 1)+ " hora" :(hora + 1)+ " horas"));
								System.out.println(calendario[mes][dia][hora]+ ".");
								System.out.println("------------------");
								}
							}
						}
					}
					validacao = true;;
				}
			} 
		}
		
		read.close();

	}

}
