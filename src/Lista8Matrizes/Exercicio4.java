package Lista8Matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[][] calendario = new String[31][24];
		int opcao = 0;
		boolean validacao = false;
		
		for (int i = 0; i < calendario.length; i++) {
			for (int j = 0; j < calendario[i].length; j++) {
				calendario[i][j] = "";
			}
		}
		
		for (int i = 0, j = 0; validacao == false;) {
			System.out.println("Você possui agendamento nos seguintes dias: ");
			System.out.println("------------------");
			for (int dia = 0; dia < calendario.length; dia++) {
					for (int hora = 0; hora < calendario[dia].length; hora++) {
					if (calendario[dia][hora] != "") {
						System.out.println("Dia " +(dia + 1)+ " - " +(hora == 0 ? (hora + 1)+ " hora" :(hora + 1)+ " horas"));
						System.out.println(calendario[dia][hora]+ ".");
						System.out.println("------------------");
					}
				}
			}
			System.out.println("Entre com o dia que deseja consultar(1 - 31): ");
			i = read.nextInt();
			while (i > 31 || i < 1) {
				System.out.println("Entre com um dia válido: ");
				i = read.nextInt();
			}
			if (i != 0) {
				i -= 1;
			}
			System.out.println("Entre com a hora que deseja consultar(1 - 24): ");
			j = read.nextInt();
			while (j > 24 || j < 1) {
				System.out.println("Entre com uma hora válida: ");
				i = read.nextInt();
			}
			if (j != 0) {
				j -= 1;
			}
			if (calendario[i][j].equals("")) {
				System.out.println("Você nao possui nenhum compromisso marcado para esse dia e hora, deseja adicionar?");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				opcao = read.nextInt();
				if (opcao == 1) {
					System.out.println("Informe o compromisso agendado: ");
					calendario[i][j] = read.nextLine();
					calendario[i][j] = read.nextLine();
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
					for (int dia = 0; dia < calendario.length; dia++) {
							for (int hora = 0; hora < calendario[dia].length; hora++) {
							if (calendario[dia][hora] != "") {
								System.out.println("Dia " +(dia + 1)+ " - " +(hora == 0 ? (hora + 1)+ " hora" :(hora + 1)+ " horas"));
								System.out.println(calendario[dia][hora]+ ".");
								System.out.println("------------------");
							}
						}
					}
				}
					validacao = true;
				} else {
					System.out.println("\nVocê Possui um compromisso agendado para essa data: ");
					System.out.println("---------------");
					System.out.println(calendario[i][j]);
					System.out.println("---------------");
					System.out.println("\nDeseja alterar o compromisso?");
					System.out.println("1 - Sim.");
					System.out.println("3 - N�o.");
					opcao = read.nextInt();
					if (opcao == 1) {
						System.out.println("Informe o novo compromisso: ");
						calendario[i][j] = read.nextLine();
						calendario[i][j] = read.nextLine();
					}
				}
		}
		
		read.close();

	}

	}
