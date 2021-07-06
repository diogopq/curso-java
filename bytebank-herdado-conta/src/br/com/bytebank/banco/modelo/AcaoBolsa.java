package br.com.bytebank.banco.modelo;

public class AcaoBolsa implements Tributavel{

	private CalculadorImposto calculador;
	
	public AcaoBolsa() {
		this.calculador = new CalculadorImposto();
}

	@Override
	public double getValorImposto() {
		return 33;
	}

}