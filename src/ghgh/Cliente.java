package ghgh;

public class Cliente {
	private int clienteId;
	private String nome;
	private Endereco end;
	
	public Cliente(Integer clienteId, String nome) {
		this.clienteId = clienteId;
		this.nome = nome;
	}
	
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
	public void dados() {
		System.out.println("id: " + clienteId);
		System.out.println("nome: " + nome);
	}
	
}
