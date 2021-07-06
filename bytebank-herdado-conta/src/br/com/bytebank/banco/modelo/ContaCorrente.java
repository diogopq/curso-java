package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	private CalculadorImposto calculador;
	
	
	
	public ContaCorrente (int agencia, int numero) {
		super(agencia, numero);
		this.calculador = new CalculadorImposto();
	}
	
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}



	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}



	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}



	@Override
	public void close(){
		System.out.println("Fechando conexao");
		
	}
	
	@Override
	public String toString() {
		
		return "Conta corrente: " + super.toString();
	}



	
}
