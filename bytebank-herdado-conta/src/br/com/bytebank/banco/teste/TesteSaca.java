package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		//Full Qualified Name = FQN
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(250);
		try {
		cc.saca(300);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
	}
}
