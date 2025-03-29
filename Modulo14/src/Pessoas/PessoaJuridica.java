package Pessoas;


public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", Nome" + getNome() + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void imprimirDados() {
		System.out.println("Nome:     "+getNome()+ "\nCnpj:      "+ getCnpj());
	}


}
