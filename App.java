import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Livro livro = new Livro();
		Aluno aluno = new Aluno();
		 int contador = 1;
		 Scanner sc = new Scanner (System.in);
while (contador == 1){
	System.out.println("--------------------");
	System.out.println("Escolha Uma Opção: \n 1: Adicionar Livro \n 2: Consultar livros \n 3: Emprestar livro \n 4: Consultar Alunos com Livros \n 5: Sair do menu");
	System.out.println("--------------------");
	int escolha = sc.nextInt();
	
	if(escolha == 1) {
		System.out.println("--------------------");
		System.out.println("Escolha um Codigo para o Livro (Apenas Numeros)");
		System.out.println("--------------------");
		livro.setCodigo(sc.nextInt());
		System.out.println("--------------------");
		System.out.println("Digite o nome do Livro");
		System.out.println("--------------------");
		livro.setNome(sc.next());
		System.out.println("--------------------");
		System.out.println("Digite o nome do Autor");
		System.out.println("--------------------");
		livro.setAutor(sc.next());
		System.out.println("--------------------");
		System.out.println("o livro está disponivel?");
		System.out.println("--------------------");
		livro.setDisponibilidade(sc.next());
		livro.getListaLivros().add(livro);
	}
	else if(escolha == 2) {
		System.out.println(livro.getNome());
		System.out.println(livro.getAutor());
		System.out.println(livro.getCodigo());
		System.out.println(livro.getDisponibilidade());
		contador = 2;
	}
	else if(escolha == 3) {
		System.out.println("--------------------");
		System.out.println("Nome do Aluno: ");
		System.out.println("--------------------");
		aluno.setNome(sc.next());
		System.out.println("--------------------");
		System.out.println("Numero da Matricula: ");
		System.out.println("--------------------");
		aluno.setMatricula(sc.nextInt());
		System.out.println("--------------------");
		System.out.println("Email do Aluno: ");
		System.out.println("--------------------");
		aluno.setEmail(sc.next());
		System.out.println("--------------------");
		System.out.println("Digite o Codigo do Livro (Apenas Numeros)");
		System.out.println("--------------------");
		livro.setCodigo(sc.nextInt());
		System.out.println("--------------------");
		System.out.println("Digite o nome do Livro");
		System.out.println("--------------------");
		livro.setNome(sc.next());
		System.out.println("--------------------");
		System.out.println("Digite o autor do Livro");
		System.out.println("--------------------");
		livro.setAutor(sc.next());
		aluno.getLivrosEmprestados().add(livro);
	}
	else if(escolha == 4) {
			System.out.println(aluno.getNome());
	}
	else if(escolha == 5) {
		System.out.println("--------------------");
		System.out.println("Você saiu do menu!");
		System.out.println("--------------------");
		contador = 2;
	}
	
	}
}
}