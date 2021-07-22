package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		
		
		nomesParaIdade.keySet().forEach(nome ->{
			System.out.println(nome);
		});
		
		nomesParaIdade.values().forEach(idade ->{
			System.out.println(idade);
		});
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> entry : associacoes) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
