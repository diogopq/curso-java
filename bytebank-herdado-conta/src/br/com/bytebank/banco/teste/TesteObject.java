package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cl = new Cliente();
		

		System.out.println(cc);
		System.out.println(cp);

		println(cl);
		println(cc);
		println(cp);

		println();

	}

	static void println() {

	}

	static void println(int a) {

	}

	static void println(boolean valor) {

	}

	static void println(Object referencia) {

	}

	
}