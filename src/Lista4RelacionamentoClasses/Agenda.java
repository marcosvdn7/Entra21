package Lista4RelacionamentoClasses;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
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
		System.out.println("Nome: " +this.contatos[indice].nome);
		System.out.println("E-mail: " +this.contatos[indice].email);
		System.out.println("Telefone: " +this.contatos[indice].telefone);
		System.out.println("------------------------");
	}
	
	public void mostrarContatos() {
		System.out.println("------------------------");
		for (int i = 0; i < this.contatos.length; i++) {
			System.out.println("Nome: " +this.contatos[i].nome);
			System.out.println("E-mail: " +this.contatos[i].email);
			System.out.println("Telefone: " +this.contatos[i].telefone);
			System.out.println("------------------------");
		}
	}
	
}
