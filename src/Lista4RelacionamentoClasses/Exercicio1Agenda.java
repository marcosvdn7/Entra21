package Lista4RelacionamentoClasses;

import java.util.Scanner;

public class Exercicio1Agenda {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Agenda agenda = new Agenda();
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		
		System.out.println("Informe o nome da agenda: ");
		agenda.setNome(read.next());
		
		System.out.println("Informe o nome do primeiro contato: ");
		contato1.setNome(read.next());
		System.out.println("Informe o email: ");
		contato1.setEmail(read.next());
		System.out.println("Informe o número: ");
		contato1.setTelefone(read.next());
		
		System.out.println("Informe o nome do segundo contato: ");
		contato2.setNome(read.next());
		System.out.println("Informe o email: ");
		contato2.setEmail(read.next());
		System.out.println("Informe o número: ");
		contato2.setTelefone(read.next());
		
		System.out.println("Informe o nome do terceiro contato: ");
		contato3.setNome(read.next());
		System.out.println("Informe o email: ");
		contato3.setEmail(read.next());
		System.out.println("Informe o número: ");
		contato3.setTelefone(read.next());
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato1;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.setContatos(contatos);
		
		//agenda.mostrarContato(0);
		agenda.mostrarContatos();
		
		read.close();

	}

}
