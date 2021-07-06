package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Diogo Jannuzzi
 *
 */

public abstract class Conta implements AutoCloseable{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para iniciar o objeto Conta com 2 parametros.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		if(agencia <0) {
			throw new IllegalArgumentException("Agencia invalida");
		}
		if(numero < 0) {
			throw new IllegalArgumentException("Numero Invalido");
		}
		Conta.total ++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou construindo uma conta de numero = " + this.numero);
	}
	
	
	public abstract void deposita(double valor) ;

	/**
	 * Valor precisa ser maior que o Saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente, o saldo é de: " + this.saldo + ", o valor a sacar é de: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
		
	public void setNumero(int numero) {
		if(numero < 0) {
			System.out.println("Numero inválido");
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
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}

}
