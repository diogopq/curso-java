package br.com.bytebank.banco.teste;

// Ctrl + Shift + O, gera os imports necessarios.
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		try (ContaCorrente cc = new ContaCorrente(111, 111)){
			cc.deposita(100);
			//cc.saca(180);
			cc.transfere(10, cp);
			System.out.println("CC " + cc.getSaldo());
		}catch(IllegalArgumentException ex) {
			System.out.println("Deu erro na construcao da conta corrente");
		}
		
		;
		System.out.println("CP " +cp.getSaldo());

	}

}
