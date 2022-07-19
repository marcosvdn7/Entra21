package ListaOOB5HerançaExercicio2;

public class Aluno {

	private String nome;
	private String cpf;
	private String numMatricula;
	private String curso;
	private Disciplina[] disciplinas;
	
	public Aluno() {
		this.disciplinas = new Disciplina[3];
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNumMatricula() {
		return numMatricula;
	}
	
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] alunos) {
		this.disciplinas = alunos;
	}
	
	public String mostrarDisciplinas() {
		String print = "";
		for (Disciplina disciplina : this.disciplinas) {
			int indice = 1;
			print += disciplina.getNome()+ (indice <= this.disciplinas.length ? ".\n" : ".");
			indice++ ;
		}
		return print;
	}
	
	public String toString() {
		String print = "";
		print += "--------------------------------------------\n";
		print += "Nome: " +this.nome+ "\n";
		print += "CPF: " +this.cpf+ "\n";
		print += "Nï¿½mero de matrï¿½cula: " +this.numMatricula+ "\n";
		print += "Curso: " +this.curso+ "\n";
		print += "--------------------------------------------\n";
		return print;
	}
	
//	public String toString() {
//		
//		return "Nome :" +this.nome+ ".\n" + "CPF: " +this.cpf+ ".\n" + "Número de Matrícula: " +this.numMatricula+ ".\n"
//		+ "Curso: " +this.curso+ ".\n";
//	}
}
