import java.util.ArrayList;

public class Livro {

	private String nome;
	private int codigo;
	private ArrayList <Livro> listaLivros;
	public Livro() {
		listaLivros = new ArrayList<Livro>();
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
	public ArrayList<Livro> getlistaLivros() {
		return listaLivros;
	}
	public void setlistaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
}