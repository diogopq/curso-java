
public class SeguroVida implements Tributavel{

	private CalculadorImposto calculador;
	
	public SeguroVida() {
		this.calculador = new CalculadorImposto();
	}
	
	@Override
	public double getValorImposto() {
		return 42;
	}

}
