package ghgh;

public class UC {
	
	private int ucid;
	//cliente
	private int leituraAnterior;
	private int leituraAnual;
	private Endereco endereco;
	
	public UC(int ucid, int leituraAnterior, int leituraAnual, Endereco endereco) {
		this.ucid = ucid;
		this.endereco = endereco;
		this.leituraAnterior = leituraAnterior;
		this.leituraAnual = leituraAnual;

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
	public 
}
