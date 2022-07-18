package ListaOOB5HerançaExercicio2;

public class Testes {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[3];
		
		Disciplina disciplina = new Disciplina("Algoritmos", "11111", "450");
		Disciplina disciplina1 = new Disciplina("Algoritmos", "11111", "450");
		Disciplina disciplina2 = new Disciplina("Algoritmos", "11111", "450");
		Disciplina disciplina3 = new Disciplina("Algoritmos", "11111", "450");
		
		Disciplina[] disciplinas = {disciplina, disciplina1, disciplina2, disciplina3};
		
		for (int i = 0; i < disciplinas.length; i++) {
			for (int j = 0; j < disciplinas.length; j++) {
				Aluno aluno = new Aluno();
				aluno.setCpf("0983332655");
				aluno.setCurso("TI");
				aluno.setNome("Joao");
				aluno.setNumMatricula("55645656");
				aluno.setDisciplinas(disciplinas);
				for (int k = 0; k < alunos.length; k++) {
					alunos[k] = aluno;
				}
			}
		}
		
		System.out.println(alunos[0].toString());
	}

}
