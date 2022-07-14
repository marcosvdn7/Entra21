package ListaOOB1CriacaoClasses;

public class Exercicio4LivroBiblioteca {

	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.genero = "Fantasia";
		livro.autor = "R.G.G. Martin";
		livro.titulo = "Game of Thrones";
		livro.ultimoLocatario = "Marcos";
		livro.qtdPaginas = 500;
		livro.dataEmprestimo = new String();
		livro.emprestado = true;
		
		System.out.println(livro.dataEmprestimo);

	}

}
