package ghgh;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	
	public PessoaJuridica(Integer clienteId, String nome, String cnpj) {
		super(clienteId, nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void dadosPF() {
		this.dados();
		System.out.println("cnpj: " + cnpj);
	}
}
