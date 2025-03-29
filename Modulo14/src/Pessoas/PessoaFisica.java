package Pessoas;


public class PessoaFisica extends Pessoa{
	private String cpf;


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimirDados() {
		System.out.println("Nome:     "+getNome()+ "\nCpf:      "+ getCpf());
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", Nome=" + getNome() + "]";
	}


}
