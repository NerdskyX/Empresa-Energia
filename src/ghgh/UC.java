package ghgh;

public class UC {
	
	private int ucid;
	private Cliente cliente;
	private int leituraAnterior;
	private int leituraAnual;
	private Endereco endereco;
	
	public UC(int ucid, int leituraAnterior, int leituraAnual, Endereco endereco, Cliente cliente) {
		this.ucid = ucid;
		this.endereco = endereco;
		this.leituraAnterior = leituraAnterior;
		this.leituraAnual = leituraAnual;
		this.cliente = cliente;
		
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getUcid() {
		return ucid;
	}
	public void setUcid(int ucid) {
		this.ucid = ucid;
	}
	public int getLeituraAnterior() {
		return leituraAnterior;
	}
	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}
	public int getLeituraAnual() {
		return leituraAnual;
	}
	public void setLeituraAnual(int leituraAnual) {
		this.leituraAnual = leituraAnual;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String toString() {
		String texto = "";
		
		texto = "-------------------------------------------"
				+"\n UCID: " + getUcid()
				+"\n Cliente: " + getCliente()
				+"\n Leitura Anterior: " + getLeituraAnterior()
				+"\n Leitura Atual: " + getLeituraAnual()
				+"\n Endereço: " + getEndereco();
		
		return texto;
	}
	public int faturar(int leitura) {
		leitura += leituraAnterior + leituraAnual;
		return leitura;
		
	}
	
	public 
}
