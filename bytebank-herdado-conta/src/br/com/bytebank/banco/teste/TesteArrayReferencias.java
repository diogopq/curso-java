package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
//import java.util.Scanner;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
//		Scanner texto = new Scanner(System.in);
//		
//		String [] nomes = new String[4];
//		
//		for(int i=0; i < nomes.length; i++) {
//			System.out.println("Insira um nome");
//			String nome = texto.nextLine();
//			nomes[i] = nome;
//		}
//		
//		for(int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		
		ContaCorrente[] contas = new ContaCorrente[5]; // neste momento nenhum objeto é criado, apenas o array com 5 referencias.
		
		ContaCorrente cc1 = new ContaCorrente(111, 212);
		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(111, 211);
		
		contas[1] = cc2;
		
		System.out.println(contas[1].getAgencia());
		
	}
}
