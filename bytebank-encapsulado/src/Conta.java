

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou construindo uma conta de numero = " + this.numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // ou destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
		
	public void setNumero(int numero) {
		if(numero < 0) {
			System.out.println("Numero inv�lido");
			return;
		}
			this.numero = numero;
		
		
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Agencia invalida");
			return;
		}
			this.agencia = agencia;
		
		
	}
	
	public void setCliente(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}

}