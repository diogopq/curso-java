package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		
		return o1.getIdade()-o2.getIdade(); //se o primeiro for menor que o segundo retorna -1, se for igual = 0, se for maior retorna numero positivo.
	}

}
