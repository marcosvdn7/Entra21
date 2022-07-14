package Lista4RelacionamentoClasses;

import java.util.Scanner;

public class Exercicio2Curso {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int mediaTurma = 0;
		
		Aluno aluno1 = new Aluno("Pedro", "1234");
		Aluno aluno2 = new Aluno("João", "2135");
		Aluno aluno3 = new Aluno("Maria", "5786");
		Aluno aluno4 = new Aluno("Paulo", "6958");
		Aluno aluno5 = new Aluno("Thiago", "9835");
		
		Curso curso = new Curso("Java", 5);
		curso.setAlunos(0, aluno1);
		curso.setAlunos(1, aluno2);
		curso.setAlunos(2, aluno3);
		curso.setAlunos(3, aluno4);
		curso.setAlunos(4, aluno5);
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			for (int j = 0; j < aluno1.getNotas().length; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota do aluno " +curso.getAlunos()[i].getNome());
				curso.getAlunos()[i].setNotas(j, read.nextDouble());
			}
		}
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			System.out.println("---------------------------------------");
			System.out.println("Aluno: " +curso.getAlunos()[i].getNome()+ ".");
			for (int j = 0; j < curso.getAlunos()[i].getNotas().length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +curso.getAlunos()[i].getNotas()[j]+ ".");
			}
			System.out.println("Média: " +curso.getAlunos()[i].verificarMedia());
			System.out.println("Situação: " +(curso.getAlunos()[i].verificarMedia() >= 7 ? "APROVADO!" : "REPROVADO!"));
			mediaTurma += curso.getAlunos()[i].verificarMedia();
		}
		
		mediaTurma /= curso.getAlunos().length;
		System.out.println("---------------------------------------");
		System.out.println("Média da turma: " +mediaTurma);
		
		read.close();
	}

}
