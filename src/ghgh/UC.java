package ghgh;

public class UC {
	
	private int ucid;
	private Cliente cliente;
	private int leituraAnterior;
	private int leituraAtual;
	private Endereco endereco;
	
	public UC(int ucid, int leituraAnterior, int leituraAtual, Endereco endereco, Cliente cliente) {
		this.ucid = ucid;
		this.endereco = endereco;
		this.leituraAnterior = leituraAnterior;
		this.leituraAtual = leituraAtual;
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
	public int getLeituraAtual() {
		return leituraAtual;
	}
	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
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
				+"\n Leitura Atual: " + getLeituraAtual()
				+"\n Endereço: " + getEndereco();
		
		return texto;
	}
	public int faturar(int leitura) {
		
		
		int consumo;
		int corrente = leitura;
		
		
		leituraAnterior = leituraAtual;
		leituraAtual = corrente;
		consumo = leituraAtual - leituraAnterior;
		
		return consumo;
		
	}
	
	public int pegarConsumo(int consumo) {
		
		consumo = leituraAtual - leituraAnterior;
		
		return consumo;
	}
}
