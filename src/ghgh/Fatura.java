package ghgh;

public class Fatura {
	
	private int faturaId;
	private int mesAno;
	private UC unidadeConsumidora;
	private int consumo;
	private boolean pago;

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public int getMesAno() {
		return mesAno;
	}

	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}

	public UC getUnidadeConsumidora() {
		return unidadeConsumidora;
	}

	public void setUnidadeConsumidora(UC unidadeConsumidora) {
		this.unidadeConsumidora = unidadeConsumidora;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double calcularValorFatura() {
		double valor = 0;
		double tarResidencial1 = 0.38790;
		double tarResidencia2 = 0.04500;
		double tarComercial1 = 0.42550;
		double tarComercial2 = 0.45113;
		double icms = 27;
		double taxaIluminacaoPublica = 7.8;
		
		
		
		return valor;
	}
	
	public String toString() {
		String text = "";
		
		
		
		return text;
	}
	
	public void imprimirFatura() {
				
		
	}
}
