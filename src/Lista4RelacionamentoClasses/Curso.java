package Lista4RelacionamentoClasses;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public Curso(String nome, int indices) {
		this.nome = nome;
		this.alunos = new Aluno[indices];
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(int indice, Aluno alunos) {
		this.alunos[indice] = alunos;
	}
	
	public void verificarMediaTurma() {
	}
}
