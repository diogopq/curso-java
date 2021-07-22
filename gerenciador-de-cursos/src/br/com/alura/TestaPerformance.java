package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<Integer>();

		long inicio = System.currentTimeMillis();
		long inicioFor = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}
		long fimFor = System.currentTimeMillis();
		long tempoDeExecucaoFor = fimFor - inicioFor;

		System.out.println("Tempo de adição dos numeros: " + tempoDeExecucaoFor);

		long inicioFor2 = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);

		}
		long fimFor2 = System.currentTimeMillis();
		long tempoDeExecucaoFor2 = fimFor2 - inicioFor2;
		System.out.println("Tempo de busca pelo contain dos numeros: " + tempoDeExecucaoFor2);

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
