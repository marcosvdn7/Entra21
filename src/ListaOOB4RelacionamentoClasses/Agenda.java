package ListaOOB4RelacionamentoClasses;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public Agenda(int contatosLength) {
		this.contatos = new Contato[contatosLength];
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void mostrarContato(int indice) {
		System.out.println("------------------------");
		System.out.println("\t" +this.nome);
		System.out.println("------------------------");
		System.out.println("Nome: " +this.contatos[indice].getNome());
		System.out.println("E-mail: " +this.contatos[indice].getEmail());
		System.out.println("Telefone: " +this.contatos[indice].getTelefone());
		System.out.println("------------------------");
	}
	
	public void mostrarContatos() {
		System.out.println("------------------------");
		System.out.println("\t" +this.nome);
		System.out.println("------------------------");
		for (int i = 0; i < this.contatos.length; i++) {
			System.out.println("Nome: " +this.contatos[i].getNome());
			System.out.println("E-mail: " +this.contatos[i].getEmail());
			System.out.println("Telefone: " +this.contatos[i].getTelefone());
			System.out.println("------------------------");
		}
	}
	
}
