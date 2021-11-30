import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Livro livro = new Livro();
		 int contador = 1;
		 Scanner sc = new Scanner (System.in);
while (contador == 1){
	System.out.println("--------------------");
	System.out.println("Escolha Uma Opção: \n 1: Adicionar Livro \n 2: Consultar livro \n 3: Deletar livro \n 4: Sair do Menu");
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
		livro.getlistaLivros().add(livro);
	}
	else if(escolha == 2) {
		for(Livro liv : livro.getlistaLivros())
			System.out.println(liv.getlistaLivros());
		contador = 2;
	}
	else if(escolha == 4) {
		System.out.println("--------------------");
		System.out.println("Você saiu do menu!");
		System.out.println("--------------------");
		contador = 2;
	}
	
	}
}
}