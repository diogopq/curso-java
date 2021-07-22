package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	
	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> ordem = letras.iterator();
		
		while(ordem.hasNext()) {
			System.out.println(ordem.next());
		}
		
	}
}
