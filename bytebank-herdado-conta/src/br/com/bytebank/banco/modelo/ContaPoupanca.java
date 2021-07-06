package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta implements AutoCloseable {


	
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("FEchando sistema");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Poupança: " + super.toString();
	}
}
