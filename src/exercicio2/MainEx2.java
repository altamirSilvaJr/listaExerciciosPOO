package exercicio2;

public class MainEx2 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Altamir");
		pessoa.setIdade(28);
		
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		

	}

}
