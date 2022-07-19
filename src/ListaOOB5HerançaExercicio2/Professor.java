package ListaOOB5HerançaExercicio2;

public class Professor extends Funcionario{

	private String titulacao;
	private String areaPesquisa;
	private Disciplina[] disciplinas;
	private Curso curso;
	private double valorDedicacaoExclusiva;
	private double retribTitulacao;
	
	public Professor() {
		this.disciplinas = new Disciplina[3];
		this.valorDedicacaoExclusiva = 500;
		this.retribTitulacao = 500;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String getAreaPesquisa() {
		return areaPesquisa;
	}
	
	public void setAreaPesquisa(String areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}
	
	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public double calcSalario() {
		return super.getSalario() + this.valorDedicacaoExclusiva + this.retribTitulacao;
	}
	
//	public void cadastrarDisciplinas(Disciplina[] disciplinas) {
//		for (int i = 0; i < disciplinas.length; i++) {
//			this.disciplinas[i] = disciplinas[i];
//		}
//	}
	
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
		print += "--------------------------------------------";
		print += "\nNome: " +super.getNome();
		print += "\nTelefone: " +super.getClass();
		print += "\nCPF: " +super.getCpf();
		print += "\nCTPS: " +super.getCtps();
		print += "\nSalário Bruto: " +super.getSalario();
		print += "\nTitulação: " +this.titulacao;
		print += "\nÀrea de pesquisa: " +this.areaPesquisa;
		
		return print;
	}

}
