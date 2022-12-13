package ghgh;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String nome1;
	
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
	
	public void dados() {
		this.dados();
		System.out.println("cnpj: " + cnpj);
	}
}
