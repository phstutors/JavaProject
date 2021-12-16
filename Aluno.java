import java.util.ArrayList;

public class Aluno {
	private int matricula;
	private String email;
	private ArrayList<Livro> livrosEmprestados;
public Aluno(){
	livrosEmprestados = new ArrayList<Livro>();
}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}
	public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

}