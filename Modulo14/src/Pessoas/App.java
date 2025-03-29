package Pessoas;


public class App {

	public static void main(String[] args) {
		PessoaFisica pessoaf= new PessoaFisica();
		PessoaJuridica pessoaJ= new PessoaJuridica();

		
		pessoaf.setNome("Lucas");
		pessoaf.setCpf("131278346821");
		
		pessoaJ.setCnpj("12421421421");
		pessoaJ.setNome("Paulo");
		
		pessoaf.imprimirDados();
		pessoaJ.imprimirDados();
	}

}
