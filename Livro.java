import java.util.ArrayList;

public class Livro {

	private String nome;
	private int codigo;
	private String autor;
	private String disponibilidade;
	private ArrayList <Livro> listaLivros;
	public Livro() {
		listaLivros = new ArrayList<Livro>();
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int Codigo) {
		this.codigo = codigo;
	}
}