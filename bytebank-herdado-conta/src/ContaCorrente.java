
public class ContaCorrente extends Conta implements Tributavel{

	private CalculadorImposto calculador;
	
	
	
	public ContaCorrente (int agencia, int numero) {
		super(agencia, numero);
		this.calculador = new CalculadorImposto();
	}
	
	
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}



	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}



	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}



	
}
