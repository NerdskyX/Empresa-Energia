package ghgh;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cidade;
	private String estado;
	private String CEP;
	
	public Endereco(String rua, int numero, String cidade, String estado, String CEP) {
		this.rua = rua;
		this.cidade = cidade;
		this.numero = numero;
		this.estado = estado;
		this.CEP = CEP;
	}
	
	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "-------------------------------------------"
				+"\n Rua: " + getRua()
				+"\n Numero: " + getNumero()
				+"\n Cidade: " + getCidade()
				+"\n Estado: " + getEstado()
				+"\n CEP: " + getCEP();
		
		return texto;
	}
}

