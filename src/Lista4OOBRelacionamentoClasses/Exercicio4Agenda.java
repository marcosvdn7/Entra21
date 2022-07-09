package Lista4OOBRelacionamentoClasses;

import java.util.Scanner;

public class Exercicio4Agenda {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Agenda agenda = new Agenda(3);
		
		Contato[] contatos = new Contato[3];
		
		System.out.println("Informe o nome da agenda: ");
		agenda.setNome(read.nextLine());
		
		int opcao = 0;
		
		for (int i = 0; i < agenda.getContatos().length; i++) {
			Contato contato = new Contato();
			
			System.out.println("Informe o nome do " +(i + 1)+ "º contato: ");
			contato.setNome(read.nextLine());
			
			System.out.println("Informe o telefone de " +contato.getNome()+ ": ");
			contato.setTelefone(read.nextLine());
			
			System.out.println("Informe o email de " +contato.getNome()+ ": ");
			contato.setEmail(read.nextLine());
			
			contatos[i] = contato;
		}
		
		agenda.setContatos(contatos);
		
		
		while (opcao != 3) {
			System.out.println("----------------------------");
			System.out.println("\t" +agenda.getNome());
			System.out.println("----------------------------");
			System.out.println("1 - Ver todos os contatos.");
			System.out.println("2 - Selecionar contato.");
			System.out.println("3 - Sair.");
			System.out.println("----------------------------");
			opcao = read.nextInt();
			switch (opcao) {
			case 1: agenda.mostrarContatos();break;
			case 2: 
				for (int i = 0; i < agenda.getContatos().length; i++) {
					System.out.println("Opção " +(i + 1)+ ": " +agenda.getContatos()[i].getNome()+ ".");
				}
				agenda.mostrarContato(read.nextInt() - 1);break;
			}
		}
		
		read.close();

	}

}
