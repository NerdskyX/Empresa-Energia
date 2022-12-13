package ghgh;

public class PessoaFisica extends Cliente{
	private String cpf;
	
	public PessoaFisica(Integer clienteId, String nome, String cpf) {
		super(clienteId, nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void dados() {
		this.dados();
		System.out.println("cpf: " + cpf);
	}
}
